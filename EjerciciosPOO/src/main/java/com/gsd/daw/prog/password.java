package com.gsd.daw.prog;

public class password {

	public password(int longitud, String contraseña) {
		super();
		this.longitud = DEFAULT;
		this.contraseña = "";
	}
	public password() {
		super();
		this.longitud = DEFAULT;
		this.contraseña = generarPass();
	}
	public password(int n) {
		super();
		longitud = n;
		contraseña = generarPass();
	}
	private static final int DEFAULT=8;
	private int longitud;
	private String contraseña;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	private String generarPass() {
		String devolver="";
		for (int i = 0; i < longitud; i++) {
			devolver+=(char)((Math.random()*93)+33);
		}
		return devolver;
	}
	public boolean esFuerte() {
		if(longitud < 11) {return false;}
		int min=contarMinus();
		if(min < 2) {return false;}
		int may=contarMayus();
		if(may < 3) {return false;}
		int num=contarNums();
		if(num < 6) {return false;}
		return true;
	}
	private int contarMinus() {
		int num=0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isLowerCase(contraseña.charAt(i)));
			num++;
			if(num>2) return 2;
		}
		return num;
	}
	private int contarMayus() {
		int num=0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isUpperCase(contraseña.charAt(i)));
			num++;
			if(num>3) return 3;
		}
		return num;
	}
	private int contarNums() {
		int num=0;
		for (int i = 0; i < longitud; i++) {
			if(Character.isDigit(contraseña.charAt(i))) {
			num++;
			}
			if(num>6) return 6;
		}
		return num;
	}
	
	
	
	
}
