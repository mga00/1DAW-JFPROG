package com.gsd.daw.prog;

import java.util.Scanner;

/**
 * Hola Mundo!
 */
public class App {
	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int op;
		Agenda a1=new Agenda(5);
		do {
		System.out.println("Indica que quieres hacer en la agenda");
		System.out.println("1. Añadir contacto");
		System.out.println("2. Eliminar contacto");
		System.out.println("3. Listar contactos");
		System.out.println("4. Buscar contacto");
		System.out.println("5. Existe contacto");
		System.out.println("6. Huecos libres");
		System.out.println("7. Agenda llena");
		System.out.println("0. Salir");
		op=t.nextInt();
		t.nextLine();		
		switch (op) {
		case 1:
			
			System.out.println("Dime el nombre y el telefono para crear el telefono");
			String nombre=t.nextLine();
			String tlf=t.nextLine();
			a1.addContacto(new Contacto (nombre,tlf));
			break;
		
		case 2:
			System.out.println("Dime el nombre y el telefono para eliminar el telefono");
			String nombre1=t.nextLine();
			String tlf1=t.nextLine();
			a1.eliminarContacto(new Contacto (nombre1,tlf1));
			break;
		
		case 3:
			a1.listarContactos();
			break;
		
		case 4:
			System.out.println("A quién buscas?");
			String nombre2=t.nextLine();
			a1.buscarContacto(nombre2);
			break;
		case 5: 
			System.out.println("Dime el nombre para BUSCAR el contacto");
			nombre=t.nextLine();
			if(a1.existeContacto(new Contacto(nombre, ""))) {
				System.out.println("Si existe");
			}
			System.out.println("No existe");
			break;
		case 6:
			System.out.println("El numero de huecos libres es: "+a1.huecosLibres());
			break;
		case 7:
			if(a1.agendaLlena()) {
				System.out.println("La agenda está llena");
			}else {
				System.out.println("La agenda no está llena");
			}break;
		case 0:
			System.out.println("Adiós");
			break;
		default:
			System.err.println("Datos erroneos");;
		}
		}while(op!=0);
}
}
