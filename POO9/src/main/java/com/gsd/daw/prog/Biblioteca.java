package com.gsd.daw.prog;

import java.util.Random;

public class Biblioteca {
	private String nombre;
	private Libro[] libros;
	private Usuario[] socios;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Libro[] getLibros() {
		return libros;
	}
	public Usuario[] getSocios() {
		return socios;
	}
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.libros = null;
		this.socios = null;
	}
	public void addLibro(Libro libro) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i]==null) {
				libros[i]=libro;
				return;
			}
		}
	}
	public void prestarLibro(Libro libro, Usuario usuario) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i].getTitulo().equals(libro.getTitulo())) {
				libros[i]=null;
				usuario.tomarPrestado(libro);
			}
		}
	}
	public void altaUsuario(Usuario usuario) {
		Random rand=new Random((9)*5);
		String letra0=Character.toString(Character.toUpperCase(usuario.getNombre().charAt(0)));
		String letra1=Character.toString(Character.toUpperCase(usuario.getNombre().charAt(1)));
		String numSocio=letra0+letra1+rand;
		for (int i = 0; i < socios.length; i++) {
			if(socios[i]==null) {
				socios[i]=usuario;
				usuario.setNumSocio(numSocio);
			}
		}
	}
	public void bajaUsuario(String numSocio) {
		for (int i = 0; i < socios.length; i++) {
			if(numSocio.equalsIgnoreCase(socios[i].getNumSocio())) {
				socios[i]=null;
				if(socios[i].getLibrosPrestados()!=null) {
					for (int j = 0; j < socios[i].getNumLibrosPrestados(); j++) {
						socios[i].getLibrosPrestados()[j].devolver();
					}
				}
			}
		}
	}
}
