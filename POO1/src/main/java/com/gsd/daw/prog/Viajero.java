package com.gsd.daw.prog;

public class Viajero {
	
	private static int contador = 0;
	private String dni;
	private String nombre;
	private String apellidos;
	private String nacion;
	private String direccion;
	
	public Viajero(String dni, String nombre, String apellidos, String nacion, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacion = nacion;
		this.direccion = direccion;
		contador++;
	}
	
	public Viajero () {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.nacion = "";
		this.direccion = "";
		contador++;
	}
	
	
	// Para dni
	public String getDni() { return dni; }
	public void setDni(String dni) { this.dni = dni; }
	
	// Para nombre
	public String getnombre() { return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	// Para apellidos
	public String getApellidos() { return apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }
	
	// Para nacion
	public String getNacion() { return nacion; }
	public void setNacion(String nacion) { this.nacion = nacion; }
	
	// Para direccion
	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion; }
	
	
	public String getInfo() {
		return "Nombre: "+nombre+"\nApellidos: "+apellidos+"\nDni: "+dni+"\nNacionalidad: "+nacion+"\nDireccion: "+direccion;
	}
	
	public int getContador() { return contador; }
}
