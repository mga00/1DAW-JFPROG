package com.gsd.daw.prog;

public class Termostato extends DispElectronico{
	 private double temp;

	public Termostato(String nombre) {
		super(nombre);
		this.temp = 0;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public void encender() {
		setEstado(true);
		temp=20;
	}

	@Override
	public void apagar() {
		setEstado(false);
		temp=0;
	}

	@Override
	public String toString() {
		return "Termostato [temp=" + temp + "]"+super.toString();
	}
	
	 
}
