package clase9.oop.herencia;

public class Empleado extends Persona {

	// atributo propio del empleado
	private Integer id;
	
	
	// como persona tiene 3 parametros
	// empleado debe tener minimo esos 3 parametros
	
	public Empleado(String nombre, String apellido, String colorPelo, Integer id) {
		// antes de nacer el empleado, nace la persona
		super(nombre,apellido,colorPelo);

		// puedo setear los atributos propios
		this.id = id;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}	
	
	
	
	// cambiar el comportamiento del padre
	// reutilizar lo del padre + lo propio
	
	/*
	public void detalle() {
		// le digo al padre, muestra el detalle
		super.detalle();
		// ahora yo muestro mi detalle
		System.out.println("Id: "+ this.getId());
	}
	*/
	
	public void detallar() {
		System.out.println("Id: "+ this.getId());
	}
	
	
}

