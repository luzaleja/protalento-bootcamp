package clase6;

public class CalculadoraMain {

	public static void main(String[] args) {

		// como uso la calculadora? 
		// crear (new) una calculadora 
		// usar alguna de sus funciones
		
		// variables primitivas
		int a = 10;
		int b = 30;
		
		// creando un objeto, de la clase calculadora
		Calculadora miCalculadora = new Calculadora();
		
		// ahora que esta creada, ejecutar cualquier de sus funciones
		
		double suma = miCalculadora.sumar(a, b);
		
		System.out.println("La suma de "+a+" y "+b+" es "+suma);
	}

}
