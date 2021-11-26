package pruebas;

import java.util.Scanner;

public class Mod3Lab02DoWhile {

	public static void main(String[] args) {
		
		// Laboratorio 02 Do While
		
		/*
		 Cree un programa que lea números enteros (Positivos y Negativos) del teclado 
		 y muestre la suma de dichos números ingresados, el programa se detendrá 
		 cuando el usuario indique el numero 0, adicionalmente debe indicar el
		 numero mayor y numero menor introducido en el programa.
		 */
		
		// abrimos el teclado
		Scanner teclado = new Scanner(System.in);
		
		// definiendo las variables
		int numero = 0;
		int suma = 0;
		int numMayor = -2147483648;
		int numMenor =  2147483647;
		
		// el ciclo Do While
		do {
			// suma
			suma += numero;
					
			// el mayor
			if (numero > numMayor && numero != 0) {
				numMayor = numero;
			}
				
			// el menor
			if (numero < numMenor && numero != 0) {
				numMenor = numero;
			}	
		
			
			//pedimos el numero y lo guardamos
			System.out.println("Para Culminar escriba 0 de lo contrario escriba cualquier numero: ");
			numero = teclado.nextInt();
	
		} while (numero != 0);
		
		 
		teclado.close();
		
		System.out.println("La suma total es: " + suma);
		System.out.println("El numero mayor es: " + numMayor);
		System.out.println("El numero menor es: " + numMenor);

	}

}
