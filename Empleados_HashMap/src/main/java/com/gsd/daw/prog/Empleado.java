package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String DNI;
	private int salario;
	private List<String> titulos=new ArrayList<>();
	
	public Empleado(String nombre, String dNI, int salario, List<String> titulos) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.salario = salario;
		this.titulos = titulos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public List<String> getTitulos() {
		return titulos;
	}
	public void setTitulos(List<String> titulos) {
		this.titulos = titulos;
	}
	public String getDNI() {
		return DNI;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", DNI=" + DNI + ", salario=" + salario + ", titulos=" + titulos + "]";
	}
	
}
