package com.gsd.daw.prog;

public abstract class Guitarra {
	private String marca;
	private String modelo;
	private int numCuerdas;
	private double precio;
	
	public Guitarra(String marca, String modelo, int numCuerdas, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numCuerdas = numCuerdas;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", modelo=" + modelo + ", numCuerdas=" + numCuerdas + ", precio=" + precio;
	}
	
	
}
