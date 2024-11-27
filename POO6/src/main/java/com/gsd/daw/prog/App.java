package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Cuenta c1 = new Cuenta ("Pepe");
		Cuenta c2 = new Cuenta ("Maria");
		System.out.println(c2.toString());
		c2.setTipoInteres(12.8);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.trasferencia(c2, 41.5);
	}
}
