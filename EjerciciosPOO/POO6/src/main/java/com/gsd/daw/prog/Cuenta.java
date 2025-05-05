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

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String nombreCliente) {
		this.nombreCliente = nombreCliente;
		this.numCuenta = aleatorio();
		this.tipoInteres = 0.0;
		this.saldo = 0.0;
	}
	
	private String aleatorio() {
		String devolver="ES";
		devolver+=(int)(Math.random()*500000000);
		return devolver;
	}
	
	public Cuenta() {
		this.nombreCliente = "";
		this.numCuenta = aleatorio();
		this.tipoInteres = 0.0;
		this.saldo = 0.0;
	}
	
	public boolean reintegro(double num) {
		if(this.saldo<0 || this.saldo<num) {
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
		if(reintegro(saldo)) {
			b.ingreso(num);
			return true;
		}
		return false;
	}
	
	public boolean ingreso(double num) {
		if(num<0) {
			return false;
		}
		this.saldo+=num;
		return true;
	}
	
}
