package com.gsd.daw.prog;

public class Estudiante {
	private String nombre;
	private String apeliido1;
	private String apellido2;
	private String correo;
	private int id;

	public Estudiante(String nombre, String correo) {
		this.nombre = nombre;
		this.apeliido1=apeliido1;
		this.apeliido2=apeliido2;
		this.correo = correo;
		String[] letrasNombre= nombre
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

}
