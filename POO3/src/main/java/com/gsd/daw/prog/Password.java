package com.gsd.daw.prog;

public class Password {
	private static final int DEFAULT = 8;
	private int longitud;
	private String contraseña;
	
	
	
	public Password (int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	public Password () {
		this.longitud = DEFAULT;
		this.contraseña = generarPassword();
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	

	public boolean esFuerte() {
		//BUENA
		if (longitud < 11) {
			return false;
		}
		
		int contMayusculas = contarMayus();
		if(contMayusculas < 3) return false;
		
		int contMinusculas = contarMinus();
		if(contMinusculas < 2) return false;
		
		int contNumeros = contarNum();
		if(contNumeros < 6) return false;
		
		return true;
	}
	
	private int contarMinus() {
		int num = 0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isLowerCase(contraseña.charAt(i))) {
				num++;
			}
			if(num > 2) {
				return 2;
			}
		}
		return num;
	}
	
	private int contarMayus() {
		int num = 0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isUpperCase(contraseña.charAt(i))) {
				num++;
			}
			if(num > 3) {
				return 3;
			}
		}
		return num;
	}
	
	private int contarNum() {
		int num = 0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isDigit(contraseña.charAt(i))) {
				num++;
			}
			if(num > 6) {
				return 6;
			}
		}
		return num;
	}
	
	public String generarPassword () {
		// BUENA
		String devolver ="";
		for (int i = 0; i < longitud; i++) {
			devolver += (char) ((Math.random()*93)+33);
		}
		return devolver;
	}
}
