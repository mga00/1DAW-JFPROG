package com.gsd.daw.prog;

public class Usuario {
	private String nombre;
	private String numSocio;
	private Libro[] librosPrestados;
	private int numLibrosPrestados;
	
	public Libro[] getLibrosPrestados() {
		return librosPrestados;
	}
	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
	}
	public void setLibrosPrestados(Libro[] librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNumSocio() {
		return numSocio;
	}
	public Usuario(String nombre, String numSocio) {
		this.nombre = nombre;
		this.numSocio = numSocio;
		this.librosPrestados = null;
		this.setNumLibrosPrestados(0);
	}
	public void tomarPrestado(Libro libro) {
		if(libro.isPrestado()) {
			System.err.println("El libro ya esta prestado");
			return;
		}else {
			for (int i = 0; i < librosPrestados.length; i++) {
				if(librosPrestados[i]==null) {
					librosPrestados[i]=libro;
					libro.prestar();
					setNumLibrosPrestados(getNumLibrosPrestados() + 1);
					return;
				}
			}
		}
		
	}
	
	public void devolverLibro(Libro libro) {
		for (int i = 0; i < librosPrestados.length; i++) {
			if(librosPrestados[i].getTitulo().equals(libro.getTitulo())) {
				librosPrestados[i]=null;
				librosPrestados[i].devolver();
				setNumLibrosPrestados(getNumLibrosPrestados() - 1);
				return;
			}
		}
	}
	public int getNumLibrosPrestados() {
		return numLibrosPrestados;
	}
	public void setNumLibrosPrestados(int numLibrosPrestados) {
		this.numLibrosPrestados = numLibrosPrestados;
	}
}
