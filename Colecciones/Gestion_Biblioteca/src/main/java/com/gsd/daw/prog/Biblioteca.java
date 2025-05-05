package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
	List<Libro>listaLibros = new ArrayList<>();
	Map<String, Set<Libro>> mapaAutores = new HashMap<>();
	Set<String> isbnSet = new HashSet<>();
	private final String ARCHIVO_INV="inventario.dat";
	
	public int contarEjemplares (String isbn) {
		int contador=0;
		for(Libro libro:listaLibros) {
			if(libro.getIsbn().equals(isbn)) {
				contador++;
			}
		}
		return contador;
	}
	
	public void addLibro(Libro libro) {
		if(isbnSet.contains(libro.getIsbn())) {
			listaLibros.add(libro);
		}else {
			listaLibros.add(libro);
			isbnSet.add(libro.getIsbn());
			if (mapaAutores.containsKey(libro.getAutor())) {
				mapaAutores.get(libro.getAutor()).add(libro);
			}else {
				mapaAutores.putIfAbsent(libro.getAutor(), new HashSet<>());
				mapaAutores.get(libro.getAutor()).add(libro);
			}
		}
	}
	public void eliminarLibro(String isbn) {
		if (!isbnSet.contains(isbn)) {
			System.err.println("Error: No existe ningun libro con ese isbn");
			return;
		}else {
			if (contarEjemplares(isbn)>1) {
				Iterator<Libro> iterador = listaLibros.iterator();
			    while (iterador.hasNext()) {
			        if (iterador.next().getIsbn().equals(isbn)) {
			            iterador.remove();
			            System.out.println("Libro eliminado");
			            return;
			        }
			    }
			} else {
				Iterator<Libro> iterador1 = listaLibros.iterator();
			    while (iterador1.hasNext()) {
			        if (iterador1.next().getIsbn().equals(isbn)) {
			            iterador1.remove();
			            break;
			        }
			    }
			    isbnSet.remove(isbn);
			    for (String autor : mapaAutores.keySet()) {
			        Set<Libro> librosDelAutor = mapaAutores.get(autor);
			        boolean eliminado = librosDelAutor.removeIf(libro -> libro.getIsbn().equals(isbn));
			        if (eliminado && librosDelAutor.isEmpty()) {
			            mapaAutores.remove(autor);
			        }
			        System.out.println("Libro eliminado");
			    }     
			}
		}	
	}
	public void librosDisp() {
		if(listaLibros.size()<1) {
			System.out.println("Todavia no hay libros disponibles.");
			return;
		}
		for(Libro l:listaLibros) {
				System.out.println(l.toString());
			}
		}
	public void precioActu(String isbn, double precio) {
		if (!isbnSet.contains(isbn)) {
			System.err.println("Error: No hay ningun libro con ese isbn");
		}
		for(Libro l:listaLibros) {
			if(l.getIsbn().equals(isbn)) {
				l.setPrecio(precio);
			}
		}
	}
	public void librosPorAutor(String autor) {
		Set<Libro> libros = mapaAutores.get(autor);
		if (libros==null || libros.isEmpty()) {
			System.err.println("Error: No se encontraron libros para el autor "+autor);
		}else {
			libros.forEach(System.out:: println);
		}
	}
}
