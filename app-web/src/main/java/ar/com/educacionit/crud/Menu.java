package ar.com.educacionit.crud;

public class Menu {

	public static void mostrar() {
		System.out.println("Ingrese la opcion: ");
		System.out.println("1 - alta");
		System.out.println("2 - baja");
		System.out.println("3 - modificar");
		System.out.println("4 - eliminar");
	}
	
	public static void mostrarContinuar() {
		System.out.println("Desea continuar: ");
		System.out.println("1 - SI ");
		System.out.println("Cualquier tecla - NO");
	}
}
