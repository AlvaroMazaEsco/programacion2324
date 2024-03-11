package edu.ucjc.programacion.poo;

public class PruebaPersona {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Eva", "222M"); 
		
		System.out.println(persona1.getNombre());
		

		Persona persona2 = new Persona();
		persona2.setNombre("JJ");
		persona2.setEdad(20);
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getApellidos());
		System.out.println(persona2.getDni());
		System.out.println(persona2.getEdad());
		persona2.correr();
		

	}

}