package com.gsd.daw.prog;

public class App {
	
	public static void main(String[] args) {
		Termostato t1=new Termostato("Bosch");
		Luz l1=new Luz("Philips");
		//se puede crear un array de una clase abstracta pero no un objeto de una clase abstracta
		DispElectronico [] d1 = new DispElectronico [2];
		d1[0]=l1;
		d1[1]=t1;
		
		for (int i = 0; i < d1.length; i++) {
			d1[i].encender();
		}
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i].toString());
		}
		System.out.println("------------");
		for (int i = 0; i < d1.length; i++) {
			d1[i].apagar();
		}
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1[i].toString());
		}
		
	}
}
