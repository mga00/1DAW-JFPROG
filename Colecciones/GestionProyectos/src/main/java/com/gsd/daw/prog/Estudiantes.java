package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
	private int id;
	private String nombre;
	int contador;
	List<String> proyectos = new ArrayList<>();

	public Estudiantes(String nombre) {
		this.id = contador++;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getContador() {
		return contador;
	}

	public List<String> getProyectos() {
		return proyectos;
	}
	
	
}
