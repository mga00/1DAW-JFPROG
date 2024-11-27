package com.gsd.daw.prog;

public class Cuenta {
	private String nombreCliente;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	public Cuenta() {
		this.nombreCliente = "";
		this.numCuenta = "";
		this.tipoInteres = 0.0;
		this.saldo = 0.0;
	}
	
	public boolean reintegro(double num) {
		if(this.saldo<0) {
			System.err.println("El reintegro no se puede realizar por falta de fondos");
			return false;
		}
		if(this.saldo<num) {
			return false;
		}
		this.saldo-=num;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", numCuenta=" + numCuenta + ", tipoInteres=" + tipoInteres
				+ ", saldo=" + saldo + "]";
	}

	public boolean trasferencia(Cuenta b,double num) {
		if(this.saldo<num) {
			System.err.println("La trasferencia no se puede realizar por falta de fondos");
			return false;
		}
		this.saldo-=num;
		b.saldo+=num;
		return true;
	}
	
	public boolean ingreso(double num) {
		if(num<0) {
			return false;
		}
		this.saldo+=num;
		return true;
	}
	
}
