package com.gsd.daw.prog;

public class Estudiante {
	private String nombre;
	private String correo;
	private int id;
	
	public Estudiante(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
		this.id=1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", correo=" + correo + ", id=" + id + "]";
	}
	
	
}
