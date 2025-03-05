package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nombre;
	private List<Estudiante> estudiantes = new ArrayList<>();
	
	public void addEstudiante(Estudiante e) {
		
	}
	public void mostrarEstudiantes() {
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i).toString());
		}
	}
}
