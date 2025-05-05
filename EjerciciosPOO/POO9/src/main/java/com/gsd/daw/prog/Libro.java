package com.gsd.daw.prog;

public class Libro {
	private String titulo;
	private String autor;
	private boolean prestado;
	
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = false;
	}
	public void prestar() {
		if(!prestado) {
			prestado=true;
			System.out.println("Libro prestado con exito");
		}else {
			System.err.println("El libro ya ha sido prestado.");
		}
	}
	public void devolver() {
		prestado=false;
		System.out.println("Libro devuelto con exito");
	}
	public String mostrarInformacion() {
		String infor="";
		infor+="Titulo: "+getTitulo()+" Autor: "+getAutor()+" Estado del libro: ";
		if(prestado) {
			infor+="disponible";
		}else {
			infor+="prestado";
		}
		return infor;
	}
	
}
