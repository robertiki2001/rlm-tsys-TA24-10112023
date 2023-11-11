package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table (name = "trabajador")
public class Trabajador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	@Enumerated(EnumType.STRING)
	@Column(name="trabajo")
	private Trabajo trabajo;
	private Double salario;
	
	
	  public Trabajador() {
	    }

	  
	    public Trabajador(String nombre, String apellido, Trabajo trabajo ) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.trabajo = trabajo;
	        this.salario = trabajo.getSalarioTrabajo();;
	        
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public Trabajo getTrabajo() {
	        return trabajo;
	    }

	    public void setTrabajo(Trabajo trabajo) {
	       this.trabajo = trabajo;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }
	    
	    public double getSalario() {
			return trabajo.getSalarioTrabajo();
	    }
	
	

}
