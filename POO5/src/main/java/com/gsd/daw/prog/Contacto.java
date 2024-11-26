package com.gsd.daw.prog;

public class Contacto {
	
	private String nombre;
	private String tlf;
	public Contacto(String nombre, String tlf) {
		this.nombre = nombre;
		this.tlf = tlf;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTlf() {
		return tlf;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", tlf=" + tlf + "]";
	}
	
}
