package pruebas;

import java.util.Scanner;

public class General {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont = 0;
		
		do{
			System.out.println("Ingrese su clave:");
			String clave = teclado.next();
			if (clave.equals("1234")) break;
			cont++;
			if(cont==1)System.out.println("Tiene dos chances !");
			if(cont==2)System.out.println("Atención!! Ultima oportunidad!");
		}while (cont < 3);
		
		if (cont == 3)
			System.out.println("tres veces fallidas");
		else 
			System.out.println("Bienvenido al sistema");

		teclado.close();
		
	}
}