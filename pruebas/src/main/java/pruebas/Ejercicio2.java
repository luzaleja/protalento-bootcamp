package pruebas;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Si variableA, variableB y variableC son logicas o boolean
		// que valores deben poseer para que las siguientes operaciones
		// den los siguientes resultados:
		
		/*
		 * (variableA && variableB) || (variableA && variableC) = true
		 * !(variableA || variableB) && variableC = false
		 */
		
		/*
		 * (variableA && variableB) || (variableA && variableC) = true
		   (		  &&		  ) || (		  &&		  ) = true
		   al menos uno de los lados debe ser verdadero
		   para que uno de los lados sea verdadero, 
		   ambos operandos deben ser true
		   entonces al menos 2 deben ser verdaderos al mismo tiempo:
		   
		   Si todos son verdaderos:
		   (true && true) || (true && true) = true   OK
		   
		   Si A y B son verdaderos:
		   (true && true) || (true && false) = true  OK
		   
		   Si A y C son verdaderos:
		   (true && false) || (true && true) = true  OK
		   
		   Si B y C son verdaderos:
		   (false && true) || (false && true) = false NO
		   
		  * !(variableA || variableB) && variableC = false
		  
		  Si todos son verdaderos:
		  !(true || true) && true = false
		  !(true) && true = false
		  false && true = false  OK
		  
		  Si A y B son verdaderos:
		  !(true || true) && false = false
		  !(true) && false = false
		  false && false = false  OK
		  
		  Si A y C son verdaderos:
		  !(true || false) && true = false
		  !(true) && true = false
		  false && true = false  OK
		   
		  Funciona si todos son verdaderos, si A & B son verdaderos
		  y si A y C son verdaderos.
		 */
		
		boolean variableA, variableB, variableC, res1, res2;
		
		variableA = true;
		variableB = false;
		variableC = true;
		
		res1 = (variableA && variableB) || (variableA && variableC);
		
		res2= !(variableA || variableB) && variableC;
		System.out.println("La variableA debe ser " + variableA + "\n"
				+ "La variableB debe ser " + variableB + "\n"
				+ "La variableC debe ser " + variableC + "\n"
				+ "Resultado:" + "\n"
				+ "(variableA && variableB) || (variableA && variableC) = " + res1 + "\n"
				+ "!(variableA || variableB) && variableC = " + res2 );
		
		
	}

}
