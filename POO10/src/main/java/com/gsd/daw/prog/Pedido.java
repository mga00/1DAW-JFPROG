package com.gsd.daw.prog;

public class Pedido {
	private String codPedido;
	private String plato;
	private double precio;
	private int cantidad;
	private static int contador=0;
	
	public Pedido(String plato, double precio, int cantidad, int mesa) {
		this.codPedido = generarCodigo(plato, mesa);
		this.plato = plato;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	private String generarCodigo(String plato, int mesa) {
		this.contador++;
		return ""+mesa+contador+plato.charAt(0)+plato.charAt(1);
	}

	public String getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", plato=" + plato + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}
	
	
	
}
