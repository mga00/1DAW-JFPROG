package com.gsd.daw.prog;

public class Fecha {
	public Fecha() {
		super();
		this.dia = 1;
		this.mes = 1;
		this.año = 1;
	}
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	private int dia;
	private int mes;
	private int año;
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		int aux=this.dia;
		this.dia = dia;
		if(!isCorrectDate()) {
			this.dia=aux;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		int aux=this.mes;
		this.mes = mes;
		if(!isCorrectDate()) {
			this.mes=aux;
		}
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	private boolean isbisiesto() {
		return ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0));
	}
	public boolean isCorrectDate() {
		if(mes==2) {
			if(isbisiesto()) {
				if(dia>29 || dia<1) {
					return false;
				}
			}
			else {
				if(dia>28 || dia<1) {
					return false;
				}
			}
		}
		if (mes==4 || mes==6 ||mes==9 ||mes==11) {
			if(dia>30 || dia<1) {
				return false;
			}
		}
		if(mes>12 || mes<1) {
			return false;
		}
		if(dia>31 || dia<1) {
			return false;
		}
		return true;
	}
	public void nextDay() {
		dia++;
		if(!isCorrectDate()) {
			dia=1;
			mes++;
			if(!isCorrectDate()) {
				mes=1;
				año++;
			}
		}
	}
	@Override
	public String toString() {
		String dia="",mes="";
		if(this.dia<10) {
			dia+="0";
		}
		if(this.mes<10) {
			mes+="0";
		}
		dia+=this.dia;
		mes+=this.mes;
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	
}
