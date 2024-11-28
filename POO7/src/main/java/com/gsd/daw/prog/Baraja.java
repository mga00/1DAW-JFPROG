package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

	private Carta [] baraja;
	private int contadorCartas;
	private int indice=0;
	
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
	
	public String siguienteCarta() {
		if(indice<baraja.length) {
			Carta siguiente = baraja[indice++];
			return siguiente.toString();
		}
		return "No hay más cartas";
	}
	
	public int cartasDisponibles() {
		return baraja.length-indice;
	}
	
	public String cartasMonton() {
		String barajaFin="";
		if(indice==0) {
			System.out.println("No se ha sacado ninguna carta todavía.");
		}
		for (int i = indice-1; i >= 0; i--) {
			barajaFin+=baraja[i].toString();
		}
		return barajaFin;
	}
	
	public String mostrarBaraja() {
		String barajaFin="";
		for (int i = indice; i < baraja.length; i++) {
			barajaFin+=baraja[indice].toString();
			indice++;
		}
		return barajaFin;
	}
	
	public String darCartas(int num) {
		String cartasPedidas="";
		if(this.baraja.length-indice<num) {
			System.err.println("No hay suficientes cartas");
			return "";
		}
		for (int i = 0; i < num; i++) {
			cartasPedidas+=baraja[indice++];
		}
		return cartasPedidas;
	}
	
	public void mostrarCartas() {
		for (int i = 0; i < contadorCartas; i++) {
			System.out.print(baraja[i]+" ");
		}
	}
	
}
