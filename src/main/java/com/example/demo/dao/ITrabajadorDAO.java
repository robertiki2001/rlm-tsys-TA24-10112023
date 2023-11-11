package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Integer>{
	
}
