package pruebas;

public class Mod5Lab00Bonus {

	public static void main(String[] args) {

		// FUNCIONES Y PROCEDIMIENTOS
		
		// Acá es donde se ejecuta el código
		
		// Ejercicio 1
		
		int a = 1;
		int b = 2;
		
		int suma = suma(a,b);
		System.out.println("Ej 1:");
		System.out.println(suma);
		
		// Ejercicio 2
		
		double c = 2.1;
		double suma2 = suma(a,c);
		System.out.println("Ej 2:");
		System.out.println(suma2);
		
		// Ejercicio 3
		System.out.println("Ej 3:");
		mensaje();
		mensaje();
		mensaje();
		mensaje();
		mensaje();
		
		// Ejercicio 4
		System.out.println("Ej 4:");
		String palabra = "Luz";
		mensaje(palabra);
		mensaje(palabra);
		mensaje(palabra);
		mensaje(palabra);
		mensaje(palabra);
		
		// Ejercicio 5
		String nombre = "Marina";
		String frase = imprimir(nombre);
		System.out.println("Ej 5:");
		System.out.println(frase);
		
		// Ejercicio 6
		System.out.println("Ej 6:");
		cierreDelDia(1200);
		
	}

	// METODOS
	
	// Ejericio 1
	
	// crear una funcion suma que reciba dos parámetros de tipo entero y retorne 
	// la suma de los mismos
	
	public static int suma (int a, int b) {
		return a + b;
	}
	
	// Ejercicio 2
	
	// crear una funcion suma que reciba dos parametros
	// uno entero y uno double, que realice la suma y la retorne como un double
	
	public static double suma (int a, double b) {
		double suma = Double.valueOf(a) + b;
		return suma;
	}
	
	// Ejercicio 3
	
	// escribir un programa que tenga un procedimiento llamado mensaje
	// que imprima una palabra e invocar ese procedimiento 5 veces
	
	public static void mensaje () {
		System.out.println("Palabra");
	}
	
	// Ejercicio 4
	
	// escribir un programa que tenga un procedimiento llamado mensaje
	// que reciba un parametro de tipo String que es impreso por consola, 
	// invocarlo 5 veces
	
	public static void mensaje (String palabra) {
		System.out.println(palabra);
	}
	
	// Ejercicio 5
	
	// escribir una función que retorna un String, que recibe un parámetro de
	// tipo String llamado "nombre" y retorna el mensaje "Hola" y el valor del 
	// parámetro enviado. Invocar esa funcion desde nuestro programa e imprimir
	
	public static String imprimir (String nombre) {
		return "Hola " + nombre;
	}
	
	// Ejercicio 6
	
	// escribir un procedimiento llamado "cierreDelDia", el cual invoca dos 
	// veces a la funcion "iva" (también creada por nosotros) para calcular
	// el iva del 10.5% y 21% para el monto 1200. El procedimiento cierreDelDia
	// debe ser invocado en el "main".
	
	// iva
	public static double iva (double monto, double porcentaje) {
		return monto * (porcentaje/100);
	}
	
	// cierre del dia
	public static void cierreDelDia (double monto) {
		double porcentaje1 = 10.5;
		double porcentaje2 = 21;
		System.out.println("El iva del 10.5% es: " + iva(monto,porcentaje1));
		System.out.println("El iva del 21% es: " + iva(monto,porcentaje2));

	}
	
	
}
