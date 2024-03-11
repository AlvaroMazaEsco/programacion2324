package edu.ucjc.programacion.poo;

// POJO : Plain old java object
public class Persona {
	//MODIFICADOR DE ACCESO: private, package (no se ecribe), protected, public  Tanto package como protected es en el paquete pero protected tmb deja
	// a las clases hijas aunq esten en otros paquetes
	
	//Variables de instancia o atributos -> siempre en private
	private String nombre; 
	private String apellidos;
	private String dni;
	private int edad;
	
	
	//Constructores
	public Persona() { //ES NECESARIO SI NO VAS A CREAR CONSTRUCTORES PARA TODAS LAS VARIABLES, crea constructor null
		
	}
	public Persona (String nombre, String dni) {
		this.dni = dni; 
		this.nombre = nombre;
	}
	
	//Para crear constructores para todas las variables: Alt+Shift+S --> constructors
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	//Metodos
	// modif acceso/ tipo dato / nombre / necesita / {return} --> Alt Shift S --> getters and setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void correr (){
		if (this.edad<18) {System.out.println("Corre muy rapido");}
		else if (edad >= 18 && edad <40) {System.out.println("Corre rapido");}
		else {System.out.println("Corre lento");}
	}
}