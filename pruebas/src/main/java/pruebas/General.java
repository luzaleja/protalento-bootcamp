package pruebas;

import java.util.Scanner;

public class General {

	public static void main(String[] args) {
		
		System.out.println("HOla".replace("Ho","hO"));
		
		System.out.println("Hola".concat("Mundo").concat(" "));
		
		int a = 1;
		if (a>0) {
			System.out.println("si");
		}else{
			System.out.println("no");
		}
		
		float numeroDecimal = 5.602f;
		
		System.out.println(String.format("%.5f",numeroDecimal));
		
		System.out.println("Hola Mundo".substring(3));
		
		System.out.println(Math.abs(6.3654f));
		
		Scanner scanner = new Scanner(System.in);

		byte numeroByte;

		System.out.print("Escriba un numero en el rango [-128, 127]: ");

		numeroByte = scanner.nextByte();

		System.out.println("Escribio: " + numeroByte);

		scanner.close();
		
		System.out.println("         Hola Mundo   ".trim());
		
		
	}
}