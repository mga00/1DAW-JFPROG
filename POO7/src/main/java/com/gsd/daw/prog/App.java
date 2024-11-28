package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Baraja b1 = new Baraja ();
		b1.barajar();
		for (int i = 0; i < 4; i++) {
			System.out.println(b1.siguienteCarta());
		}
		System.out.println(b1.darCartas(40));
		b1.mostrarCartas();
		//System.out.println(b1.cartasMonton());
		
	}
}
