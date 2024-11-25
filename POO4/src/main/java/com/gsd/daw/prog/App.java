package com.gsd.daw.prog;

/**
 * Hola Mundo!
 */
public class App {
	/**
	 * Punto de entrada de la aplicación
	 *
	 * @param args
	 *            no se espera ningún parámetro.
	 */
	public static void main(String[] args) {
		Fecha f1 = new Fecha (25,12,2005);
		
		for (int i = 0; i < 30; i++) {
			System.out.println(f1.toString());
			f1.nextDay();
		}
	}
}
