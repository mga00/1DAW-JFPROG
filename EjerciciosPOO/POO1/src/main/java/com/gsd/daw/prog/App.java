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
		Viajero v1 = new Viajero();
		v1.setNombre("Pepe");
		Viajero v2 = new Viajero("12345678-P","Lolo","Blas","Lituano","BuenaVista");
		System.out.println(v2.getInfo());
		System.out.println(v1.getContador());
	}
}
