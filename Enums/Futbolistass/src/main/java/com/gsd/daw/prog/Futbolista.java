package com.gsd.daw.prog;

public class Futbolista {
	private String nombre;
	private int dorsal;
	private Demarcacion dem;
	private Equipo eq;
	
	public Futbolista(String nombre, int dorsal, Demarcacion dem, Equipo eq) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.dem = dem;
		this.eq = eq;
	}
	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", dorsal=" + dorsal + ", dem=" + dem + ", eq=" + eq + ", posicion= "+eq.getPosicion()+ "]";
	}
	
	public void bajarPos() {
		if (this.eq.getPosicion() == Equipo.values().length) return;
		this.eq.setPosicion(eq.getPosicion()+1);
	}
}
