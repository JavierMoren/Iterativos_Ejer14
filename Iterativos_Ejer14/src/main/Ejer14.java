package main;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*).
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.print("Indicame el numero de estrellas: ");
		n = Integer.parseInt(teclado.nextLine());
		//Asi se crea de manera descendente
		for(int f=1; f<=n;f++) {
			for(int a=1; a<(n-f+1);a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Asi se crea de manera ascendente
		for(int f=1; f<=n;f++) {
			for(int a=1; a<=f;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int f=1;f<=n;f++) {
			for(int e=0; e<=n-f;e++) {
				System.out.print("o");
			}
			for(int a=1;a<=f;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
