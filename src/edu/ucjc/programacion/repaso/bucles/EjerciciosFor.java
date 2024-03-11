package edu.ucjc.programacion.repaso.bucles;

public class EjerciciosFor {

	public static void main(String[] args) {
		int num=0;
		for ( ; num<=100; num+=2) {
			System.out.println(num);
		}
		for (int a=1 , b=100 ; a<100 && b>0; a+=2, b-=2) {
			System.out.println(a+"-"+b);
		}
	}
 
}
