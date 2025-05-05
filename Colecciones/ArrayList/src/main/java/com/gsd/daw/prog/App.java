package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		List <Integer> l=new ArrayList<Integer>();
		Scanner t=new Scanner (System.in);
		int num;
		do {
			num=t.nextInt();
			if(num!=-99) {
				l.add(num);
			}
		} while (num!=-99);
		System.out.println(l.toString());
		System.out.println("El numero de valores leidos es: "+l.size());
		int suma=0;
		for (int i = 0; i < l.size(); i++) {
			suma+=l.get(i);
		}
		int media=suma/l.size();
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La media de los numeros es: "+suma/l.size());
		for (Integer numero : l) {
			System.out.println(numero);
			if (numero>media) {
				System.out.println("es mayor que la media");
			}
		}
		l.remove(0);
		System.out.println(l.toString());
	
	}
}
