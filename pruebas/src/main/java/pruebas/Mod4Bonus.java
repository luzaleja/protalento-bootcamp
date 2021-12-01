package pruebas;

import java.util.Scanner;

public class Mod4Bonus {

	public static void main(String[] args) {
		
		// EJERCICIO 1
		
		/*
		 
		 Dado el vector {10,20,5,15,30,20}
		 
		 1. Informar el vector de la forma: "Indice x, Valor Y"
		 2. Totalizar el vector e informar el total
		 3. Informar el contenido de las posiciones impares
		 	(por ejemplo, las posicones 1,3,5,etc)
		 4. Informar el mayor número
		 5. Informar cuántas veces aparece el número 20
		 
		 */

		int [] vector = new int [] {10,20,5,15,30,20};
		
		// informar el vector de la forma "Indice: x, Valor: y";
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Índice: " + i + ", Valor: " + vector[i]);
		}

		
		// totalizar el vector e informar el total
		
		int suma = 0;
		
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		
		System.out.println("La suma total del vector es: " + suma);
		
		
		// informar el contenido de las posiciones impares
		
		for (int i = 0; i < vector.length; i++) {
			if (i % 2 != 0) {
				System.out.println("Posicion impar: " + i + ", valor: " + vector[i]);
			}
		}
		
		// informar el mayor número
		
		int mayor = vector[0];
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		
		System.out.println("El número mayor es: " + mayor);
		
		
		// informar cuantas veces aparece el numero 20
		
		int numero = 20;
		int contador = 0;
		
		for (int a : vector) {
			if (a == numero) {
				contador++;
			}
		}
		
		System.out.println("El número " + numero + " se repite " + contador + " veces");
		
		
		// EJERCICIO 2
		
		/* 
		 
		 Dado el vector inflación {0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9}
		 
		 Cada item del vector representa la inflación de un mes, de tal manera que
		 el primer item del vector es la inflación de enero y el últumo es la de
		 diciembre.
		 
		 Se pide:
		 
		 Informar la inflación anual
		 
		 Informar la inflación más baja, junto con el numero de mes: Mes 2 = 0.1
		 
		 Informar la inflación más alta: Mes 12 = 0.9
		 
		 Informar el promedio de inflación (inflación total / 12)
		 */
		
		double [] inflacion = new double [] {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7,
				0.3, 0.2, 0.9};
		
		double inflacionAnual = 0;
		double inflacionMenor = inflacion[0];
		int posMenor = 0;
		double inflacionMayor = inflacion[0];
		int posMayor = 0;
		double promedio = 0;
		
		for (int i = 0; i < inflacion.length; i++) {
			
			// inflacion anual es la suma
			inflacionAnual += inflacion[i];
			
			// la mas baja
			if (inflacion[i] < inflacionMenor) {
				inflacionMenor = inflacion[i];
				posMenor = i;
			}
			
			// la mas alta
			if (inflacion[i] > inflacionMayor) {
				inflacionMayor = inflacion[i];
				posMayor = i;
			}
			
			// promedio de inflación
			promedio = inflacionAnual/12;
		}
		
		System.out.println("La inflacion anual es " + inflacionAnual);
		System.out.println("La inflación más baja fue en el mes " + (posMenor + 1)
				+ " = " + inflacionMenor);
		System.out.println("La inflación más alta fue en el mes " + (posMayor + 1)
				+ " = " + inflacionMayor);
		System.out.println("El promedio de inflación fue de: " + promedio);
		
		
		// EJERCICIO 3
		
		/*
		  
		 Agregar los cambios que resulten necesarios al ejercicio anterior para que en 
		 los puntos b y c se informe la inflación junto con el nommbe del mes.
		 */
		
		double [] inflacion1 = new double [] {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7,
				0.3, 0.2, 0.9};
		
		double inflacionAnual1 = 0;
		double inflacionMenor1 = inflacion1[0];
		int posMenor1 = 0;
		double inflacionMayor1 = inflacion1[0];
		int posMayor1 = 0;
		double promedio1 = 0;
		
