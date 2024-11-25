package com.gsd.daw.prog;

public class Persona {
	private static final String SEXO = "M";
	private static final int FLACO = -1;
	private static final int NORMAL = 0;
	private static final int SOBREPESO = 1;
	
	private String nombre;
	private int edad;
	private String sexo;
	private String dni;
	private double peso;
	private double altura;	
	
	
	public Persona (String nombre, int edad, String sexo, String dni, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generarDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso; 
		this.altura = altura; 
		
	}
	
	public Persona () {
		this.nombre = "Usar constantes";
		this.edad = edad;
		this.dni = generarDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso; 
		this.altura = altura; 
		
	}
	
	public Persona (String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generarDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso; 
		this.altura = altura; 
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
	public int calcularIMC() {
		double imc = peso/ (altura*altura);
		if (imc < 20) return FLACO;
		if (imc > 25) return SOBREPESO;
		return NORMAL;
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	private String comprobarSexo(String s) {
		if("H".equalsIgnoreCase(s)) {
			return "H";
		}
		return SEXO;
	}
	
	@Override 
	public String toString() {
		return "Persona [nombre=" + nombre +",edad=" + edad + ", dni="+ dni + ",altura=" + altura + "]";
	}
	
	private String generarDNI() {
		int num = (int) (Math.random()*100000000);
		String letras = "TRWAGMYFPDXBMJZSQVHLCKE";
		return "" + num + letras.charAt(num%23);
	}
}

