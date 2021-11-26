package pruebas;

public class Mod3Bonus {

	public static void main(String[] args) {
		
		// Ejercicio 1
		
		// Imprimir los numeros del 1 al 10, uno abajo del otro
		
		//for ( int i=1 ; i <= 10 ; i++ ) {
		//	System.out.println(i);
		//}
		System.out.println("-------------------");
		System.out.println("WHILE");
		System.out.println("-------------------");
		
		int n = 1;
		
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("------------------");
		
		//Ejercicio 2
		
		// Imprimir los numeros del 1 al 10 slateando de a 2 uno abajo del otro
		
		int n2 = 1;
		
		while (n2 <= 10) {
			System.out.println(n2);
			n2+=2;
		}
		
		System.out.println("------------------");
		
		// Ejercicio 3
		
		// imprimir los numeros del 10 al 1 uno abajo del otro
		
		int n3 = 10;
		
		while ( n3 >= 1 ) {
			System.out.println(n3);
			n3--;
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 4
		
		// Imprimir los numeros del 1 al 10, sin imprimir los numeros 2, 5, y 9 
		// uno abajo del otro
		
		int n4 = 1;
		
		while (n4 <= 10) {
			if (!(n4 == 2) && !(n4 == 5) && !(n4 == 9)) {
				System.out.println(n4);
			}
			n4++;
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 5
		
		// Imprimir los numeros del 1 al 30 sin imprimir numeros entre el 10
		// y el 20 uno abajo del otro
		
		int n5 = 1;
		
		while ( n5 <= 30) {
			if ((n5<10) || (n5> 20)) {
				System.out.println(n5);
			}
			n5++;
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 6
		
		// Imprimir la suma de los numeros del 1 al 10
		
		int n6 = 1;
		int suma = 0;
		
		while (n6 <= 10) {
			suma += n6;
			n6++;
		}
		
		System.out.println(suma);
		
		System.out.println("-------------------");
		
		// Ejercicio 7
		
		// imprimir la suma de los numeros pares del 1 al 25
		
		int n7 = 1;
		int suma2 = 0;
		
		while ( n7 <= 25 ) {
			if (n7 % 2 == 0) {
				suma2 += n7;
			}
			n7++;
		}
		
		System.out.println(suma2);
		
		System.out.println("-------------------");
		
		// Ejercicio 8
		
		// imprimir la multiplicacion de los numeros impares que se encuentran 
		// entre -10 y 10
		
		int n8 = -10;
		int multi = 1;
		
		while ( n8 <= 10) {
			if (n8 % 2 != 0) {
				multi *= n8;
			}
			n8++;
		}
		System.out.println(multi);
		
		System.out.println("-------------------");
		System.out.println("FOR");
		System.out.println("-------------------");
		
		// Ejercicio 1
		
		// imprimir los numeros del 1 al 10
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 2
		
		// imprimir los numeros del 1 al 10 de a 2
		
		for(int i2=1; i2 <=10; i2+=2) {
			System.out.println(i2);
		}
			
		System.out.println("-------------------");
		
		// Ejercicio 3
		
		//imprimir 10-1
		
		for(int i3=10 ; i3 >0; i3--) {
			System.out.println(i3);
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 4
		
		// imprimir sum de los numeros impares 1-10
		
		int suma3 = 0;
		
		for( int i4 = 1 ; i4 <= 10; i4++) {
			if (i4 % 2 != 0) {
				suma3 += i4;
			}
		}
		System.out.println(suma3);
		
		System.out.println("-------------------");
		
		// Ejercicio 5
		
		// mostrar la resta de la multiplicacion de los numeros del 1 al 5
		// con la suma de los numeros del 1 al 5
		
		//   (1*2*3*4*5)-(1+2+3+4+5)
		
		int multi2 = 1;
		int suma4 = 0;
		
		for (int i5 = 1 ; i5 <=5 ; i5++) {
			multi2 *= i5;
			suma4 += i5;
		}
		
		System.out.println(multi2-suma4);
		
		System.out.println("-------------------");
		
		// Ejercicio 6
		
		// imprimir la siguiente figura
		// @
		// @
		// @
		// @
		
		for(int i6=0; i6<4; i6++) {
			System.out.println("@");
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 7
		
		// Imprimir la siguiente figura
		
		// @
		// @@
		// @
		// @@
		// @
		
		for (int i7 = 1; i7 <=5; i7++) {
			if (i7 % 2 != 0) {
				System.out.println("@");
			}
			if (i7 % 2 == 0) {
				System.out.println("@@");
			}
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 8
		
		// imprimir la siguiente figura
		
		// @
		// @@
		// @@@
		// @@@@
		// @@@@@
		
		String arroba = "";
		
		for ( int i8 = 1; i8 <= 5; i8++) {
			arroba += "@";
			System.out.println(arroba);
		}
		
		System.out.println("-------------------");
		
		// Ejercicio 9
		
		// imprimir la figura anterior al revez
		
		for (int i9 = 1; i9 <= 5; i9++) {
			for (int j = 5; j >= i9; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------");
		
		// Ejercicio 10
		
		// imprimir las dos anteriores juntas,solo 1 linea de 4 en la mitad
		
		int qInicial = 1;
		int qMedia = 4;
		int incremento = 1;
		int qFinal = qInicial - incremento;
		int qArrobas = 0;
		int qArrobasLinea = qInicial;

		while(qArrobasLinea != qFinal ) {
			for(qArrobas = 1; qArrobas <= qArrobasLinea ; qArrobas++) {
				System.out.print("@");
			}
			System.out.println();
			qArrobasLinea += incremento;
			if(qArrobasLinea == qMedia) {
				incremento = -incremento;
			}
		}
		
		System.out.println("---------2----------");
		
		// Ejercicio 10 b
		
		// empezamos con
		// 1 arroba, pues hay 1 en la primera linea
		int numArrobasLinea = 1;
		// repeticion 1, pues vamos de 1 a 7, son 7 lineas
		int repeticiones = 1;
		// necesitamos un cambio en los arrobas por lineas de 1, +1 o -1
		int cambio = 1;
		int cantidadLineas = 7;
		int lineaMedia = (cantidadLineas/2)+1;
		
		
		//mientras : va a ir de repeticion 1 a 7
		while ( repeticiones <= cantidadLineas) {
			// vemos cuantos arrobas se deben imprimir dependiendo repeticion
			// si a = 1, en la primera repeticion debe ser solo 1, 
			//entonces va a ser a<= al numero de arrobas necesarias
			//si se necesitan 2 arrobas, seria 1 <= 2, contando 1 y 2
			//va sumando de a 1
			for ( int a = 1 ; a <= numArrobasLinea ; a++) {
				System.out.print("@");
			}
			//sumamos 1 a la repeticion
			repeticiones++;
			//imprimimos la linea con los arrobas necesarios
			System.out.println();
			// agregamos al numero de arrobas necesarias 1, pues en la siguiente
			//linea se necesitará 1 mas
			numArrobasLinea += cambio;
			//cuando se llege a la linea 4, el incremento pasara a -1
			//para poder empezar a restar los arrobas necesarios
			//hasta llegar a la repeticion 7, donde acabamos las lineas
			if (numArrobasLinea == lineaMedia) {
				cambio = -cambio;
			}
			
		}
		
		
		System.out.println("-------------------");
		
		// Ejercicio 11
		
		// imprimir
		// - - - - -
		// - - -
		// -
		// - - -
		// - - - - -
		
		int iteracion = 1;
		int numeroLineas = 5;
		int arrobasNecesLinea = numeroLineas;
		int cambio2 = (-2);
		
		while(iteracion <= numeroLineas) {
			for(int c = 1; c <= arrobasNecesLinea ; c++) {
				System.out.print("@");
			}
			System.out.println();
			arrobasNecesLinea += cambio2;
			iteracion++;
			if (arrobasNecesLinea == 1) {
				cambio2 = -cambio2;
			}
		}
		
		System.out.println("-------------------");
		
	}

}
