package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
	List<Libro>listaLibros = new ArrayList<>();
	Map<String, Set<Libro>> mapaAutores = new HashMap<>();
	Set<String> isbnSet = new HashSet<>();
	private final String ARCHIVO_INV="inventario.dat";
	
	public void addLibro(Libro libro) {
		if (isbnSet.contains(libro.getIsbn())) {
			System.out.println("Error: el ISBN ya existe en el inventario");
			return;
		} else {
			listaLibros.add(libro);
			libro.setContador(libro.getContador()+1);
			isbnSet.add(libro.getIsbn());
			mapaAutores.putIfAbsent(libro.getAutor(), new HashSet<>());
		}
	}
	public void eliminarLibro(String isbn) {
		if (isbnSet.contains(isbn)) {
		}else {
			System.out.println("No existe ningun libro con ese isbn");
		}
	}
	/*public List librosDisp() {
		
	}
	
	public void precioActu(String isbn) {
		
	}
	public List librosPorAutor(String autor) {
		
	}*/
}
