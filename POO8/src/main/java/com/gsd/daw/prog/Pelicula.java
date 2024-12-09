package com.gsd.daw.prog;

public class Pelicula {
	private String titulo;
	private double duracion;
	private int edadMinima;
	private String director;
	
	public Pelicula(String titulo, String director, double duracion, int edadMinima) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	/*public Pelicula() {
		this.titulo = "";
		this.duracion = 0;
		this.edadMinima = 0;
		this.director = "";
	}*/
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getEdadMinima() {
		return edadMinima;
	}
	
	public double getDuracion() {
		return duracion;
	}
	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director="
				+ director + "]";
	}
	
}
