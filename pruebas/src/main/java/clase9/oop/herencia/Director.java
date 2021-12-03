package clase9.oop.herencia;

public final class Director extends Persona{

	// final: no se puede hacer más herencia
	
	private Integer empACargo;

	

	public Director(String nombre, String apellido, String colorPelo, Integer empACargo) {
		super(nombre, apellido, colorPelo);
		this.empACargo = empACargo;
	}


	public Integer getEmpACargo() {
		return empACargo;
	}


	public void setEmpACargo(Integer empACargo) {
		this.empACargo = empACargo;
	}
	
	/*
	public void detalle() {
		super.detalle();
		System.out.println("Empleados a cargo: "+this.getEmpACargo());
	}
	*/
	//implementar el metido del padre
	
	public void detallar() {
		System.out.println("Empleados a cargo: "+this.getEmpACargo());
	}
	
	//metodo estatico le pertenece a la clase, no a la instancia
	// no necesito instanciar a la clase director para usar el metodo
	public static void delegar(Empleado empleado, String tarea) {
		empleado.detalle();
		System.out.println("Ejecutando tarea delegada: "+ tarea);
	}
	
}
