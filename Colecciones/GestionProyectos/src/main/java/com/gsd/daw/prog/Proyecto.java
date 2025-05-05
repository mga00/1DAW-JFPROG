package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Proyecto {
	private String titulo;
	private String descripcion;
	private String fechaInicio;
	private String fechaFin;
	Set<Estudiantes> participantes = new HashSet<>();
	
	public Proyecto(String titulo, String descripcion, String fechaInicio, String fechaFin) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.participantes = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public Set<Estudiantes> getParticipantes() {
		return participantes;
	}
	
	
}
