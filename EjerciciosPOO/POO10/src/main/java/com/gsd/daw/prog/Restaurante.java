package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurante {
	private String nombre;
	private int cantidadMesas;
	private double caja;
	private Mesa[] mesas;
	private String [] menu;
	private double [] precio;
	
	public Restaurante(String nombre, int cantidadMesas,double [] precio, double caja, String[] menu) {
		this.nombre = nombre;
		this.cantidadMesas = cantidadMesas;
		this.caja = caja;
		this.menu = menu;
		mesas=new Mesa[cantidadMesas];
		for (int i = 0; i < cantidadMesas; i++) {
			mesas[i]=new Mesa(i+1,4);
		}
		this.precio=precio;
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadMesas() {
		return cantidadMesas;
	}

	public double getCaja() {
		return caja;
	}

	public Mesa[] getMesas() {
		return mesas;
	}

	public void registrarPedido(int mesa) {
		System.out.println("Dime que plato quieres del menu del dia");
		Scanner t=new Scanner (System.in);
		String plato =t.nextLine();
		Arrays.sort(menu);
		int pos =Arrays.binarySearch(menu, plato);
		if(pos==-1) {
			System.err.println("Ese plato no está");
			return;
		}
		System.out.println("Cuantos quieres?");
		int cant=t.nextInt();
		Pedido aux=new Pedido(plato,precio[pos],cant, mesa );
		mesas[mesa-1].addPedido(aux);
	}
	
	public void listarPedidosMesa(int mesa) {
		double total=0.0;
		Mesa aux=mesas[mesa];
		System.out.println(aux.totalMesa());
		aux.mostrarPlatos();
	}
	
	public void mostrarMesas() {
		double dev=0.0;
		for (int i = 0; i < mesas.length; i++) {
			dev+=mesas[i].totalMesa();
		}
		System.out.println("El total de las mesas es: "+dev);
	}
	
	public void eliminarPedidoMesa(int mesa, String codPedido) {
		mesas[mesa].delPedido(codPedido);
	}
	
	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", cantidadMesas=" + cantidadMesas + ", caja=" + caja + ", mesas="
				+ Arrays.toString(mesas) + ", menu=" + Arrays.toString(menu) + "]";
	}
	
	
	
}
