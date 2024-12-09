package com.gsd.daw.prog;

public class Butaca {
	private String columna;
	private String fila;
	private Espectador e;
	
	public Butaca(String columna, String fila) {
		this.columna = columna;
		this.fila = fila;
		this.e=null;
	}

	public String getColumna() {
		return columna;
	}

	public void setColumna(String columna) {
		this.columna = columna;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Espectador getE() {
		return e;
	}

	public void setE(Espectador e) {
		this.e = e;
	}

	public void sentarEspectador(Espectador e) {
		this.e=e;
		
	}
	
	public boolean estaLibre() {
		if(e==null) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Butaca [columna=" + columna + ", fila=" + fila + ", e=" + e + "]";
	}
	
	
	
}
