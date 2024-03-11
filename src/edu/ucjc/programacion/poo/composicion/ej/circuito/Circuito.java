package edu.ucjc.programacion.poo.composicion.ej.circuito;

public class Circuito {

	public static void main(String[] args) {
		
		//Utilizacion de argumentos
		for (String dato : args) {
			System.out.println(dato);
		}
		//Coche 1
		Piston piston1 = new Piston(1,"Marca1");
		Motor motor1 = new Motor ("Marca1",190,piston1);
		Volante volante1 = new Volante(1,"Tipo1","negro");
		Coche coche1 = new Coche("1099HBC","Mini",volante1,motor1);
		
		//Coche 2
		Coche coche2 = new Coche("1947HNV","Seat");
		
		Piston piston2 = new Piston(2,"Marca1");
		Motor motor2 = new Motor("Marca1",200,piston2);
		Volante volante2 = new Volante(1,"Tipo1","negro");
		coche2.setVolante(volante2);
		coche2.setMotor(motor2);
		
		//Velocidades aleatorias
		double velocidad1 = Math.random()*120;
		coche1.setVelocidad(velocidad1);
		double velocidad2 = Math.random()*120;
		coche2.setVelocidad(velocidad2);
		
		//Meter en array 
		Coche[] coches = {coche1, coche2};
		Coche[] parking = new Coche[20];
		
		//Conducir
		Circuito circuito1 = new Circuito();
		circuito1.arrancarCoches(coches);
	}

	private void arrancarCoches(Coche[] coches) {
		for (Coche coche: coches) {
			coche.conducir();
		}
	}
	
}