		String [] meses = new String [] {"Enero","Febrero","Marzo","Abril","Mayo",
				"Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
				
		for (int i = 0; i < inflacion1.length; i++) {
			
			// inflacion anual es la suma
			inflacionAnual1 += inflacion1[i];
			
			// la mas baja
			if (inflacion1[i] < inflacionMenor1) {
				inflacionMenor1 = inflacion1[i];
				posMenor1 = i;
			}
			
			// la mas alta
			if (inflacion1[i] > inflacionMayor1) {
				inflacionMayor1 = inflacion1[i];
				posMayor1 = i;
			}
			
			// promedio de inflación
			promedio1 = inflacionAnual1/12;
		}
		
		System.out.println("La inflacion anual es " + inflacionAnual1);
		System.out.println("La inflación más baja fue en el mes " + meses[posMenor1]
				+ " = " + inflacionMenor1);
		System.out.println("La inflación más alta fue en el mes " + meses[posMayor1]
				+ " = " + inflacionMayor1);
		System.out.println("El promedio de inflación fue de: " + promedio1);
	
		
		// EJERCICIO 4
		
		/*
		 
		 Uso de vector con ingreso de datos por teclado.
		 
		 Ingrese por teclado la facturacion de los ultimos 6 meses.
		 Solo se pueden ingresar numeros.
		 
		 Informar:
		 
		 La facturacion total
		 El promedio de facturacion
		 La maxima facturacion
		 La minima facturacion
		 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		// 6 meses
		double [] facturacion = new double [6];
		
		//ingreso
		
		for (int i = 0; i < facturacion.length; i++){
			System.out.println("Por favor ingrese la facturación del mes " + (i+1));
			
			facturacion[i] = teclado.nextDouble();
			// facturacion[i] = Double.parseDouble(teclado.next());
		}
		
		
		double total = 0;
		double promedioFact = 0;
		double maxFact = facturacion[0];
		double minFact = facturacion[0];
		
		for (int i = 0; i < facturacion.length; i++) {
			
			//total
			total += facturacion[i];
			
			// promedio
			promedioFact = total / facturacion.length;
			
			// maximo
			if (facturacion[i] > maxFact) {
				maxFact = facturacion[i];
			}
			
			// minimo
			if (facturacion[i] < minFact) {
				minFact = facturacion[i];
			}
		}
		
		System.out.println("La facturacion total fue: " + total);
		System.out.println("El promedio de facturacion fue: " + promedioFact);
		System.out.println("La maxima facturacion fue: " + maxFact);
		System.out.println("La minima facturacion fue: " + minFact);
		
		teclado.close();
		
		
		// EJERCICIO 5
		
		/* 
		 
		Copiar el contenido del vector origen al vector destino utilizando 
		estructura de control de flujo repetitiva, y luego informar
		el indice y los valores del nuevo vector.
		
		 */
		
		int [] vector1 = new int [] {2,10,-4,8,0};
		
		// definimos el vector destino
		
		int [] vector2 = new int [vector1.length];
		
		for (int i = 0; i < vector1.length; i++) {
			vector2[i] = vector1[i];
		}
		
		for (int i = 0; i < vector2.length; i++) {
			System.out.println("Indice: " + i + ", Valor: " + vector2[i]);
		}
		

		
		// ------------- BONUS ----------------------
		
		// EJERCICIO 1
		
		/*
		Copiar el contenido del vector origen al vector destino, dejando en este ultimo
		los valores invertidos respecto del vector origen.
		
		Utilizar estructura de control de flujo repetitiva, y luego informar el indice
		y los valores del nuevo vector.
		
		 */
		
		int [] origen = {2,10,-4,8,0};
		
		// definimos vector destino
		int [] destino = new int [origen.length];
		
		int posDestino = 0;
		
		for (int i = origen.length-1; i >= 0 ; i--) {
			destino[posDestino] = origen[i];
			posDestino++;
		}
		
		/*
		
		for (int i = 0; i < origen.length ; i++) {
			destino[i] = origen [origen.length-1-i];
		 */
		
		for (int i = 0; i < destino.length ; i++) {
			System.out.println("Indice: " + i + " Valor: " + destino[i]);
		}
		
		
		// EJERCICIO 2
		
		/*
		 
		Dado un vector del 0 al 11 con la facturacion correspondiente a todo un año,
		informar la facturacion por trimestre.
		
		Para eso, armar un vector de 4 posiciones donde cada posicion contenga la
		facturacion de cada trimestre.
		 
		 */
		
		
		double [] fact = {80, 20, 50, 40, 60, 70, 80, 30, 50, 20, 40, 60};
		
		// definimos el vector de trimestres
		
		double [] factTrimestral = new double [4];
		int mes = 0;
		
		for (int i = 0; i < factTrimestral.length; i++) {
			factTrimestral[i] = fact[mes] + fact[mes+1] + fact[mes+2];
			mes += 3;
		}
		
		/*
		double total1 = 0; 
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		
		for (int i = 0; i < factTrimestral.length; i++) {
			if (i <= 2) {
				total1 += fact[i];
			}
			if (i > 2 && i <= 5) {
				total2 += fact[i];
			}
			if (i > 5 && i <= 8) {
				total3 += fact[i];
			}
			if (i > 8 && i <= 11) {
				total4 += fact[i];
			}
		}
		
		trimestre [0] = total1;
		trimestre [1] = total2;
		trimestre [2] = total3;
		trimestre [3] = total4;
		 */
		
		for (int i = 0; i < factTrimestral.length; i++) {
			System.out.println("Trimestre: " + (i+1) + ", Facturacion: "+ factTrimestral[i]);
		}
		
	}

}
