package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPU {
	int quantum;
	List <Proceso> l =new ArrayList <Proceso>();

	public CPU(int quantum, List<Proceso> l) {
		this.quantum = quantum;
		this.l = l;
	}

	@Override
	public String toString() {
		return "CPU [quantum=" + quantum + ", l=" + l + "]";
	}
	
}
