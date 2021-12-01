package pruebas;

import java.util.Scanner;

public class Mod5Lab01 {

	public static void main(String[] args) {

		/*
		Cree un programa que reciba 3 par�metros y calcule la suma, resta, multiplicaci�n, 
		divisi�n, resto de dos n�meros con decimales
			Debe crear un m�todo que no retorne, nada que reciba los 3 par�metros, 2 n�meros con decimales y el car�cter de operaci�n.
			Debe crear los m�todos de las operaciones que retornar un numero con decimales.	
			Debe mostrar por consola un mensaje que indique el resultado y la operaci�n realizada
		 */
		
		// tomando los datos
		double a = 0;
		double b = 0;
		char operacion = ' ';
		

		
		// usar la operacion solicitada
		
		switch (operacion) {
		case '+':
			double suma = suma(a,b);
			System.out.println("La suma es: " + suma);
			break;
		case '-':
			double resta = resta(a,b);
			System.out.println("La resta es: " + resta);
			break;
		case '*':
			double multi = multiplicacion(a,b);
			System.out.println("La multiplicacion es: " + multi);
			break;	
		case '/':
			double div = division(a,b);
			System.out.println("La division es: " + div);
			break;		
		case '%':
			double resto = resto(a,b);
			System.out.println("El resto es: " + resto);
			break;
		default:
			System.out.println("No escogi� una operaci�n");
			break;
		}
	}

	public static void tomaDeDatos (String dato) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese " + dato);
		String datoaGuardar = teclado.next();
		
		teclado.close();
	}
	
	public static double suma (double a, double b) {
		double suma = a + b;
		return suma;
	}
	
	public static double resta (double a, double b) {
		double resta = a - b;
		return resta;
	}
	
	public static double multiplicacion (double a, double b) {
		double multiplicacion = a * b;
		return multiplicacion;
	}
	
	public static double division (double a, double b) {
		double division = 0;
		if (b != 0) {
			division = a / b;
		}
		return division;
	}
	
	public static double resto (double a, double b) {
		double resto = 0;
		double division = 0;
		if (b != 0) {
			division = Math.floor(a/b);
			resto = a - division;
		}
		return resto;
	}
	
}
