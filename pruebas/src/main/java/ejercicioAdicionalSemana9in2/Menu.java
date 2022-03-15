package ejercicioAdicionalSemana9in2;

import java.util.Scanner;
import java.util.Set;

public class Menu {
	/*
	public static void opcionesPrincipal(Scanner teclado, DatosDBMemoria baseDeDatos) {
		int opcion = 1;
		Set<Integer> opcionesDisponibles = Set.of(1,2,3,4,5,6,7,8,9,0);
		
		while(opcion != 0) {
			
			System.out.println("Por favor escoja una de las siguientes opciones: "
					+ "\n" + "1 - Crear Alumno"
					+ "\n" + "2 - Crear Materia"
					+ "\n" + "3 - Realizar Inscripción"
					+ "\n" + "4 - Buscar Alumno"
					+ "\n" + "5 - Buscar Materia"
					+ "\n" + "6 - Buscar Inscripción"
					+ "\n" + "7 - Eliminar Alumno"
					+ "\n" + "8 - Eliminar Materia"
					+ "\n" + "9 - Eliminar Inscripción"
					+ "\n" + "0 - Salir de la Aplicación");
		
			//revisamos que sea entero
			if(teclado.hasNextInt()) {
				opcion = teclado.nextInt();
				//revisamos que se encuentre en las opciones disponibles
				if(opcionesDisponibles.contains(opcion)) {
					opciones(opcion,baseDeDatos);
				} else {
					System.out.println("Por favor ingrese una opción disponible.");
				}
			} else {
				System.out.println("Por favor ingrese una opción disponible.");
				teclado.next();
			}
		}
	} 
	*/
	/*
	private static void opciones(int opcionSeleccionada, DatosDBMemoria baseDeDatos) {
		switch (opcionSeleccionada) {
		case 1:
			baseDeDatos.crearAlumno();
			break;
		case 2:
			baseDeDatos.crearMateria();
			break;
		case 3:
			baseDeDatos.crearInscripcion();
			break;
		case 4:
			baseDeDatos.buscarInscripcion();
			break;
		case 5:
			baseDeDatos.eliminarInscripcion();
			break;
		case 0:
			System.out.println("Saliendo de la aplicación.");
			break;
		default:
			System.out.println("Opción invalida.");
			break;
		}
	}
	*/
}
