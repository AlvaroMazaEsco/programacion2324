package edu.ucjc.programacion.poo;

import edu.ucjc.programacion.poo.universidad.Alumno;

public class PasoPorValorYPasoPorReferencia {

	private static int multiplica (int numero) {
		numero *=2;
		System.out.println(numero);
		
		return numero;
	}
	
	private static void cambiaNombreAlumno(Alumno alumnoRef) {
		alumnoRef.setNombre("NuevoNombre1");
		System.out.println(alumnoRef.getNombre());
	}
	
	
	public static void main(String[] args) {
		
		//Paso por valor
		int numero =3;
		int resultado = multiplica(numero);
		System.out.println(resultado);
		
		//Paso por referencia
		Alumno alumno = new Alumno("Nombre1","Ape1","123123N");
		cambiaNombreAlumno(alumno);
		System.out.println(alumno.getNombre());

	}

}