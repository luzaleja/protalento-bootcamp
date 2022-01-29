package ejercicioAdicionalSemana11;

public class Ingles implements IIdioma {

	@Override
	public void saludar() {
		System.out.println("Hello");
	}

	@Override
	public void presentarse(String nombre, String apellido) {
		System.out.println("My name is " + nombre + " " + apellido);
	}

	@Override
	public void despedirse() {
		System.out.println("Goodbye");
	}

}
