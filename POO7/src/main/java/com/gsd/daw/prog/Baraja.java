package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

	private Carta [] baraja;
	private int contadorCartas;
	
	public Baraja() {
		baraja= new Carta[40];
		contadorCartas=0;
		inicializarBaraja();
	}
	
	public void inicializarBaraja() {
		String [] palos = {"oros","copas","bastos","espadas"};
		for (String palo : palos) {
			for (int num = 1; num <= 12; num++) {
				if(num!=8 && num!=9) {
					baraja[contadorCartas] = new Carta(num, palo);
					contadorCartas++;
				}
			}
		}
	}
	
	public void barajar() {
		Random random =new Random();
		for (int i = baraja.length-1; i > 0; i--) {
			int j =random.nextInt(i+1);
			Carta temp =baraja[i];
			baraja[i]=baraja[j];
			baraja[j]=temp;
		}
	}
	
	public Carta siguienteCarta() {
		Carta siguiente = baraja[0];
		return siguiente;
	}
	
	public void mostrarCartas() {
		for (int i = 0; i < contadorCartas; i++) {
			System.out.print(baraja[i]+" ");
		}
	}
	
}
