package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Trabajador;
import com.example.demo.dto.Trabajo;
import com.example.demo.services.TrabajadorService;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {

	@Autowired
	TrabajadorService trabajadorService;
	
	@GetMapping("/all")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorService.listarTrabajadores();
	}
	
	@GetMapping("/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Integer id) {	
		return trabajadorService.trabajadorXID(id);
	}
		
	@PostMapping("/add")
	public Trabajador guardarTrabajador(@RequestBody Trabajador trabajador) {		
		return trabajadorService.guardarTrabajador(trabajador);
	}
	
	@PutMapping("/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Integer id, @RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= trabajadorService.trabajadorXID(id);
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setApellido(trabajador.getApellido());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		
		trabajador_actualizado = trabajadorService.actualizarTrabajador(trabajador_seleccionado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarTrabajador(@PathVariable Integer id) {
		trabajadorService.eliminarTrabajador(id);
	}
	
	
}