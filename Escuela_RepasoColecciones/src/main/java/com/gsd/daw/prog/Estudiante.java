package com.gsd.daw.prog;

public class Estudiante {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String correo;
	private int id;

	public Estudiante(String nombre, String correo) {
		this.nombre = nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
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
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", correo="
				+ correo + ", id=" + id + "]";
	}

}
