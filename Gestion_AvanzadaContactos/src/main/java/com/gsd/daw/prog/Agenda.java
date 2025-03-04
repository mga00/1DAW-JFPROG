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
		if (contactos.contains(nombre)) {
			orden_contactos.add(nombre);
			telContactos.get(nombre).add(telefono);
		} else {

		}
	}
}
