package edu.ucjc.programacion.poo.universidad;

import edu.ucjc.programacion.poo.Utilidades;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numMenu = 0;
		Alumno[] alumnos = null;
		Ejercicio3 universidad = new Ejercicio3();

		do {
			String[] opciones = {
					"1. Crear Universidad\n2. Insertar Alumno\n3. Mostrar Alumnos\n4. Buscar Alumno\n5. Borrar Alumno\n6. Salir" };
			Utilidades.pintarMenu(opciones);
			numMenu = Utilidades.pideDatoEntero("Elige opcion: ");
			switch (numMenu) {
			case 1:
				alumnos = universidad.crearUniversidad();
				break;
			case 2:
				universidad.insertarAlumno(alumnos);
				break;

			case 3:
				universidad.mostrarAlumnos(alumnos);break;
			case 4:
				universidad.buscarAlumno(alumnos);break;
			case 5:
				universidad.borrarAlumnos(alumnos);break;
			case 6:System.out.println("Adios");break;
			default:System.out.println("Opción incorrecta");
			}
		} while (numMenu != 6);
	}

	
	
	private Alumno[] crearUniversidad() {
		int numeroAlumnos = Utilidades.pideDatoEntero("Numero de alumnos: ");
		Alumno[] uniNueva = new Alumno[numeroAlumnos];

		return uniNueva;
	}

	private void insertarAlumno(Alumno[] alumnos) {

		if (alumnos != null) {
			for (int i = 0; i < alumnos.length; i++) {
				Alumno alumno = new Alumno(Utilidades.pideDatoString("Nombre alumno" + (i + 1)),
						Utilidades.pideDatoString("Apellidos alumno " + (i + 1)),
						Utilidades.pideDatoString("DNI alumno " + (i + 1)));
				alumnos[i] = alumno;
			}
		} else {
			System.out.println("Debe crear primero una universidad");
		}
	}
	private void mostrarAlumnos(Alumno[] alumnos) {
		if (alumnos != null) {
			for (Alumno alumno : alumnos) {
				if (alumno != null) {
					System.out.println("Nombre: " + alumno.getNombre());
					System.out.println("Apellidos: " + alumno.getApellidos());
					System.out.println("Edad: " + alumno.getEdad());
					System.out.println("Cursando: " + alumno.getCursando());
					System.out.println("Curso: " + alumno.getCurso());
					System.out.println("Email: " + alumno.getEmail());
					System.out.println("DNI: " + alumno.getDni());
					System.out.println("-------");
				} else {
					System.out.println("No hay alumno");
				}
			}
		} else {
			System.out.println("Debe crear primero una universidad");
		}
	}
	private void buscarAlumno(Alumno[] alumnos) {
		if (alumnos != null) {
			String numeroDni = Utilidades.pideDatoString("DNI:");
			boolean alumnoEncontrado = false;
			for (Alumno alumno : alumnos) {
				if (alumno != null) {
					if (alumno.getDni().equals(numeroDni)) {
						alumnoEncontrado = true;
						System.out.println("El alumno es " + alumno.getNombre());
					}
				} else {
					System.out.println("No hay alumno");
				}
			}
			if (!alumnoEncontrado) {
				System.out.println("No se ha encontrado al alumno");
			}
		} else {
			System.out.println("Debe crear primero una universidad");
		}
	}
	private void borrarAlumnos(Alumno[] alumnos) {
		if (alumnos != null) {
			String numeroDni = Utilidades.pideDatoString("DNI:");
			boolean alumnoEncontrado = false;
			int i = 0;
			for (Alumno alumno : alumnos) {
				if (alumno != null) {
					if (alumno.getDni().equals(numeroDni)) {
						alumnoEncontrado = true;
						System.out.println("El alumno " + alumno.getNombre() + " ha sido borrado");
						alumnos[i] = null;
					}
					i++;
				} else {
					System.out.println("No hay alumno");
				}
				if (!alumnoEncontrado) {
					System.out.println("No se ha encontrado al alumno");
				} else {
					System.out.println("Debe crear primero una universidad");
				}
			}
		}
	}
}