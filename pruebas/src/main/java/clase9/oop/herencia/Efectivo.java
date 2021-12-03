package clase9.oop.herencia;

public class Efectivo extends Empleado {


	// alt shift s , generate constructor suplerclass
	public Efectivo(String nombre, 
			String apellido, 
			String colorPelo, 
			Integer id) {
		super(nombre, apellido, colorPelo, id);
	}
}
