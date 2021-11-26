package pruebas;

import java.util.Scanner;
import java.util.Arrays;

public class Mod4Lab01 {

	public static void main(String[] args) {
		
		// Vectores
		
		// Cree un programa que ingrese una oracion que realice las siguientes
		// operaciones:
		
		// Contar las palabras
		// Indicar si hay palabras repetidas
		// Ordenar las palabras de forma ascendente y mostrar
		// Ordenar las letras y mostrar
		// La oracion no puede estar vacia
		
		// Definicion de variables iniciales
		
		String oracion;
		String oracionVer; // ademas queda la frase sin espacios al principio o final
		
		
		// Preguntar la oracion
		// no se aceptan vacias
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Indique la oracion a evaluar (No puede estar vacia)");
			oracion = teclado.nextLine();
			oracionVer = oracion.trim();
		} while (oracionVer.isEmpty());
		
		// Imprimimos la oracion
		
		System.out.println(oracion);

		// contamos las palabras
		// Usamos la frase sin espacios al principio y al final para evitar errores
		// Convertimos la frase en un vector
		
		String [] vectorPalabras = oracionVer.split(" ");
		
		// contamos
		
		int cantidadPalabras = vectorPalabras.length;
		
		// imprimimos la cantidad
		
		System.out.println("La cantidad de palabras que contiene la oracion es: " + cantidadPalabras);
		
		// Indicar si hay palabras repetidas
		// comparamos palabra por palabra para revisar cuantas veces esta cada una
		
		int repeticiones = 0;
		String palabraActual;
		
		
		for (int i = 0 ; i < cantidadPalabras ; i++) {
			palabraActual = vectorPalabras[i];
			for (int j = 1; j < cantidadPalabras ; j++) {
				if (palabraActual.equals(vectorPalabras[j])) {
					repeticiones++;
				}
			}
		}
		
		// imprimimos
		
		if (repeticiones == 1) {
			System.out.println("Ninguna palabra se repite");
		}else {
			System.out.println("Hay palabras repetidas");
		}
		
		
		// Ordenar las palabras de forma ascendente y mostrar
		
		Arrays.sort(vectorPalabras);
		
		// imprimir
		
		System.out.println("Palabras Ordenadas: ");
		System.out.println(Arrays.toString(vectorPalabras));
			
		// Ordenar las letras y mostrar
		
		// quitar los espacios del string principal
		// convertirlo a vector de caracteres
		// ordenar
		
		String oracionSinEspacios = oracion.replace(" ","");
		
		char [] vectorLetras = oracionSinEspacios.toCharArray();
		
		Arrays.sort(vectorLetras);
		
		// imprimir
		
		System.out.println("Letras Ordenadas: ");
		System.out.println(Arrays.toString(vectorLetras));
		
		teclado.close();
		
		
		
		

		
		
		
	}

}
