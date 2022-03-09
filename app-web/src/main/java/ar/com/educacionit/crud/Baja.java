package ar.com.educacionit.crud;

public class Baja implements Ejecutable {

	@Override
	public void ejecutar() {
		System.out.println("Ejecutando baja");
	}

	@Override
	public void ejecutar(Data data) {
		System.out.println("Ejecutando baja: " + data);
		
	}

}
