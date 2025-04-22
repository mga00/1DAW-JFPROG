package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		//sumar dos numeros con funciones lambda
		Sumar suma = (a,b) -> a+b;
		System.out.println(suma.aplicar(4, 5));
		//multiplicar dos numeros
		Sumar mult = (a,b) -> a*b;
		System.out.println(mult.aplicar(4, 5));
		//saludar a una lista de nombres
		List<String> nombres = new ArrayList<String>();
		nombres.add("Maria");
		nombres.add("Juan");
		nombres.add("Pepe");
		nombres.add("Marta");
		nombres.add("Ana");
		nombres.add("Adrián");
		nombres.forEach(n -> System.out.println("Hola " + n));
		//Filtrar elementos de una lista (los que empiezan por "A")
		//voy a usar la lista anterior para este ejercicio
	}
}
