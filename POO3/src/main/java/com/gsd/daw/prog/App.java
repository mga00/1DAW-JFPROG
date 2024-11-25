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
		
		Password [] pass = new Password[5];
		for(int i = 0; i < pass.length; i++) {
			pass[i] = new Password(40);
		}
		
		for (int i = 0; i < pass.length; i++) {
			if(pass[i].esFuerte()) {
				System.out.println("Contraseña: " + pass[i].getContraseña()+ " | Es fuerte");
			}else {
				System.out.println("Contraseña: " + pass[i].getContraseña()+ " | No es fuerte");
			}
		}
	}
}
