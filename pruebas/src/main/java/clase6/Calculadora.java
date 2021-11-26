package clase6;

public class Calculadora {

	// no tiene main porque no es la responsable de ejectutar
	// solo para guardar las funciones
	
	double sumar (double a, double b) {
		return a + b;
	}
	
	double restar (double a, double b) {
		return a - b;
	}
	
	double multiplicar (double a, double b) {
		return a * b;
	}
	
	
	
	// hay pre condiciones y pos condiciones
	// pre: b != 0
	// pos: a / b
	
	double dividir (double a, double b) {
		if (b != 0) {
			return a / b;
		}else {
			System.out.println("No se puede dividir entre cero");
			return 0;
		}
	}
}
