package com.gsd.daw.prog;

public class Libro {
	private String titulo;
	private String autor;
	private String anoPub;
	private Categoria cat;
	
	public Libro(String titulo, String autor, String anoPub, Categoria cat) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.cat = cat;
	}
	
}
