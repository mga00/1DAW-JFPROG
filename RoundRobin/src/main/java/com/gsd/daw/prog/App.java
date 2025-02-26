package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Proceso p1=new Proceso(1);
		Proceso p2=new Proceso(2);
		Proceso p3=new Proceso(3);
		Proceso p4=new Proceso(4);
		List <Proceso> l =new ArrayList <>();
		l.add(p1);l.add(p2);l.add(p3);l.add(p4);
		CPU cpu1=new CPU(12, l);
		
	}
}
