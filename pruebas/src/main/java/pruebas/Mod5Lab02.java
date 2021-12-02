package pruebas;

import java.util.Scanner;

public class Mod5Lab02 {

	public static void main(String[] args) {

		/*
		 
		Cree un programa que evalu� una oraci�n e indique si existe una palabra pal�ndromo o un numero capic�a y
		muestre por consola cuales cumplen con la condici�n.
		
			Debe crear un m�todo que retorne si la palabra cumple con la condici�n.
			
			Debe evaluar si es un numero o palabra e indicarlo.
			
		Pal�ndromo y Capic�a : palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda.
		Ej: reconocer.
		
		Aunque son sin�nimos se suele usar pal�ndromo para las palabras y capic�a para los n�meros.
		
		Para este ejercicio se evaluaran solamente las palabras y no la frase. 
		
		 */
		
		// Solicitando la oracion a evaluar
		Scanner teclado = new Scanner(System.in);
		
		
		String frase; // frase sin espacios al inicio y al final
		
		do {
			System.out.println("Indique la oracion a evaluar (No puede estar vacia): ");
			String fraseEntrada = teclado.nextLine();
			frase = fraseEntrada.trim();
		}while(frase.isEmpty());
		
		teclado.close();
		
		System.out.println(frase);
		
		evaluarFrase(frase);
		
		
	}
	
	// Metodos
	
	public static void evaluarFrase (String frase) {
		// convertimos la frase en un vector de palabras para poder evaluar cada una
		String [] fraseVector = frase.split(" ");
		
		for (int i = 0; i < fraseVector.length; i++) {
			String palabra = fraseVector[i];
			
			// es palindromo?
			if(esPalindromo(palabra)) {
				// es numero?
				if(esNumerico(palabra)) {
					System.out.println(palabra + " Es Capic�a");
				}else {
					System.out.println(palabra + " Es Pal�ndromo");
				}
			}else {
				// es numero?
				if(esNumerico(palabra)) {
					System.out.println(palabra + " No es Capic�a");
				}else {
					System.out.println(palabra + " No es Pal�ndromo");
				}
			}
		}
		
	}
	
	public static boolean esPalindromo (String palabra) {
		boolean palindromo = false;
		// en minusculas para que pueda encontrar si son la misma letra
		palabra = palabra.toLowerCase();
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)) {		
				palindromo = true;
			}else {
				palindromo = false;
				break;
			}
		}
		return palindromo;
	}

	public static boolean esNumerico (String palabra) {
		// creamos el vector numeros para comparar
		char [] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		boolean numerico = false;
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			for (char numero : numeros) {
				if (numero == letra) {
					numerico = true;
				}
			}
		}
		return numerico;
	}
	
	
}
