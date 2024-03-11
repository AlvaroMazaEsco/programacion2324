package edu.ucjc.programacion.repaso.bucles;

public class BucleWhileDoWhile {

	public static void main(String[] args) {
		//While
		int numero = 10;
		while (numero>6) {
			System.out.println(numero);
			numero--;
		}
		System.out.println("---");
		//Do While
		int numero2 =8;
		do {
			System.out.println(numero2);
			numero2 += 2;
			
		}while(numero2<9);
	}

}
