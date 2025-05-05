package com.gsd.daw.prog;

public enum Equipo {
	REAL_MADRID("Real Madrid", 1),BARCELONA("Barça", 2), GIRONA("Girona", 3), ATLETI("Atletico del Madrid", 4);
	
	private String nombre;
	private int posicion;
	
	private Equipo (String n, int p) {
		this.nombre=n;
		this.posicion=p;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}
	
}
