package com.gsd.daw.prog;

public class Agenda {
	
	private static final int MAX = 10; //constante
	private int tam;
	private Contacto [] agenda;
	
	public Agenda(int tam) {
		this.tam = tam;
		agenda = new Contacto [tam];
	}
	public Agenda() {
		this.tam = MAX;
		agenda = new Contacto [tam];
	}
	public void addContacto(Contacto c) {
		if(huecosLibres()==0) {
			System.out.println("No hay espacio");
			return;
		}
		if(existeContacto(c)) {
			System.out.println("Ya está en mi agenda");
			return;
		}
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i]==null) {
				agenda[i]=c;
				return;
			}
		}
	}
	public boolean existeContacto(Contacto c) {
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i]==null) {
				continue;
			}
			if(c.getNombre().equalsIgnoreCase(agenda[i].getNombre())) {
				return true;
			}
		}
		return false;
	}
	public void listarContactos() {
		if(huecosLibres() == agenda.length) {
			System.out.println("Agenda vacia");
		}else {
			for (int i = 0; i < agenda.length; i++) {
				if(agenda[i]==null) {
					continue;
				}
				System.out.println(agenda[i].toString());
			}
		}
	}
	public void eliminarContacto(Contacto c) {
		for (int i = 0; i < agenda.length; i++) {
			//if(c == agenda[i])//probamos
			if (agenda[i].getNombre().equalsIgnoreCase(c.getNombre())) {
				agenda[i]=null;
				System.out.println("Contacto eliminado");
				return;
			}
		}
		System.out.println("No existe este contacto");
	}
	public void buscarContacto (String nombre) {
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i]==null) {
				continue;
			}
			if(agenda[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("El numero de "+nombre+" es: "+agenda[i].getTlf());
				return;
			}
		}
		System.out.println(nombre+" no está en la agenda");
	}
	public boolean agendaLlena() {
		return huecosLibres() == 0;//reutilización de código de la función huecosLibres
	}
	public int huecosLibres() {
		int devolver = 0;
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i]==null) {
				devolver++;
			}
		}
		return devolver;
	}
	
}
