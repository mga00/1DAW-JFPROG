package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		GuitarraAcustica ga1=new GuitarraAcustica("Tayson", "A43", 4, 240.5, "Roble");
		GuitarraElectrica ge1=new GuitarraElectrica("Craight","GU67",5,378.99,"Aletas");
		Guitarra[] guitarras=new Guitarra [2];
		guitarras[0]=ga1;
		guitarras[1]=ge1;
		for (int i = 0; i < guitarras.length; i++) {
			System.out.println(guitarras[i].toString());
		}
	}
}
