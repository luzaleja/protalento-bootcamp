package pruebas;

import java.util.Arrays;
import java.util.Locale;
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

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Ingrese un numero a: ");
		
		float a = teclado.nextFloat();
		
		System.out.println("Ingrese un numero b: ");
		
		float b = teclado.nextFloat();
		
		
		// asegurarse que el usuario ingrese los operadores que se le piden
		
		// creamos un vector para poder revisar luego m�s f�cilmente
		
		char [] operandos = new char [] {'+', '-', '*', '/', '%'};
		int contador = 0;
		char operacion;
		
		do {
			System.out.println("Ingrese la operaci�n que desea realizar " + Arrays.toString(operandos) + " : ");
			operacion = teclado.next().charAt(0);
			for (char operando : operandos) {
				if (operando == operacion) {
					contador++;
				}
			}
		} while(contador != 1);
		
		teclado.close();
		
		// usar la operacion solicitada
		
		operar(a,b,operacion);
		
		
	}

	public static void operar (float a, float b, char operacion) {
		switch (operacion) {
		case '+':
			float suma = suma(a,b);
			System.out.println("La suma de " + a + " y " + b + " es: " + suma);
			break;
		case '-':
			float resta = resta(a,b);
			System.out.println("La resta de " + a + " y " + b + " es: " + resta);
			break;
		case '*':
			float multi = multiplicacion(a,b);
			System.out.println("La multiplicaci�n de " + a + " y " + b + " es: " + multi);
			break;	
		case '/':
			float div = division(a,b);
			System.out.println("La division de " + a + " en " + b + " es: " + div);
			break;		
		case '%':
			float resto = resto(a,b);
			System.out.println("El resto de " + a + " en " + b + " es: " + resto);
			break;
		default:
			System.out.println("No escogi� una operaci�n");
			break;
		}
	}
	
	public static float suma (float a, float b) {
		float suma = a + b;
		return suma;
	}
	
	public static float resta (float a, float b) {
		float resta = a - b;
		return resta;
	}
	
	public static float multiplicacion (float a, float b) {
		float multiplicacion = a * b;
		return multiplicacion;
	}
	
	public static float division (float a, float b) {
		if (b != 0) {
			float division = a / b;
			return division;
		}else {
			System.out.println("No se puede dividir en 0");
			return 0;
		}
	}
	
	public static float resto (float a, float b) {
		if (b != 0) {
			float resto = a%b;
			return resto;
		}else {
			System.out.println("No se puede dividir en 0");
			return 0;
		}
	}
	
}