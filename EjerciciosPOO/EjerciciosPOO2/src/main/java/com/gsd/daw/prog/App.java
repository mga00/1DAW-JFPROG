package com.gsd.daw.prog;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Fecha f1=new Fecha (25,2, 2004);
		f1.setMes(-5);//con la correccion de errores el mes vuelve a ser febrero(2)
		for (int i = 0; i < 30; i++) {
			System.out.println(f1.toString());
			f1.nextDay();
		}
	}
}
