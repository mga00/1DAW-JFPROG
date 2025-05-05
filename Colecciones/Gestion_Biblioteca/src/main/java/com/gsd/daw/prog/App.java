package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		Biblioteca b1=new Biblioteca();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Elige una opcion:");
			System.out.println("1.Añadir libro");
			System.out.println("2.Eliminar libro");
			System.out.println("3.Buscar libros por autor");
			System.out.println("4.Mostrar inventario");
			System.out.println("5.Actualizar precio");
			int opcion=sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Titulo: ");
				String titulo= sc.nextLine();
				System.out.println("Autor: ");
				String autor= sc.nextLine();
				System.out.println("ISBN: ");
				String isbn= sc.nextLine();
				System.out.println("Precio: ");
				double precio= sc.nextDouble();
				sc.nextLine();
				b1.addLibro(new Libro(titulo, autor, isbn, precio));
				break;
			case 2:
				System.out.println("ISBN: ");
				String isbnEliminar= sc.nextLine();
				b1.eliminarLibro(isbnEliminar);
				break;
			case 3:
				System.out.println("Autor: ");
				String autorBuscar= sc.nextLine();
				b1.librosPorAutor(autorBuscar);
				break;
			case 4:
				b1.librosDisp();
				break;
			case 5:
				System.out.println("ISBN: ");
				String isbnActLibro= sc.nextLine();
				System.out.println("Nuevo precio: ");
				double nuevoPrecio= sc.nextDouble();
				b1.precioActu(isbnActLibro, nuevoPrecio);
				break;
			}
		}
	}
}
