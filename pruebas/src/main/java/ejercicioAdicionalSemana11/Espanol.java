package ejercicioAdicionalSemana11;

public class Espanol implements IIdioma {

	@Override
	public void saludar() {
		System.out.println("Hola");
	}

	@Override
	public void presentarse(String nombre, String apellido) {
		System.out.println("Mi nombre es "+nombre + " " + apellido);
	}

	@Override
	public void despedirse() {
		System.out.println("Hasta Luego");
	}

}
