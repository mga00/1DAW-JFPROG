package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Gestion {
	List<String> montañas = new ArrayList<>();
	Map<String, List<String>> sendAsociados = new HashMap<>();
	Set<String> senderistas = new HashSet<>();
	
	public void addMontaña(String montaña) {
		if (montañas.contains(montaña)) {
			System.err.println("Error: la montaña ya esta registrada.");
			return;
		}
		montañas.add(montaña);
	}
	
	public void addSenderista(String send) {
		if (senderistas.contains(send)) {
			System.err.println("Error: el senderista ya esta registrado.");
			return;
		}
		Senderista s = new Senderista(send);
		senderistas.add(send);
		System.out.println("Senderista añadido.");
	}
	
	public void mostrarMontSend () {
		for (String mont : montañas) {
			if (sendAsociados.get(mont)==null) {
				System.out.println("La montaña "+mont+" no tiene senderos asociados.");
			} else {
				System.out.println("La montaña "+mont+" tiene los senderos:");
				System.out.println(sendAsociados.get(mont).toString());
			}
		}
	}
	public void addSendero(String sendero, String montaña) {
		List<String> l = new ArrayList<>();
		if (!montañas.contains(montaña)) {
			montañas.add(montaña);
			mostrarMontSend();
		}
		l.add(sendero);
		sendAsociados.put(montaña, l );
		System.out.println("Sendero añadido.");
	}
	public void monstrarSend() {
		for (String nombre : senderistas) {
			System.out.println(nombre+" ha recorrido los senderos:");
			Senderista s=new Senderista(nombre);
			System.out.println(s.senderosRecorridos.toString());
		}
	}
	public void recorrerSendero(String sendero, String senderista) {
		for (Map.Entry<String, List<String>> entry : sendAsociados.entrySet()) {
			if (entry.getValue().contains(sendero)) {
				//falta añadir a la lista de senderos recorridos del senderista
				
				System.out.println("Sendero recorrido");
				return;
			}
		}
		System.err.println("Error: El sendero no esta registrado.");
	}
	
}
