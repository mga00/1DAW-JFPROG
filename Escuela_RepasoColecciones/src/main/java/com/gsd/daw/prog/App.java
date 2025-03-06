package com.gsd.daw.prog;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Colegio c=new Colegio();
		Scanner sc= new Scanner(System.in);
		boolean respuesta= true;
		while(respuesta=true) {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Matricular estudiante");
			System.out.println("2. Desmatricular estudiante");
			System.out.println("3. Cambiar estudiante de curso");
			System.out.println("4. Crear nuevo curso");
			System.out.println("5. Buscar estudiante");
			System.out.println("6. Inscribir estudiante en un curso");
			System.out.println("7. Asignar una calificacion");
			System.out.println("8. Mostrar promedio de un curso");
			System.out.println("9. Obtener los dos mejores estudiantes de un curso");
		}
		sc.nextLine();
		int opcion=sc.nextInt();
		switch (opcion) {
		case 1: {
			System.out.println("Nombre:");
			String nombre=sc.nextLine();
			System.out.println("Correo:");
			String correo=sc.nextLine();
			Estudiante e=new Estudiante(nombre, correo);
			c.matEstudiante(e);
			break;
		}
		case 2: {
			
			break;
		}
		case 3: {
			
			break;
		}
		case 4: {
			Curso c1= new Curso();
			break;
		}
		case 5: {
			
			break;
		}
		case 6: {
			
			break;
		}
		case 7: {
			
			break;
		}
		case 8: {
			
			break;
		}
		case 9: {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}
}
