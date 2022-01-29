package ejercicioAdicionalSemana11;

public class Aleman implements IIdioma {

	@Override
	public void saludar() {
		System.out.println("Hallo");
	}

	@Override
	public void presentarse(String nombre, String apellido) {
		System.out.println("Mein Name ist " + nombre + " " + apellido);
	}

	@Override
	public void despedirse() {
		System.out.println("Tschüss");
	}

}
