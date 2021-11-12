package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

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
	}

}
