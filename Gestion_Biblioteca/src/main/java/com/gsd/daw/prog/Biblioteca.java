package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*funcion para contar cuantos libros con mismo isbn hay en la lista de los libros en biblioteca porque la lista de libros si permite
tener libros repetidos pero en el set de isbn no.*/
public class Biblioteca {
	List<Libro>listaLibros = new ArrayList<>();
	Map<String, Set<Libro>> mapaAutores = new HashMap<>();
	Set<String> isbnSet = new HashSet<>();
	private final String ARCHIVO_INV="inventario.dat";
	
	public void addLibro(Libro libro) {
		if (!listaLibros.contains(libro)) {
			listaLibros.add(libro);
			libro.setContador(libro.getContador()+1);
			isbnSet.add(libro.getIsbn());
			mapaAutores.putIfAbsent(libro.getAutor(), new HashSet<>());
			mapaAutores.get(libro.getAutor()).add(libro);
			System.out.println("Libro añadido");
		}else {
			for(Libro l:listaLibros) {
				if(l.getIsbn().equals(libro.getIsbn())) {
					l.setContador(l.getContador()+1);
					System.out.println("Ejemplar añadido");
				}
			}
		}
	}
	public void eliminarLibro(String isbn) {
		if (isbnSet.contains(isbn)) {
			//probar con iterador
			for(Libro l:listaLibros) {
				if(l.getIsbn().equalsIgnoreCase(isbn)) {
					if(l.getContador()>1) {
						l.setContador(l.getContador()-1);
					}
				}
			}
			listaLibros.removeIf(libro -> libro.getIsbn().equals(isbn));
			isbnSet.remove(isbn);
			mapaAutores.values().forEach(libros -> libros.removeIf(libro -> libro.getIsbn().equals(isbn)));
			System.out.println("Libro eliminado");
		}else {
			System.err.println("Error: No existe ningun libro con ese isbn");
			return;
		}
	}
	public void librosDisp() {
		Libro ultimoLibro=listaLibros.get(listaLibros.size()-1);
		for(Libro l:listaLibros) {
			if (l==ultimoLibro) {
				System.out.println(l.toString());
			}else {
				System.out.println(l.toString()+"<br>");
			}
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
