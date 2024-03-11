package edu.ucjc.programacion.poo;

import java.util.Scanner;

public class Utilidades {
	
		 public static void validarEmail(String email) {
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
			else{System.out.println("No hay email");}}
		 
		 public static int pideDatoEntero(String texto) {
			 Scanner scan = new Scanner(System.in);
			 System.out.println(texto);
			 int datoEntero = scan.nextInt();
			 return datoEntero;
		 }

		public static String pideDatoString(String texto) {
			 Scanner scan = new Scanner(System.in);
			 System.out.println(texto);
			 String datoString = scan.nextLine();
			 return datoString;
		 }
		 public static void pintarMenu(String [] opciones) {
			 for(String opcion : opciones) {
				 System.out.println(opcion);
			 }
		 }

}

