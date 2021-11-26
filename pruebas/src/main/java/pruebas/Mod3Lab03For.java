package pruebas;

import java.util.Scanner;

public class Mod3Lab03For {

	public static void main(String[] args) {

		//Laboratorio 03 FOR
		
		/*
		Cree un programa que ingrese una oración y muestre cual es el 
		carácter que mas se repite, no debe incluir el espacio en blanco, la
		oración a ingresar no debe estar vacía.
		 */

		//definiendo variables
		String oracion;
		String sinEspacios;
		String oracionSoloLetras;
		
		int mayorRepeticion = 0;
		char letraMasRepetida = 'x';
		
		//abrimos el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Mientras que oracion este vacio, le pide que escriba algo
		
		do {
			//pedimos la oracion y la guardamos
			System.out.println("Indique la oracion a evaluar (No puede estar vacia): ");
			oracion = teclado.nextLine();		
			sinEspacios = oracion.trim();
		}
		while (sinEspacios.isEmpty());
					
		//mostramos la oracion
		System.out.println(oracion);
		oracionSoloLetras = oracion.replace(" ","");
		
		
		// for
		//empezando por el primer caracter, vamos pasando uno a uno
		for( int i = 0 ; i < oracionSoloLetras.length() ; i++ ) {
			char charActual = oracionSoloLetras.charAt(i);
			int contador = 0;
			//empezando por el primer caracter, vamos comparando 
			//i = 0 vs j = 0. i = 0 vs j = 1, y vamos contando
			//cuando pasa por todas las letras, vuelve al primer for para hacer
			//la comparacion de la segunda letra
			
			// se podria poner continue:::
			// if (charActual == " ") {
			//		continue;
			//}		
			
			for (int j = 0 ; j < oracionSoloLetras.length() ; j++ ) {
				if (charActual == oracionSoloLetras.charAt(j)) {
					contador++;
				}
			}	
			if (contador > mayorRepeticion ) {
				mayorRepeticion = contador;
				letraMasRepetida = charActual;
			}
			
		}
		
		teclado.close();
		
		System.out.println("El caracter [" + letraMasRepetida + "] se repite "
				+ mayorRepeticion + " veces");


		// recordar que el operador continue en for, salta la ejecucion que le sigue, 
		// y le dice al programa que siga con el siguiente ciclo
		
		//esto se puede utilizar para ignorar los espacios sin tener que crear
		// una frase sin estos
		
		
		
	}

}
