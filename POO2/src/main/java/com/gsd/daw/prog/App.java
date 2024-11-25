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
		Persona p1 = new Persona ();
		System.out.println(p1.toString());
		Persona p2 = new Persona ("Pepa",15, "j");
		System.out.println(p2.toString());
		Persona p3 = new Persona ("Lolo",20, "H");
		System.out.println(p3.toString());
		
		p1.setAltura(1.55);
		p1.setEdad(52);
		p1.setNombre("Joaquín");
		p1.setPeso(35);
		p1.setSexo("Y");
		
		Persona [] personas = new Persona[3]; 
		personas[0] = p1;
		personas[1] = p2;
		personas[2] = p3;
		
		for (int i = 0; i < personas.length; i++) {
			int imc = personas[i].calcularIMC();
			if(imc == -1) {
				System.out.println(personas[i].getNombre() + "estas flaco");
			}
			
			if(imc == 0) {
				System.out.println(personas[i].getNombre() + "estas normal");
			}
			if(imc == 1) {
				System.out.println(personas[i].getNombre() + "estas sobrepeso");
			}
			
			if (personas[i].esMayorDeEdad()) {
				System.out.println("Es mayor de edad");
			}else {
				System.out.println("No es mayor de edad");
			}
		}
		
	}
}
