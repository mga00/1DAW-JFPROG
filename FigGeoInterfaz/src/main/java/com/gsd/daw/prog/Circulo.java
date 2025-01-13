package com.gsd.daw.prog;

//implements sirve para implementar una interfaz
public class Circulo implements FiguraGeometrica{

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return PI*radio*radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2*PI*radio;
	}
	
	
}
