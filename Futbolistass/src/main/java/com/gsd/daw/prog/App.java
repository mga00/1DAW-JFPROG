package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		Futbolista f1 =new Futbolista ("Asencio", 35, Demarcacion.DEFENSA, Equipo.REAL_MADRID);
		System.out.println(f1.toString());
		f1.bajarPos();
		System.out.println(f1.toString());
	}
}
