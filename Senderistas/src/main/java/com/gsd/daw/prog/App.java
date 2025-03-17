package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Gestion  g = new Gestion();
		g.montañas.add("Everest");
		g.montañas.add("K2");
		g.montañas.add("Anapurna");
		g.montañas.add("Denali");
		g.addSendero("Sendero intermedio", "Everest");
		System.out.println("-------------------");
		g.mostrarMontSend();
		System.out.println("-------------------");
		g.addSenderista("Pepe");
		System.out.println("-------------------");
		g.addSenderista("Ana");
		System.out.println("-------------------");
		g.addSenderista("Leticia");
		System.out.println("-------------------");
		g.addSenderista("Pepe");
		System.out.println("-------------------");
		g.addSendero("Sendero avanzado", "Anapurna");
		System.out.println("-------------------");
		g.monstrarSend();
		System.out.println("-------------------");
		g.addSendero("Sendero base", "Teide");
		System.out.println("-------------------");
		g.monstrarSend();
		System.out.println("-------------------");
		g.recorrerSendero("Sendero intermedio", "Pepe");
		System.out.println("-------------------");
		g.recorrerSendero("Sendero base", "Leire");
		g.monstrarSend();
	}
}
