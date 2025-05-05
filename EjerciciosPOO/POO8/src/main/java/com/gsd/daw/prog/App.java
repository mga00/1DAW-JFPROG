package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Pelicula p1=new Pelicula("IT","Manuel", 2.40, 18);
		Cine c1=new Cine(p1,8.95,10,15);
		c1.mostrarPatio();
		
	}
}
