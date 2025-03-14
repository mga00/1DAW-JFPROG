package com.gsd.daw.prog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Gestion {
	Map<String, Set<Estudiantes>> participantes;
	Set<Proyecto> proyectos;
	Map<String, List<String>> proyEstudiante;
	Set<String> estados;
	Map<String, List<Proyecto>> estadosProy;
	
	public Gestion() {
		this.participantes = new HashMap<>();
		this.proyectos = new HashSet<>();
		this.proyEstudiante = new HashMap<>();
		this.estados = new HashSet<>();
		this.estadosProy = new HashMap<>();
	}
	public void registrarProyectos(Proyecto p) {
		if (proyectos.contains(p)) {
			System.err.println("Error: el proyecto ya existe.");
			return;
		}
		proyectos.add(p);
	}
	public void asignarEstudiante (Estudiantes e, Proyecto p) {
		if(participantes.containsValue(e)) {
			System.err.println("Error: el estudiante ya está asignado a este proyecto.");
			return;
		}
		Set<Estudiantes> part = participantes.get(p.getTitulo());
		part.add(e);
		participantes.put(p.getTitulo(), part);
		e.proyectos.add(p.getTitulo());
		p.participantes.add(e);
	}
	public void buscarProy(Estudiantes e) {
		System.out.println("Los proyectos en los que participa el estudiante son:");
		for (String tit : e.proyectos) {
			System.out.println(tit);
		}
	}
	
	
}
