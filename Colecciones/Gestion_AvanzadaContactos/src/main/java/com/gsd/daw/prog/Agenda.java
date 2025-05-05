package com.gsd.daw.prog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Agenda implements Serializable{
	Set<String> contactos=new HashSet<>();
	List<String> orden_contactos=new ArrayList<>();
	Map<String, List<String>> telContactos=new HashMap<>();
	
	public void addContacto (String nombre, String telefono) {
		if (!validarTel(telefono)) {
			System.err.println("Error: Telefono no valido");
			return;
		}
		if (contactos.contains(nombre)) {
			orden_contactos.add(nombre);
			telContactos.get(nombre).add(telefono);
			System.out.println("Telefono añadido.");
		} else {
			contactos.add(nombre);
			orden_contactos.add(nombre);
			telContactos.put(nombre, new ArrayList<>());
			telContactos.get(nombre).add(telefono);
			System.out.println("Telefono añadido.");
		}
	}
	public boolean validarTel(String telefono) {
		if(telefono.length()<7) {
			return false;
		}
		try {
            Integer.parseInt(telefono);
        } catch (NumberFormatException excepcion) {
        	return false;
        }
		return true;
	}
	public void buscarPorNombre(String nombre) {
		if (!contactos.contains(nombre)) {
			System.err.println("Error: el contacto no esta en la agenda.");
			return;
		} else {
			List <String> lista=telContactos.get(nombre);
			System.out.println("El contacto "+nombre+" tiene asociados los teléfonos:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		}
	}
	public void eliminarTel(String nombre, String telefono) {
		if (!validarTel(telefono)) {
			System.err.println("Error: Telefono no valido");
			return;
		}
		if (!contactos.contains(nombre)) {
			System.err.println("Error: El contacto no esta en la agenda.");
			return;
		}else {
			telContactos.get(nombre).remove(telefono);
			System.out.println("Telefono eliminado.");
		}
	}
	public void eliminarContacto(String nombre) {
		if (!contactos.contains(nombre)) {
			System.err.println("Error: el contacto no esta en la agenda.");
			return;
		}
		contactos.remove(nombre);
		for (int i = 0; i < orden_contactos.size(); i++) {
			if(orden_contactos.get(i).equalsIgnoreCase(nombre)) {
				orden_contactos.remove(i);
			}
		}
		telContactos.remove(nombre);
		System.out.println("Contacto eliminado.");
	}
	public void ordenLista() {
		List<String> listaDesorden=new ArrayList<String>(contactos);
		Collections.sort(listaDesorden);
		for (int i = 0; i < listaDesorden.size(); i++) {
			System.out.println(listaDesorden.get(i));
		}
	}
	@Override
	public String toString() {
		return "Agenda [contactos=" + contactos + ", orden_contactos=" + orden_contactos + ", telContactos="
				+ telContactos + "]";
	}
	
}
