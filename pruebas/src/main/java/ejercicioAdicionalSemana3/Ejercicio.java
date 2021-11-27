package ejercicioAdicionalSemana3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		/*
		 
		 PRACTICA ADICIONAL SEMANA 3
		 
		 La escuela primeria xyz solicita el desarrollo de una aplicación para poder llevar 
		 el control de notas para cada alumno.
		 
		 **El programa solicitará el ingreso de la cantidad de alumnos a procesar.
		 
		 **Para cada alumno se deberán ingresar los siguentes datos:
		 	- nombre (String)
		 	- apellido (String)
		 	- número de examen 
		 	- nota que obtubo el alumno (numerico >= 0 <= 10)
		 	
		 ** Al finalizar la carga de datos, se procederá a listar la siguiente información:
		 	- alumno/s con la calificación más alta
		 	- alumno/s con la calificación más baja
		 	- alumnos que promocionan, aquellos que obtuvieron un promedio >= 7
		 	- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7
		 	
		 ** Crear un branch con el nombre practica-adicional-semana3
		 
		 */
		
		// SOLICITANDO LA CANTIDAD DE ALUMNOS A PROCESAR
		
		//Abrimos el teclado
		Scanner teclado = new Scanner(System.in);
		
		// pedimos la cantidad de alumnos y la guardamos en la variable cantidadAlumnos
		System.out.println("Por favor ingrese la cantidad de alumnos a procesar: ");
		
		int cantidadAlumnos = teclado.nextInt();
		
		// PARA CADA ALUMNO SE DEBERAN INGRESAR NOMBRE, APELLIDO, NUMERO DE EXAMEN Y NOTA 
		
		// declaramos el vector para los estudiantes y los datos, donde cada fila es un estudiante
		// pos 0: estudiante 1, pos 1: estudiante 2,... 
		// y las columnas pos 0: numbre, pos 1: apellido, pos 2: numero de examen, pos3: nota, pos 4: nota 2...
		
		// primero preguntamos cuantos examenes hubo en el periodo
		System.out.println("Por favor ingrese el número de exámenes hechos durante el periodo: ");
		int numExamenes = teclado.nextInt();
		
		// luego obtenemos el numero de columnas
		int cantidadColumnas = (numExamenes*2)+2;
		
		Object [][] datosAlumnos = new Object [cantidadAlumnos][cantidadColumnas];
		
		// Pedimos los datos y llenamos el vector con estos
		for (int i = 0; i<cantidadAlumnos; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				if (j == 0) {
					System.out.println("Por favor ingrese el nombre del estudiante: ");
					datosAlumnos[i][j] = teclado.next();
				}
				if (j == 1) {
					System.out.println("Por favor ingrese el apellido del estudiante: ");
					datosAlumnos[i][j] = teclado.next();
				}	
				if (j % 2 == 0 && j != 0) {
					System.out.println("Por favor ingrese el numero del examen: ");
					datosAlumnos[i][j] = teclado.nextInt();
				}
				if (j % 2 != 0 && j != 1) {
					System.out.println("Por favor ingrese la nota del examen (entre 0 y 10 inclusive)");
					datosAlumnos[i][j] = teclado.nextDouble();
				}
			}
		}
		
		// cerramos el teclado
		teclado.close();
		
		
		// ALUMNO CON LA CALIFICACION MÁS ALTA
		
		// buscamos el mayor
		// tenemos que revisar las posiciones 3,5,7,...n-1
		String alumnoCalifMayor = datosAlumnos[0][0].toString() + " " + datosAlumnos[0][1].toString();
		double mayorCalif = (Double)datosAlumnos[0][3];
		
		for (int i = 0; i< cantidadAlumnos; i++) {
			for (int j = 3; j < cantidadColumnas; j+=2) {
				if ((Double)datosAlumnos[i][j] > mayorCalif) {
					mayorCalif = (Double)datosAlumnos[i][j];
					alumnoCalifMayor = datosAlumnos[i][0].toString() + " " + datosAlumnos[i][1].toString();
				}
			}
		}
		
		// imprimimos
		System.out.println("El alumno con mayor calificación es: " + alumnoCalifMayor 
				+ " con calificación: " + mayorCalif);
		
		
		// ALUMNO CON LA CALIFICACIÓN MÁS BAJA
		
		// buscamos el menor
		// tenemos que revisar las posiciones 3,5,7,...n-1
		String alumnoCalifMenor = datosAlumnos[0][0].toString() + " " + datosAlumnos[0][1].toString();
		double menorCalif = (Double)datosAlumnos[0][3];
				
		for (int i = 0; i< cantidadAlumnos; i++) {
			for (int j = 3; j < cantidadColumnas; j+=2) {
				if ((Double)datosAlumnos[i][j] < menorCalif) {
					menorCalif = (Double)datosAlumnos[i][j];
					alumnoCalifMenor = datosAlumnos[i][0].toString() + " " + datosAlumnos[i][1].toString();
				}
			}
		}
				
		// imprimimos
		System.out.println("El alumno con menor calificación es: " + alumnoCalifMenor 
				+ " con calificación: " + menorCalif);
		
		
		
		// PROMEDIO 
		
		// necesitamos el promedio de cada alumno
		// lo vamos a guardar en una nueva matriz que tenga 2 columnas: POS 0: nombre y apellido, y POS 1: el promedio
		
		Object [][] matrizpromedios = new Object [cantidadAlumnos][2];
		
		for (int i = 0; i < cantidadAlumnos; i++) {
			double suma = 0;
			double promedio = 0;
			for (int j= 3; j < cantidadColumnas; j+=2) {
				suma += (Double)datosAlumnos[i][j];
			}
			promedio = suma/numExamenes;
			matrizpromedios[i][0] = datosAlumnos[i][0].toString() + " " + datosAlumnos[i][1].toString();
			matrizpromedios[i][1] = promedio;
		}
		
		
		// ALUMNOS QUE PROMOCIONAN : obtuvieron un promedio >= 7
		
		System.out.println("Alumnos que promocionan: ");
		for (int i = 0; i < cantidadAlumnos; i++) {
			if ((Double)matrizpromedios[i][1] >= 7) {
				System.out.println(matrizpromedios[i][0] + " con un promedio de: " + matrizpromedios[i][1]);
			}
		}
		
		// ALUMNOS QUE DEBEN RECURSAR LA MATERIA : obtuvieron un promedio < 7
		
		System.out.println("Alumnos que deben recursar la materia");
		for (int i = 0; i < cantidadAlumnos; i++) {
			if ((Double)matrizpromedios[i][1] < 7) {
				System.out.println(matrizpromedios[i][0] + " con un promedio de: " + matrizpromedios[i][1]);
			}
		}		

	}

}

	