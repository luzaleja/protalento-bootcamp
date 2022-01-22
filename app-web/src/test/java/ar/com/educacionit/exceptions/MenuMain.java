package ar.com.educacionit.exceptions;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {

		try {
			Integer op = MenuOption.getMenu();
			System.out.println("Ejecutando opcion " + op);
		} catch (InvalidMenuException e) {
			e.printStackTrace();
			System.exit(0); //salir de la aplicacion
		}
		
	}
}