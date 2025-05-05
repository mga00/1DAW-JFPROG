package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Futbolista f1 =new Futbolista ("Asencio", 35, Demarcacion.DEFENSA, Equipo.REAL_MADRID);
		System.out.println(f1.toString());
		f1.bajarPos();
		System.out.println(f1.toString());
	}
}
