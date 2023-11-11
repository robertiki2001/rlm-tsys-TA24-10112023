package com.example.demo.dto;

public enum Trabajo {
	
	Secretario(1580.25), 
	Electricista(2200.45),
	Profesor(2580.32),
	DJ(10000.50),
	Abogado(3500.10);
	
	double salario;

	Trabajo(double salario) {
		this.salario = salario;
	}

	public double getSalarioTrabajo() {
		return salario;
	}

}