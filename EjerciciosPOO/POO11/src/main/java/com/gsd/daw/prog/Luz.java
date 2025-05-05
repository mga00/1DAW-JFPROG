package com.gsd.daw.prog;

public class Luz extends DispElectronico{
	private int intensidad;

	public Luz(String nombre) {
		super(nombre);
		this.intensidad = 0;//al crear una bombilla la intensidad es 0
	}

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	@Override
	public void encender() {
		setEstado(true);
		this.intensidad=20;//20 por ejemplo
		
	}

	@Override
	public void apagar() {
		setEstado(false);
		this.intensidad=0;
	}

	@Override
	public String toString() {
		return "Luz [intensidad=" + intensidad + "]"+ super.toString();//para que no se pierda lo del dispElectronico
	}
	
	
}
