package com.gsd.daw.prog;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	
	public Espectador(String nombre, int edad, int dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	

	public Espectador() {
		this.nombre = "";
		this.edad = 0;
		this.dinero = 0;
	}
	
	/*public boolean puedePasar(Cine cine) {
		if(this.dinero<cine.getPrecio()) {
			return false;
		}
		if(this.edad<cine.getPelicula().getEdadMinima()) {
			return false;
		}
		return true;
	}*/
	
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
}
