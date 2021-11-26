package clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {

		// aca en MAIN se debe poner todo lo que se va a ejecutar
		
		// invocamos el procedimiento
		
		saludar("Como estas?");
		
		responder("bien y tu?");
	
		
		// calcular la suma de dos variables
		
		int a = 10;
		int b = 20;
		
		// asignar el valor de retorno de la funcion a una variable tipo int
		
		int c = sumar(a,b);
		System.out.println("La suma de a y b es: " + c);
		
	}
	
	// una funcion o metodo
	static int sumar(int a, int b) {
		int res = a+b;
		return res; // o se puede hacer solo el return a+b;
	}
	
	// procedimiento
	static void responder(String saludo) {
		System.out.println(saludo);
		
	}


	// un procedimiento
	
	static void saludar(String saludo) {
		System.out.println("Hola: "+saludo);
	}

}
