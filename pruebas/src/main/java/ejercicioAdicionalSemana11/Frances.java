package ejercicioAdicionalSemana11;

public class Frances implements IIdioma {

	@Override
	public void saludar() {
		System.out.println("Bonjour");
	}

	@Override
	public void presentarse(String nombre, String apellido) {
		System.out.println("Je m'apelle " + nombre + " " + apellido);
	}

	@Override
	public void despedirse() {
		System.out.println("Au revoir");
	}

}
