package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		/*
		Scanner teclado = new Scanner(System.in);
		
		//ingrese un dato y si es >= 18 imprimir mayor de edad
		//de lo contrario indicar que es menor
		System.out.println("Ingrese edad");
		
		int edad = teclado.nextInt();
		//dentro del parentesis va un bool
		//es lo que se va a evaluar
		//si se da, se ejecuta
		if(edad >= 18) {
			System.out.println("Mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		
		teclado.close();
		*/
		
		
		//// LABORATORIO 01
		
		
		
		// Cree un programa de inicio de sesion
		
		// usuario y contrase�a
		
		// mostrar Bienvenido al sistema o Credenciales incorrectas
		
		
		// Los datos correctos van a ser usuario Luz Contrase�a 1234
				
		
		/*
		Scanner teclado = new Scanner(System.in);
		
		// Preguntamos sus datos
		
		System.out.println("Ingresa tu usuario: ");
		String usuario = teclado.next();
		
		System.out.println("Ingresa tu contrase�a: ");
		String password = teclado.next();
		
		//String usuario = "Luz";
		//String password = "1234";
		
		if (usuario.equals("Luz") && password.equals("1234")) {
			System.out.println("Bienvenido al sistema");
		} 
		if (!(usuario.equals("Luz")) || !(password.equals("1234"))) {
			System.out.println("Credenciales incorrectas");
		}
		
		teclado.close();
		
		System.out.println(usuario);

		System.out.println(password);
		
		boolean b = password instanceof String;
		
		System.out.println("Password es un String: " + b);
		
		*/
		
		// Laboratorio 02
		
		// Dada la siguiente tabla del tiempo haga un programa que indique que puede hacer una persona con dicho pronostico
		
		/*
		Temperatura 		Tiempo 		Sugerencia
			> 25�	 		Soleado 	Caminar y Tomar sol
			> 15� y <=25� 	Soleado 	Caminar
			<=15� 			Soleado 	Caminar con Campera
			<10� 			Lluvia 		Quedarse en casa o salir con Paraguas y Campera
			<10� 			Nieve 		Esquiar
		 */
		
		
		/*
		// abrimos el teclado
		Scanner teclado = new Scanner(System.in);
		
		// pedimos al usuario la temperatura
		
		System.out.println("Ingrese el n�mero seg�n la temperatura actual: " + "\n"
				+ "1) > 25�" + "\n"
				+ "2) > 15� y <= 25�" + "\n"
				+ "3) <= 15�" + "\n"
				+ "4) < 10�");
		
		// guardamos la temperatura que nos da en la variable
		
		int temperatura = teclado.nextInt();
		
		// pedimos al usuario la temperatura
		
		System.out.println("Ingrese c�mo est� el tiempo: " + "\n"
				+ "Soleado" + "\n"
				+ "Lluvia" + "\n"
				+ "Nieve");
		
		// guardamos el tiempo en la variable 
		
		String tiempo = teclado.next();
		
		
		switch (temperatura) {
		case 1:
			System.out.println("Usted puede salir a caminar y tomar sol");
			break;
		case 2:
			System.out.println("Usted puede salir a caminar");
			break;
		case 3:
			if (tiempo.equals("Soleado"))
				System.out.println("Usted puede salir a caminar con campera");
			break;
		case 4:
			if (tiempo.equals("Lluvia"))
				System.out.println("Usted puede quedarse en casa o salir con paraguas y campera");
			if (tiempo.equals("Nieve"))
				System.out.println("Usted puede esquiar");
			break;
		default:
			System.out.println("No eligio las opciones disponibles, trate de nuevo.");
			break;
		}
		
		teclado.close();
		
		*/
		
		// laboratorio 3
		
		/*
		Cree un programa en Java que simule la petici�n de una opci�n seg�n 
		el siguiente men� y muestre en pantalla que ha
		ingresado a la opci�n seleccionada:

		
		Gracias por contactarte con nosotros!
		�En qu� podemos ayudarte?
		A) Documentaci�n
		B) Cotizaci�n
		C) Asistencia
		D) Siniestros
		E) Informaci�n de Pagos
		F) Otras Consultas
		G) Anulaci�n
		
		Escribe la letra de la opci�n seleccionada
		 */
		/*
		System.out.println("Gracias por contacterte con nosotros!" + "\n"
				+ "�En qu� podemos ayudarte?"+ "\n"
				+ "\n"
				+ "A) Documentaci�n"+ "\n"
				+ "B) Cotizaci�n"+ "\n"
				+ "C) Asistencia"+ "\n"
				+ "D) Siniestros"+ "\n"
				+ "E) Informaci�n de Pagos"+ "\n"
				+ "F) Otras Consultas"+ "\n"
				+ "G) Anulaci�n"+ "\n"
				+ "\n"
				+ "Escribe la letra de la opci�n selecctionada");
		
		Scanner teclado = new Scanner(System.in);
		
		char seleccion = teclado.next().charAt(0);
		

		switch (seleccion) {
		case 'A':
			System.out.println("Ha seleccionado Documentaci�n");
			break;
		case 'B':
			System.out.println("Ha seleccionado Cotizaci�n");
			break;
		case 'C':
			System.out.println("Ha seleccionado Asistencia");
			break;
		case 'D':
			System.out.println("Ha seleccionado Siniestros");
			break;
		case 'E':
			System.out.println("Ha seleccionado Informaci�n de Pagos");
			break;
		case 'F':
			System.out.println("Ha seleccionado Otras Consultas");
			break;
		case 'G':
			System.out.println("Ha seleccionado Anulaci�n");
			break;
		default:
			System.out.println("No ha seleccionado ninguna de las opciones disponibles");
			break;
		}
		
		teclado.close();
		
		*/
		/*
		if(true);
			System.out.println("Hola");
			System.out.println("Mundo");
			System.out.println("Hola");
			*/
		
		/*
		int a= 0;
		System.out.println(a++);
		//Imprime a, luego le suma 1
		*/
		
		/*
		int b = 0; 
		System.out.println(++b);
		//Le suma 1, luego imprime b
		*/
		
		
		/*
		if (true)
			System.out.println("Verdadero");
		else
			System.out.println("Falso");
		
		// siempre imprime verdadero
		// la condicion es true, como dado en if (true)  
		 
		 */
		
		/*
		
		
		if (false)
			System.out.println("opcion A");
		else if (false)
			System.out.println("Opcion B");
		else 
			System.out.println("Opcion C");
		//siempre imprime c
		// como la condicion es falsa en if y else if, la condicion va a ser verdaderar en else. Solo cuando la cond es verdadera, ejecuta
		 * 
		 * 
		 * 
		 * */
		
	}

}
