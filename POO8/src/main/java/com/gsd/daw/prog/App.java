package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Pelicula p1=new Pelicula("Rosa","Manuel", 2.40, 18);
		Cine c1=new Cine(p1, 10);
		Espectador e1=new Espectador("Pepe", 18, 40);
		Espectador e2=new Espectador("Maria", 3, 20);
		Espectador e3=new Espectador("Juan", 34, 9);
		Espectador e4=new Espectador("Juan", 54, 40);
		c1.sentar(e4);c1.sentar(e3);c1.sentar(e2);c1.sentar(e1);
		System.out.println(c1.toString());
	}
}
