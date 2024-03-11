package edu.ucjc.programacion.repaso.arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		int []numeros = {1,2,3,4,5};
		int []numeros2 = new int [6];
		
		numeros2[3]=8;
		
		System.out.println(numeros[4]);
		System.out.println(numeros2[3]);
		
		System.out.println(numeros.length);
		System.out.println("----");
		
		//Para recorrer un array se puede hacer con un for normal con variable i o tambien:
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		
	}
}