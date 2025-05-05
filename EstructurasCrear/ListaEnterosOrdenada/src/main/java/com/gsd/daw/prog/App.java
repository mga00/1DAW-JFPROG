package com.gsd.daw.prog;


public class App {
	
	public static void main(String[] args) {
		
		ListaNodos lista = new ListaNodos();
		
		boolean vacio = lista.esVacia();
		if (!vacio) System.out.println("La lista no está vacía.");
		if (vacio) System.out.println("La lista está vacía.");
		
		lista.add(10);
		System.out.println("Elemento añadido");
		lista.add(5);
		System.out.println("Elemento añadido");
		lista.add(20);
		System.out.println("Elemento añadido");
		lista.add(15);
		System.out.println("Elemento añadido");
		
		boolean vacioDesp = lista.esVacia();
		if (!vacioDesp) System.out.println("La lista ya no está vacía.");
		if (vacioDesp) System.out.println("La lista todavia está vacía.");
		
	
		try {
			System.out.println("Elemento de la posicion 2: " + lista.get(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("El tamaño de la lista es: " + lista.size());
		lista.print();
		
		lista.remove(2);
		System.out.println("Elemento de la posicion 2 borrado.");
		lista.print();
		
		System.out.println("El tamaño de la lista es: " + lista.size());
		
		System.out.println("Estos son los elementos de la lista:");
		lista.print();
		
	}
}
