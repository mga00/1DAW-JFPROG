package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Colegio {
	List<Map<String, String>> incritos = new ArrayList<>();
	List<Estudiante> noInscritos = new ArrayList<>();
	
	public void incluirEstudiante() {
		
	}
	public void matEstudiante(Estudiante e) {
		if (noInscritos.contains(e)) {
			System.err.println("Error: Este estudiante ya está matriculado.");
			return;
		}
		noInscritos.add(e);
		System.out.println("Estudiante matriculado.");
	}
	public void desmatEstudiante(String nombre, String apellido1) {
		
	}
	public void buscarEstudiante(String nombre,String apellido1) {
		
	}
	
	
}
