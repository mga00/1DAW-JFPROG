package com.gsd.daw.prog;

import java.util.Random;

public class Proceso {
	int pID;
	Random quantum=new Random(50);
	public Proceso(int pID) {
		this.pID = pID;
		this.quantum = new Random(50);
	}
	@Override
	public String toString() {
		return "Proceso [pID=" + pID + ", quantum=" + quantum + "]";
	}
	
}
