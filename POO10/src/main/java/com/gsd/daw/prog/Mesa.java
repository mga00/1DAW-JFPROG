package com.gsd.daw.prog;

import java.util.Arrays;

public class Mesa {
	private int num;
	private Pedido[] pedidos;
	private int comensales;
	
	public Mesa(int num, int comensales) {
		this.num = num;
		pedidos = new Pedido[0];//podria servir el null
		this.comensales = comensales;
	}

	public int getNum() {
		return num;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}
	
	public void addPedido(Pedido p) {
		if(pedidos==null) {
			pedidos=new Pedido[1];
			pedidos[0]=p;
			return;
		}
		Pedido[] aux =new Pedido[pedidos.length+1];
		System.arraycopy(pedidos, 0, aux, 0, pedidos.length);
		aux[pedidos.length]=p;
		pedidos=aux;
		return;
	}
	
	public void mostrarPlatos() {
		for (int i = 0; i < pedidos.length; i++) {
			System.out.println(pedidos[i].getPlato());
		}
	}
	
	public double totalMesa() {
		double dev=0.0;
		for (int i = 0; i < pedidos.length; i++) {
			dev+=pedidos[i].getPrecio();
		}
		return dev;
	}
	
	public void delPedido(String codPedido) {
		int pos=buscarPedido(codPedido);
		if(pos==-1) return;
		Pedido[] aux=new Pedido[pedidos.length-1];
		System.arraycopy(pedidos, 0, aux, 0, pos);
		System.arraycopy(pedidos, pos+1, aux, pos, pedidos.length-pos);
		pedidos=aux;
	}
	
	private int buscarPedido(String codPedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if(codPedido.equalsIgnoreCase(pedidos[i].getCodPedido())) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Mesa [num=" + num + ", pedidos=" + Arrays.toString(pedidos) + ", comensales=" + comensales + "]";
	}
	
	
}
