package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Mod4Lab02 {

	public static void main(String[] args) {
		
		// Cree un programa que genere numeros enteros aleatorios y muestre
		// cuales son primos y cuales no, con las siguientes condiciones:
		
		// la cantidad de numeros aleatorios sera indicada por el usuario
		// los numeros aleatorios estaran comprendidos entre 1 y 
		// el numero maximo sugerido por el usuario
		
		Scanner teclado = new Scanner(System.in);
		
		//cantidad de numeros aleatorios que indica el usuario
		
		System.out.println("Indique la cantidad de numeros aleatorios a generar: ");
		
		int cantidad = teclado.nextInt();
		
		// maximo de cada numero
		
		System.out.println("Indique el numero maximo a generar por cada aleatorio: ");
		
		int maximo = teclado.nextInt();
		
		// definimos el vector, este tendra el tamaño = cantidad
		
		int [] vector = new int [cantidad];
		
		// Agregamos los numeros aleatorios al vector
		
		for ( int i = 0; i < cantidad ; i++) {
			vector [i] = 1+(int)(Math.random()*(maximo+1));
		}
		
		// Indique cuales soon primos y cuales no
		
		for ( int a = 0 ; a < cantidad ; a++) {
			int contador = 0;
			for (int b = 2; b <= Math.sqrt(vector[a]); b++) {
				if (vector[a] % b == 0) {
					contador++;
				}
			}
			if ((contador != 0) || (vector[a] == 1)) {
				System.out.println("El numero " + vector[a]+" no es primo");
			}else {
				System.out.println("El numero "+vector[a]+" es primo");
			}
		}
		
		
			
		
		
		// Imprimimos el vector
		
		System.out.println(Arrays.toString(vector));
		
		teclado.close();
	}

}
