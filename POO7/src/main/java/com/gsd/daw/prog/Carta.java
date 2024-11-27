package com.gsd.daw.prog;

public class Carta {
	private int num;
	private String palo;
	public Carta(int num, String palo) {
		this.num = num;
		this.palo = palo;
	}
	public int getNum() {
		return num;
	}
	public String getPalo() {
		return palo;
	}
	@Override
	public String toString() {
		return "Carta [num=" + num + ", palo=" + palo + "]";
	}
	
}
