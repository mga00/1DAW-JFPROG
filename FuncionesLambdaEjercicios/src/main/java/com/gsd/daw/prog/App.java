package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
	public static void main(String[] args) {
		//filtrar una lista de enteros pares
		
		System.out.println("----Ejercicio 1----");
		List <Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		numeros.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		//ordenar una lista de cadenas por longitud
		
		System.out.println("----Ejercicio 2----");
		List<String> palabras = Arrays.asList("Java","Lambda","Stream","API");
		palabras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palabras);
		
		//imprimir cada elemento en mayusculas
		
		System.out.println("----Ejercicio 3----");
		List<String> nombres1 = Arrays.asList("ana","luis","carlos","maria");
		nombres1.forEach(s -> System.out.println(s.toUpperCase()));
		
		//contar cuantas palabras tienen mas de 4 letras
		
		System.out.println("----Ejercicio 4----");
		List<String> lista = Arrays.asList("sol","ordenador","mesa","ventana");
		long count = lista.stream()
					.filter(s -> s.length() > 4)
					.count();
		System.out.println("Palabras con mas de 4 letras: "+count);
		
		//agrupar personas por edad
		
		System.out.println("----Ejercicio 5----");
		record Persona (String nombre, int edad) {}
		List <Persona> personas = Arrays.asList(new Persona("Ana", 20),new Persona("Luis", 30),new Persona("Marta", 24),new Persona("Carlos", 32),
			new Persona("Pedro", 25));
		personas.sort(Comparator.comparingInt(Persona :: edad));
		for (Persona p : personas) {
			System.out.println(p.nombre()+" - "+p.edad());
		}
		
		// obtener los nombres de personas mayores de edad
		
		System.out.println("----Ejercicio 6----");
		List <Persona> gente = Arrays.asList(new Persona("Ana", 17),new Persona("Luis", 30),new Persona("Marta", 20),new Persona("Carlos", 16),
				new Persona("Pedro", 25));
		gente.stream()
			.filter(p -> p.edad() >= 18)
			.map(Persona::nombre)
			.forEach(System.out::println);
		
		//Concatenar todas las palabras en una sola cadena separada por guiones
		
		System.out.println("----Ejercicio 7----");
		List<String> sinConcatenar = List.of("hola", "mundo", "java", "animal");
		String resultado = sinConcatenar.stream()
				.collect(Collectors.joining("-"));
		System.out.println(resultado);
		
		//Eliminar duplicados de una lista
		
		System.out.println("----Ejercicio 8----");
		List<String> duplicados = List.of("java", "python", "java", "animal", "ir", "python");
		List<String> sinDuplicados = duplicados.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(sinDuplicados);
		
		//Obtener la suma de los cuadrados de una lista
		
		System.out.println("----Ejercicio 9----");
		List<Integer> sinCuadrados = List.of(1,2,3,4,5);
		int sumaCuadrados = sinCuadrados.stream()
				.map(n -> n * n)
				.reduce(0, Integer::sum);
		System.out.println(sumaCuadrados);
		
		//Obtener la palabra más larga
		
		System.out.println("----Ejercicio 10----");
		List<String> palabraMasLarga = List.of("java", "python", "javaScript", "animal", "ir");
		String resultadoPalabra = palabraMasLarga.stream()
				.max(Comparator.comparing(String::length))
				.orElse("No hay palabras");
		System.out.println(resultadoPalabra);
		
	}
}
