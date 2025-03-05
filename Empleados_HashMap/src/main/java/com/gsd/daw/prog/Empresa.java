package com.gsd.daw.prog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Empresa {
	Map<String, Empleado> empleados=new HashMap<>();
	
	public void addEmpleado(Empleado e) {
		empleados.put(e.getDNI(), e);
	}
	public void mostrarEmpleados() {
		
	}
	public void mostrarSalario() {
		for (String clave : empleados.keySet()) {
			System.out.println(empleados.get(clave).getNombre()+" tiene un salario de "+
			empleados.get(clave).getSalario());
		}
	}
	public void salarioPromedio() {
		int salarioProm=0;
		int contador=0;
		for (String clave : empleados.keySet()) {
			salarioProm+=empleados.get(clave).getSalario();
			contador++;
		}
		salarioProm=salarioProm/contador;
		System.out.println("El salario promedio es: "+salarioProm);
	}
	public void aumentarSalario (int porcentaje) {
		for (String clave : empleados.keySet()) {
			int salEmp=empleados.get(clave).getSalario();
			salEmp+=((salEmp*porcentaje)/100);
		}
	}
	public void añadirTitulacion(String titulo, String DNI) {
		for (String clave : empleados.keySet()) {
			if(empleados.get(clave).getDNI().equalsIgnoreCase(DNI)) {
				empleados.get(clave).getTitulos().add(titulo);
			}
		}
	}
}
