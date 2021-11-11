package pruebas;

public class Operadores {

	public static void main(String[] args) {
		// ctrl + d elimina una linea 
		//nombres de clases, con la primera mayuscula
		
		// matematicos
		
		/*
		 +
		 -
		 *
		 /
		  
		  */
		
		int edad1 = 10;
		int edad2 = 20;
		int res = edad1 + edad2;
		
		System.out.println("edad1+edad2=" + res);
		
		//aplica a tipos de datos String
		String nombre = "carlos";
		String apellido = "lopez";
		String res1 = nombre + apellido;
		
		System.out.println("nombre+apellido=" + res1);

		double alto = 175.5;
		
		//para los float debo agregarle una F al final para decirle al sistema
		//que es un float
		
		float ancho = 205.7F;
		
		// que tan grande puede ser el numero
		//el valor
		//double puede ser mas grande que float
		
		//la edad de una persona vs la cantidad de años que vivieron los dinosaurios.. uno es mas grande que otro
		
		//obtener el resultado de una division
		//alto/ancho siemre es con decimales
		//para asegurarme que no falle la division
		//no pierdo precision
		//uso double, el más grande
		
		double resDiv = alto/ancho;
		
		//si quiero el float dentro del double
		float resDiv1 = (float)alto/ancho;
		
		byte valor = 127; // de -128 a +127
		
		//consultar java data type range
		//para ver los rangos de cada tipo de dato
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

		//division / 
		
		//no puedo dividir por 0
		
		double div0 = alto/ 0;
		//da Infinity cuando es float o double
		//si es int, da error
		
		//modulo %
		int a = 10;
		int b = 5;
		// D |_d_
		// r% c/
		//mod %
		int mod = a % b;
		//da 0
		
		
		
		//operadores relacionales
		
		// > < >= <= != 
		//todos devuelven un valor boolean
		
		boolean resAltoAncho = alto < ancho;
		
		
		//operadores logicos
		
		// && AND
		// || inclusivo OR
		// ! NOT
		// ^ exclusivo XOR
		//esto sirve para hacer una tabla de verdad
		
		//tomar curso 
		//dia es martes cond1
		//horario 19:30 cond2
		//comienza el curso si cond1 y cond2
		
		boolean esMartes = true;
		boolean horario19 = false;
		boolean curso = esMartes && horario19;
		System.out.println("el valor de verdad de " +esMartes + " && " + horario19 + "=" +curso);
		
		//si quiero 0 para false y 1 para true
		// c ? 1 : 0
		// syso(c ? 1 : 0 )
		
		//operador ternario
		// cond ? valorSiVerdad : valorSiFalse
		// c ? 1 : 0 
		
		
		
		//para leer desde el teclado
		
		//Scanner teclado = new Scanner(System.in);
		
		//ahora puedo leer datos desde el teclado
		//System.out.println("Ingrese el valor de a: ");
		//le damos doble click a la linea anterior
		//para ponerle debug
		//ahora si lo ejecutamos, nos sale ejecutar debug
		//asi podemos ver que esta haciendo el sistema
		//hasta esa linea
		//incluyendo variables que se han creado
		//para seguir el proceso, se puede hacer
		//F6: ejecuta la linea siguiente
		//F8: desde donde estoy, ejecuta todo lo que siga sin detenerse
		//termina la aplicacion
		//hay f5 y f7..
		//haciendo el debug podemos revisar donde queda un error en el codigo
		
		
		//int a = teclado.nextInt();
		//int b = teclado.nextInt();
		
		//int suma = a + b;
		
		//System.out.println("la suma es "+suma);
		
		//siempre debo cerrar el teclado
		//teclado.close();
		
	}

}
