package com.gsd.daw.prog;

public abstract class DispElectronico {
	private String nombre;
	private boolean estado;
	
	public DispElectronico(String nombre) {
		super();
		this.nombre = nombre;
		this.estado = false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "DispElectronico [nombre=" + nombre + ", estado=" + estado + "]";
	}

	public abstract void encender();
	public abstract void apagar();
	
}
