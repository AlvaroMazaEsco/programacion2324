package edu.ucjc.programacion.poo.universidad;

import edu.ucjc.programacion.poo.Utilidades;

public class EjercicioPotencia {

	public static void main(String[] args) {
		EjercicioPotencia ej = new EjercicioPotencia();
		// Elevar un num a 4
		int num1 = 2;
		double resultado = ej.potencia(num1, 4);
		System.out.println(resultado);
		
		//Pedir num y elevarlo a la 4 
		int num2 = Utilidades.pideDatoEntero("Numero: ");
		double resultado2 = ej.potencia(num2, 4);
		System.out.println(resultado2);
		
		
		//Elevar la edad de un alumno a 3
		Alumno alumno1 = new Alumno();
		alumno1.setEdad(12);
		ej.potenciaAlumno(alumno1);
		System.out.println(alumno1.getEdad());

	}

	//Elevar una base a un exponente
	public double potencia(int base, int potencia) {
		double solucion = Math.pow(base, potencia);
		return solucion;
	}

	//Elevar la edad de un alumno a 3
	public void potenciaAlumno(Alumno alumno) {
		double nuevaEdad = potencia(alumno.getEdad(), 3);
		alumno.setEdad((int) nuevaEdad);
	}
}