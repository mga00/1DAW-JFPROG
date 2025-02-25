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
			mapaAutores.get(libro.getAutor()).add(libro);
			System.out.println("Libro añadido");
		}
	}
	public void eliminarLibro(String isbn) {
		if (isbnSet.contains(isbn)) {
			listaLibros.removeIf(libro -> libro.getIsbn().equals(isbn));
			isbnSet.remove(isbn);
			mapaAutores.values().forEach(libros -> libros.removeIf(libro -> libro.getIsbn().equals(isbn)));
			System.out.println("Libro eliminado");
		}else {
			System.out.println("No existe ningun libro con ese isbn");
			return;
		}
	}
	/*public List librosDisp() {
		
	}
	
	public void precioActu(String isbn) {
		
	}*/
	public void librosPorAutor(String autor) {
		Set<Libro> libros = mapaAutores.get(autor);
		if (libros==null || libros.isEmpty()) {
			System.out.println("No se encontraron libros para el autor "+autor);
		}else {
			libros.forEach(System.out:: println);
		}
	}
}
