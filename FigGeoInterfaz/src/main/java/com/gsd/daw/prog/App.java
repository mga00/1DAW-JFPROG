package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		
		FiguraGeometrica [] g1=new FiguraGeometrica[2];
		g1[0]=new Circulo (2.5);
		g1[1]=new Rectangulo(4,5);
		
		System.out.println("Areas");
		for (int i = 0; i < g1.length; i++) {
			System.out.println(g1[i].calcularArea());
		}
		System.out.println("Perímetros");
		for (int i = 0; i < g1.length; i++) {
			System.out.println(g1[i].calcularArea());
		}
	}
}
