package pruebas;

import java.util.Scanner;

public class Mod3Lab01While {

	public static void main(String[] args) {
		
		 // Laboratorio 01 WHILE
		
		/*
		 Cree un programa que lea números enteros (Positivos y Negativos) del teclado 
		 y muestre la suma de dichos números ingresados, el programa se detendrá 
		 cuando el usuario indique el numero 0.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		int suma = 0;
		
		System.out.println("Suma de numeros enteros: "
				+ "\n" + "Para Salir escriba 0 o de lo contratio escriba cualquier numero entero: ");
		
		numero = teclado.nextInt();
				
		while (numero != 0) {
			//si entra al ciclo, suma el numero
			suma += numero;
			
			//pidiendo nuevo numero y guardandolo
			System.out.println("Para Culminar escriba 0 o de lo contratio escriba cualquier numero entero: ");
			numero = teclado.nextInt();
		}
		
		System.out.println("La suma es: " + suma);
		
		teclado.close();
		
			
	}

}
