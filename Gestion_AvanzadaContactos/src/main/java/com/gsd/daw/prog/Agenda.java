package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Agenda {
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
			//TO-DO terminar
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
			
		}
	}
}
