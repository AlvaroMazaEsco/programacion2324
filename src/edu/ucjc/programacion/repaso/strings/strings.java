package edu.ucjc.programacion.repaso.strings;

public class strings {

	public static void main(String[] args) {
		
		String cadena = "texto";
		
		String cadena2 = new String("texto");
		String cadena3 = "texto";
		
		System.out.println(cadena==cadena2); //mira si son el mismo objeto
		System.out.println(cadena==cadena3);
		System.out.println(cadena.equals(cadena2)); //comprueba si tienen el mismo valor (equalsIgnoreCase para q le de igual las mayus
		
		System.out.println(cadena3.toUpperCase()); //tmb toLowerCase
		
		System.out.println(cadena.contains("te")); 
		
		System.out.println(cadena.indexOf("t"));
		System.out.println(cadena.lastIndexOf("t"));
		
		System.out.println(cadena.charAt(2));
		
		String texto = "    Hola esto es una prueba    ";
		System.out.println(texto.replace(" ", ""));
		System.out.println(texto.trim());
		
		System.out.println(texto.trim().substring(10));
		System.out.println(texto.trim().substring(10,16));
	
		String dato = "askjd;aljdh;2478";
		String[] datos = dato.split(";");
		System.out.println(datos[2]);
		
		
		
	}
}
