package com.gsd.daw.prog;

public class GuitarraAcustica extends Guitarra{
	private String tipoMadera;

	public GuitarraAcustica(String marca, String modelo, int numCuerdas, double precio, String tipoMadera) {
		super(marca, modelo, numCuerdas, precio);
		this.tipoMadera = tipoMadera;
	}

	@Override
	public String toString() {
		return "GuitarraAcustica [tipoMadera=" + tipoMadera + ", "+super.toString()+"]";
	}
	
	public void ajustarMadera() {
		
	}
}
