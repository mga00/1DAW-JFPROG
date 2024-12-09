package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Random;

public class Cine {
	
	private String nombre;
	private Pelicula p;
	private double precio;
	private Butaca [][] patio;
	private int columnas;
	private int filas;
	private int[] array;
	
	public Cine(Pelicula p, double precio,int filas, int columnas) {
		this.p=p;
		this.filas = filas;
		this.columnas=columnas;
		this.precio = precio;
		this.patio=generarButacas(filas,columnas);
	}
	
	private  Butaca[][] generarButacas(int f, int c){
		//columnas==letras
		Butaca [][] devolver=new Butaca[f][c];
		for (int i = filas; i > 0; i--) {
			char letra='A';
			for (int j = 0; j < c; j++) {
				devolver[i][j]=new Butaca(Character.toString(letra), Integer.toString(i));
				letra++;
			}
		}
		return devolver;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setP(Pelicula p) {
		this.p = p;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPatio(Butaca[][] patio) {
		this.patio = patio;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public Pelicula getPelicula() {
		return p;
	}
	public double getPrecio() {
		return precio;
	}
	
	public int huecosLibres() {
		int devolver=0;
		for (int i = 0; i < patio.length; i++) {
			for (int j = 0; j < patio[i].length; j++) {
				if(patio[i][j]==null) {
					devolver++;
				}
			}
		}
		return devolver;
	}
	
	public boolean asignarButacaEspectador(Espectador e) {
		if(e.getEdad()<p.getEdadMinima()) {return false;}
		if(e.getDinero()<this.precio) {return false;}
		if(huecosLibres()==0) {return false;}
		int fila_aleatoria;
		int columna_aleatoria;
		boolean sentado=false;
		
		do {
			fila_aleatoria=(int) ((Math.random()*filas))+1;
			columna_aleatoria=(int) ((Math.random()*columnas))+1;
			if(patio[fila_aleatoria][columna_aleatoria]==null) {
				patio[fila_aleatoria][columna_aleatoria].sentarEspectador(e);
				e.setDinero(e.getDinero()-this.precio);
				sentado=true;
			}
			
		}while(!sentado);
		return true;
	}
	
	public void mostrarPatio() {
		for (int i = 0; i < patio.length; i++) {
			for (int j = 0; j < patio[i].length; j++) {
				if(patio[i][j]==null) {
					System.out.println(patio[i][j].getFila()+""+patio[i][j].getColumna());
				}else {
					System.out.println(" ");
					
				}
			}
		}
	}
	
}
