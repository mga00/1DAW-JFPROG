package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Random;

public class Cine {
	boolean[][] sala=new boolean[8][9];
	private Pelicula pelicula;
	private double precio;
	private String[] columna= {"A","B","C","D","E","F","G","H","I"};
	private int[] fila= {8,7,6,5,4,3,2,1};
	
	/*public String[][] asignacionAsientos() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				sala[i][j]=columna[j]+fila[i];
			}
		}
		return sala;
	}*/
	public boolean[][] Cine() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				sala[i][j]=true;
			}
		}
		return sala;
	}
	
	@Override
	public String toString() {
		String fin= "";
		for (int i = 0; i < this.sala.length; i++) {
			for (int j = 0; j < this.sala[i].length; j++) {
				if(j!=this.sala[i].length-1) {
					fin+=this.sala[i][j]+" ";
				}else
					fin+=this.sala[i][j];
			}
			if(i<=this.sala.length-1) {
				fin+="\n";	
			}
		}
		return fin;
	}
	
	public boolean butacasLibres() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if(sala[i][j]==true) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void sentar(Espectador e) {
		if(!e.puedePasar(this)) {
			System.err.println(e.getNombre()+", no tienes edad o dinero suficiente para entrar");
		}else {
			if(!butacasLibres()) {
				System.err.println("No hay butacas libres");
				return;
			}
			Random rand=new Random();
			String columnaFin="";
			for (int fila = 0; fila < sala.length; fila++) {
				for (int j = 0; j < sala[fila].length; j++) {
					if(sala[fila][j]==true) {
						sala[fila][j]=false;
						switch (j) {
							case 0: {columnaFin+="A";break;}
							case 1: {columnaFin+="B";break;}
							case 2: {columnaFin+="C";break;}
							case 3: {columnaFin+="D";break;}
							case 4: {columnaFin+="E";break;}
							case 5: {columnaFin+="F";break;}
							case 6: {columnaFin+="G";break;}
							case 7: {columnaFin+="H";break;}
							case 8: {columnaFin+="I";break;}
						
						}
						System.out.println("Espectador: "+e.getNombre()+" sentado en la butaca: "+(8-fila)+columnaFin);
						return;
					}
				}
			}
		}
		
	}
	

	public Cine(Pelicula pelicula, double precio) {
		super();
		this.sala = Cine();
		this.pelicula = pelicula;
		this.precio = precio;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean[][] getSala() {
		return sala;
	}
	
	
}
