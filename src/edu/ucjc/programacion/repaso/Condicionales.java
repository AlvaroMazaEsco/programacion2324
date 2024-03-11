package edu.ucjc.programacion.repaso;

public class Condicionales {

	public static void main(String[] args) {
		int numero = 9;
		boolean cumpleCondicion = ++numero > 9;
		if (cumpleCondicion) {
			System.out.println("Numero mayor que 9"); 
		}else if (numero >6 && numero < 7){ //Se puede con un solo & y mira las dos condiciones lo mismo con |
			System.out.println("Numero mayor que 6");
		}else if (numero >4 || numero ==2){
			System.out.println("Numero mayor que 4 o igual a 2");
		}else {
			System.out.println("Numero menor que 6");
		}
		int opcion = 3;
		switch (opcion) {
		case 3: System.out.println("Numero 3");break;
		case 9: System.out.println("Numero 9");break;
		default: System.out.println("Otro");
		}
		//numero++ o numero-- aumente o disminuye en 1 el valor de la variable para las siguientes lineas
		// ++numero o --numero hace lo mismo pero para esa misma linea de codigo tambien
		//para sumar mas de uno numero +=x 
		// if puede evaluar varias variables, switch solo 1 (solo enteros y strings)
	}

}
