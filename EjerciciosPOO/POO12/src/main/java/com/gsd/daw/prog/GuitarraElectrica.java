package com.gsd.daw.prog;

public class GuitarraElectrica extends Guitarra{
	private String tipoPastillas;

	public GuitarraElectrica(String marca, String modelo, int numCuerdas, double precio, String tipoPastillas) {
		super(marca, modelo, numCuerdas, precio);
		this.tipoPastillas = tipoPastillas;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [tipoPastillas=" + tipoPastillas + ", "+super.toString()+"]";
	}
	
}
