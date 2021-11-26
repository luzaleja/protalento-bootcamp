package pruebas;

import java.util.Scanner;

public class Mod3Bonus2 {

	public static void main(String[] args) {

				System.out.println("-------------------------");
		System.out.println("----------WHILE----------");
		System.out.println("-------------------------");

		// Ejercicio 1
		
		// Mostrar la suma de los numeros pares mayores a 9
		// y menores a 20
		
		System.out.println("\n");
		System.out.println("----------EJ 1-----------");
		
		int suma1 = 0;
		int i1 = 10;
		
		while (i1 > 9 && i1 < 20) {
			if (i1 % 2 == 0) {
				suma1 += i1;
			}
			i1++;
		}
		System.out.println(suma1);
		
		System.out.println("\n");
		System.out.println("----------EJ 2-----------");
		
		// Ejercicio 2
		
		// Implementar uncodigo que imprima el mayor y el menor
		// de una seria de 5 numeros que vamos introduciendo por teclado
		/*
		Scanner teclado = new Scanner(System.in);
		
		int i2 = 1;
		int numMayor = -2147483648;
		int numMenor = 2147483647;
		int numero = 0;
		
		while ( i2 <= 5) {
			System.out.println("Por favor ingrese un numero: ");
			numero = teclado.nextInt();
			if (numero > numMayor) {
				numMayor = numero;
			}
			if (numero < numMenor) {
				numMenor = numero;
			}
			i2++;	
		}
		System.out.println("El mayor es: " + numMayor + " y el menor es: " + numMenor);
		
		teclado.close();
		*/
		System.out.println("\n");
		System.out.println("----------EJ 3-----------");
		
		// Ejercicio 3
		
		// mostrar la conversion de 1 a 10 euros en pesos, euro tras euro, 
		// con camio de 5.80 pesos por euro
		
		int i3 = 1;
		double pesos = 0;
		double cambio = 5.8;
		
		while ( i3 < 11) {
			pesos = i3 * cambio;
			double pesosRound = Math.round(pesos*100.0)/100.0;
			System.out.println(i3 + " euro son " + pesosRound + " pesos");
			i3++;
		}
		
		System.out.println("\n");
		System.out.println("----------EJ 4-----------");
		
		// una persona desea invertir $1000 en un banco, el cual le otorga
		// un 2% de interes mensual. 
		// Cual sera la cantidad de dinero que esta persona tendra en un año?
		// en el primer mes tendra acumulado 1000 mas 20
		// en el segundo se le sumara un 2% a 1020., y así
		
		double total = 1000;
		int mes = 1;
		double interes = 2;
		double cambio4 = 1 + (interes/100);
		double totalRound = 0;
		
		while (mes <= 12) {
			total *= cambio4;
			totalRound = Math.round(total*100.0)/100.0;
			mes++;
		}
		System.out.println("El total al cabo de 1 año es " + totalRound);
		
		
		System.out.println("\n");
		System.out.println("----------EJ 5-----------");
		
		// Una persona desea invertir 1000 en un banco el cual le otorga
		// 3% de interes mensual
		// en cuantos meses conseguirá 1200, si reinvierte cada mes su dinero?
		
		
		int contadorMes = 0;
		double interesMensual = 3;
		double cambio5 = 1 + (interesMensual/100);
		double dinero = 1000;
		
		while (dinero <= 1200) {
			dinero *= cambio5;
			contadorMes++;
		}
		
		System.out.println("El numero de meses necesarios para llegar a "+dinero+" son " + contadorMes);
		
		System.out.println("\n");
		System.out.println("----------EJ 6-----------");
		
		//Ejercicio 6
		
		// desarrollar el codigo que permita a una persona ingresar como maximo
		// 3 veces su contraseña. En caso de ingreso correcto, debera exhibirse
		// "Bienvenido!!", caso contrario se mostrará "tres veces fallidas"
		
		// indicar cuantas posibiliadades de ingresar el codigo le queda
		
		// "Tiene dos chances!" y "Atencion!! Última oportunidad!"
		
		// usar do while
		
		Scanner teclado = new Scanner(System.in);
		
		String contrasEntrada;
		String contrasenia = "1234";
		
		int contador6 = 0;
		
		do {
			System.out.println("Ingrese su contraseña: ");
			if (contador6 == 1)
				System.out.println("Tiene dos chances!");
			if (contador6 == 2)
				System.out.println("Atencion!! Última oportunidad");
			contrasEntrada = teclado.next();
			if (contrasenia.equals(contrasEntrada)) {
				System.out.println("Bienvenido!!");
				break;
			} else {
				contador6++;
			}
			
			
		} while (contador6 < 3);
		
		if (contador6 == 3)
			System.out.println("Tres veces fallidas");
		
		teclado.close();
		
	}

}
