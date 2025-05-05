package com.gsd.daw.prog;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		super();
		this.dia = 1;
		this.mes = 1;
		this.anio = 1;
	}
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		int aux = this.dia;
		this.dia = dia;
		if (!isCorrectaDate()) {
			this.dia = aux;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		int aux = this.mes;
		this.mes = mes;
		if(!isCorrectaDate()) {
			this.mes = aux;
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	private boolean isBisiesto() {
		return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0));
	}
	
	public boolean isCorrectaDate() {
		if (mes == 2) {
			if(isBisiesto()) {
				if(dia > 29 || dia < 1) {
					return false;
				}
			}else {
					if(dia > 28 || dia < 1) {
						return false;
					}
			}
		}
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia > 30 || dia < 1) {
				return false;
			}
		}
			
		if(mes > 12 || dia < 1) {
			return false;
		}
			
		if (dia > 31 || dia < 1) {
			return false;
		}
		return true;
	}

	public void nextDay() {
		dia ++;
		if(!isCorrectaDate()) {
			dia = 1;
			mes++;
			if(!isCorrectaDate()) {
				mes = 1;
				anio++;
			}
		}
	}

	@Override
	public String toString() {
		String dia="", mes="";
		if (this.dia < 10) {
			dia += "0";
		}
		if (this.mes < 10) {
			mes += "0";
		}
		dia += this.dia;
		mes += this.mes;
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	
	
	
	
	
}
