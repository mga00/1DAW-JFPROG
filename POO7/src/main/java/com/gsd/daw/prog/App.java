package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Baraja b1 = new Baraja ();
		Carta c1 = new Carta (3,"bastos");
		b1.barajar();
		//b1.mostrarCartas();
		Carta c2 = b1.siguienteCarta();
		System.out.println(c2.toString());
	}
}
