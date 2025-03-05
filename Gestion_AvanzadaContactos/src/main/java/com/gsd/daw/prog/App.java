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
		Agenda a1=new Agenda();
		boolean pregunta=true;
		while(pregunta=true) {
			System.out.println("Elige una opción:");
			System.out.println("1.Buscar contacto por nombre");
			System.out.println("2.Eliminar un contacto");
			System.out.println("3.Añadir un contacto");
			System.out.println("4.Eliminar un telefono de un contacto");
			System.out.println("5.Mostrar la lista de contactos");
			System.out.println("6.Exportar la agenda a un archivo de texto");
			System.out.println("7.Importar la agenda desde una archivo de texto");
			int opcion=sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1: {
				a1.buscarPorNombre(nombre);
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 2: {
				a1.eliminarContacto(nombre);
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 3: {
				a1.addContacto(nombre, tel);
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 4: {
				a1.eliminarTel(nombre, tel);
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 5: {
				a1.ordenLista();
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 6: {
				
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			case 7: {
				
				System.out.println("¿Quieres hacer algo más?");
				String respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("no")) {
					pregunta=false;
					return;
				}else {
					pregunta=true;
					break;
				}
			}
			default:
				throw new IllegalArgumentException("Valor no válido: " + opcion);
			}
		}
	}
}
