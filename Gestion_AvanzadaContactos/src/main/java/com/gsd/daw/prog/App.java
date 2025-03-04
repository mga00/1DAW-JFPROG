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
		String [] datos=args[0].split(":");
		Scanner sc=new Scanner(System.in);
		String nombre=datos[0];
		String tel=datos[1];
		while(true) {
			System.out.println("Elige una opción:");
			System.out.println("1.Buscar contacto por nombre");
			System.out.println("2.Eliminar un contacto");
			System.out.println("3.Añadir un contacto");
			System.out.println("4.Eliminar un telefono de un contacto");
			System.out.println("5.Mostrar la lista de contactos");
			System.out.println("6.Exportar la agenda a un archivo de texto");
			System.out.println("7.Importar la agenda desde una rchivo de texto");
			int opcion=sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1: {
				
			}
			case 2: {
				
			}
			case 3: {
				
			}
			case 4: {
	
			}
			case 5: {
	
			}
			case 6: {
	
			}
			case 7: {
	
			}
			default:
				throw new IllegalArgumentException("Valor no válido: " + opcion);
			}
		}
	}
}
