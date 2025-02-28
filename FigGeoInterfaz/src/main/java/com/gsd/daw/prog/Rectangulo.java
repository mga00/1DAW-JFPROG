package com.gsd.daw.prog;

public class Rectangulo implements FiguraGeometrica{

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*base+2*altura;
	}
	
	
}
