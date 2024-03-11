package edu.ucjc.programacion.poo.universidad;

import edu.ucjc.programacion.poo.Utilidades;

public class Alumno {

	private String nombre; 
	private String apellidos;
	private int edad;
	private String cursando;
	private int curso;
	private String asignaturas [];
	private String email;
	private String dni;
	
	
	public Alumno () {}
	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, String[] asignaturas, String email, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.email = email;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCursando() {
		return cursando;
	}
	public void setCursando(String cursando) {
		this.cursando = cursando;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	
	
	public void mostrarInfoAlumno() {
		System.out.println("El alumno " + nombre+ " " + apellidos + " cuyo email es "+ email + " esta cursando "+ cursando 
				+ " en el curso " + curso );
		System.out.println("Esta matriculado en las asignaturas: ");
		if(asignaturas != null) {
		for (String asignatura : asignaturas) {
			if (asignatura!=null) {
			System.out.println(asignatura);}}}
		else {System.out.println("El alumno no esta matriculado en ninguna asignatura");}
		Utilidades.validarEmail(this.email);
		
	}
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
