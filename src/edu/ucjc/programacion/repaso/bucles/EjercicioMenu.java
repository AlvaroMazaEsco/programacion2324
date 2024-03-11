package edu.ucjc.programacion.repaso.bucles;

import java.util.Scanner;

public class EjercicioMenu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("1.Mostrar matriz");
			System.out.println("2.Pintar cuadrado");
			System.out.println("3.Serie Fibonacci");
			System.out.println("4.Salir");
			System.out.println("Seleccione una opcion: ");
			menu = scan.nextInt();
			switch(menu){
			case 1:
				System.out.println();
				for (int matriz=1 ; matriz<10; matriz++) {
						System.out.print(matriz);
						if (matriz%3==0) {
							System.out.println("");}}
				System.out.println();
				break;
			case 2:
				System.out.println("Dimension del cuadrado:");
				int dimension = scan.nextInt();
				System.out.println();
				for(int i=0 ; i<dimension ; i++){
					for(int j=0 ; j<dimension ; j++) {
						if (i==0 || i==dimension-1) {
						System.out.print("* ");}
						else {
							if (j==0 || j==dimension-1) {
								System.out.print("* ");}
							else {System.out.print("  ");}}}
						
						System.out.println();}
				System.out.println();
				break;
			case 3:
				System.out.println("Cuantos quieres mostrar:");
				int rango = scan.nextInt() -2;
				int suma = 0;
				int aux = 0;
				int anterior = 1;
				System.out.print("\n0 1");
				for (int i = 0 ;i<rango; i++) {
					suma = anterior + aux;
					aux = anterior;
					anterior = suma;
					System.out.print(" "+ suma);}
				System.out.println("\n");
			case 4: break; 
			default: System.out.println("Numero incorrecto");
			break;}
			
			}while (menu!=4);
		System.out.println("Adios");
		}
}