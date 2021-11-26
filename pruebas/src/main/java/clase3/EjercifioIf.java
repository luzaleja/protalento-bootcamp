package clase3;

import java.util.Scanner;

public class EjercifioIf {

	public static void main(String[] args) {
		// determinar dado 3 numeros
		//cual es el mayor
		
		//necesito 3 variables
		// if
		// mostrar el mayor
		
		double a,b,c;
		
		a = 11;
		b = 11.2;
		c = 10;
		
		// a > b y a > c
		// b > a y b > c
		// c > < y c > b
		// si a == b Y a == c
		
		if(a > b && a > c) {
			System.out.println(a + " es el mayor");
		}
		if(b > a && b > c) {
			System.out.println(b + " es el mayor");
		}
		if (c > a && c > b) {
			System.out.println(c + " es el mayor");
		}
		if (a == b & a == c) {
			System.out.println(a +", " + b + ", " + c +" son todos iguales");
		}
		
		
		/* pruebas
		 	10 20 30 nro3 ok
			10 20 10 nro1 ok
			20 30 10 nro2 ok
			30 10 20 nro1 ok
			20 10 30 nro3 ok
			10 30 20 nro2 ok
		 
		 */
		
		/*
		int n1 = 10, n2 = 30, n3= 20;
		
		// informar cual de los 3 numeros es mayor
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("El numero mayor es n1: " + n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("El numero mayor es n2: " + n2);
		}else {
			System.out.println("El numero mayor es n3: " + n3);
		}
		*/
		
		//ejercicio 2
		
		/*
		int a = -10, b = 2, c = 5;
		
		//informarla multiplicacion de los 2 numeros positivos
		
		if (a >= 0 && b >= 0) {
			System.out.println("a x b: " + (a*b));
		}else if (a >= 0 && c >= 0) {
			System.out.println("a x c: " + (a*c));
		}else {
			System.out.println("c x b: " + (c*b));
		}
		*/
		
		//ejercicio 3
		/*
		String usuario = "Pepito", clave = "1234";
		
		
		//Informar los siguientes casos:
		//	Si usuario=”pepito” y clave=”1234” informar
		//	Bienvenido pepito!”
		//	Si usuario=”pepito” y clave no es “1234”
		//	informar “Usuario incorrecto”
		//	Si usuario no es “pepito” y clave= “1234”
		//	informar “Contraseña incorrecta”

		 
		
		if (usuario == "Pepito" && clave == "1234") { // igual que decir if (usuario.equals("Pepito") && clave.equals("1234"))
			System.out.println("Bienvenido Pepito!");
		}
		if (usuario == "Pepito" && clave != "1234") { // if (usuario.equals("Pepito") && !(clave.equals("1234")))
			System.out.println("Contraseña incorrecta");
		}
		if (usuario != "Pepito" && clave == "1234") { // if(!(usuario.equals("Pepito")) && clave.equals("1234"))
			System.out.println("Usuario incorrecto");
		}
		
		*/
		
		//ejercicio4
		
		// ingresar dos numeros
		// ofrecer un menu: 1-suma 2-resta 3-producto 4-division
		//mostrar el resultado de la operacion elegida
		
		/*
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		
		double n1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		
		double n2 = teclado.nextInt();
		
		System.out.println("Escoja una opción: "
				+ "1-suma "
				+ "2-resta "
				+ "3-producto "
				+ "4-division");
		
		int opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("n1 + n2: " + (n1 + n2));
			break;
		case 2:
			System.out.println("n1 - n2: " + (n1 - n2));
			break;
		case 3:
			System.out.println("n1 * n2: " + (n1 * n2));
			break;
		case 4:
			System.out.println("n1 / n2: " + (n1 / n2));
			break;
		default:
			System.out.println("No escogió ninguna de las opciones.");
			break;
		}
		
		teclado.close();
		
		*/
		
		

		
		
		
		
		
	}

}
