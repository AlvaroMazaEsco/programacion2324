package edu.ucjc.programacion.repaso.arrays;

import java.util.Scanner;

public class EjerciciosArrays {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tamaño:");
		int tamanio = scan.nextInt();
		int []numeros = new int [tamanio];
		for (int i = 0; i<tamanio; i++) {
			System.out.println("Numero de la posicion "+i);
			numeros[i]= scan.nextInt();
		}
		System.out.println("Los numeros pares son:");
		for (int j = 0; j<tamanio; j++) {
			if (numeros[j]%2==0) {
				System.out.println(numeros[j]);
			}
		}
		
		
	
	
	}
}
