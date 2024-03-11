package edu.ucjc.programacion.poo.universidad;

import edu.ucjc.programacion.poo.Utilidades;

public class Universidad {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Marta", "Diaz Saltando", 22, "Saltar", 2, new String[]{"Tiktok", "Instagram", "Salto"}, "alumno1@ucjc.edu","3942A");
		alumno1.mostrarInfoAlumno();
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Marina");
		alumno2.setApellidos("Rivera Rivers");
		alumno2.setEdad(21);
		alumno2.setCursando("Derecho");
		alumno2.setCurso(3);
		alumno2.setAsignaturas(new String[]{"Derecho romano", "Boxeo", "Constitucional"});
		alumno2.setEmail("alumno2@ucjc.edu");
		alumno2.mostrarInfoAlumno();
		
		Alumno alumno3 = new Alumno("Guillermo", "Garcia Gonzalez", 22, "Robotica", 2, 
				new String[]{"Robotica", "SO", "Estruc.Comput"}, "alumno3@ucjc.edu","3648273M");
		alumno3.mostrarInfoAlumno();
		
		Alumno[] alumnos = {alumno1, alumno2, alumno3};
		
		for(Alumno alumno:alumnos) {
			//Llamada al metodo en la clase alumno 		
			//alumno.validarEmail();
			
			//Llamada al metodo en la clase Universidad 
			//Universidad uni = new Universidad();
			//uni.validarEmail(alumno.getEmail());}
			
			//Llamada al metodo desde la clase Utilidades
			Utilidades.validarEmail(alumno.getEmail());
		}
	}
		
	//Desde un método estatico no se puede llamar a un metodo no estatico -> static
	//Sino : se necesita un objeto 
	void validarEmail(String email) {
		if(email != null) {
		boolean isValid = true;
		email = email.trim();
		String mensaje = "";
		
		if (email.contains(" ")) {
				isValid = false;
				mensaje += "tiene un espacio en blanco, ";}
			
			if (!email.contains("@") ||email.indexOf("@")!=email.lastIndexOf("@")){
				isValid = false;
				mensaje += "no tiene @ o contiene mas de una, ";}
			
			else { 
				int posicionArroba = email.indexOf("@");
				String dominio = email.substring(posicionArroba+1);
				if(!dominio.contains(".")) {
				isValid = false;
				mensaje += "debe contener un . despues de la @, ";}
				else {
					if (dominio.indexOf(".")<2) {
					isValid = false;
					mensaje += "la distancia ente la @ y el primer . debe ser superior a 2, ";
					}
					String subdominio = dominio.substring(dominio.lastIndexOf(".")+1 );
					if (subdominio.length()<2 || subdominio.length()>5) {
					isValid = false;
					mensaje += "el numero de caracteres despues del ultimo punto debe ser superior a 2 y menor de 5";
					}
					}
				
				
				}			
			
			
			if (!isValid) { 
				System.out.println("El email "+ email + " no es valido porque " + mensaje);}
			if(isValid) {System.out.println("El email "+ email+" es valido");}
				}
	else{System.out.println("No hay email");}
		}
}
