package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Cuenta c1 = new Cuenta ("Pepe", "1234", 12.80, 40.5);
		Cuenta c2 = new Cuenta ("Maria", "2345", 0.0, 20.5);
		System.out.println(c2.toString());
		c2.setTipoInteres(12.8);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.trasferencia(c2, 41.5);
	}
}
