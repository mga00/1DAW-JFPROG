package com.gsd.daw.prog;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		password p1=new password(15);
		/*System.out.println(p1.getContraseña());
		password p2=new password(30);
		password p3=new password(50);
		password p4=new password(20);
		password p5=new password();
		System.out.println(p2.getContraseña());
		System.out.println(p3.getContraseña());
		System.out.println(p4.getContraseña());
		System.out.println(p5.getContraseña());
		*/
		password[] pass=new password[5];
		for (int i = 0; i < pass.length; i++) {
			pass[i]=new password(i*8+
					20);
		}
		/*pass[0]=p1;
		pass[1]=p2;
		pass[2]=p3;
		pass[3]=p4;
		pass[4]=p5;
		*/
		for (int i = 0; i < pass.length; i++) {
			if(pass[i].esFuerte()) {
				System.out.println(pass[i].getContraseña()+ " es fuerte");
			}else {
				System.out.println(pass[i].getContraseña()+ " no es fuerte");
			}
		}
	}
}
