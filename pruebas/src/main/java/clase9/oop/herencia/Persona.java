package clase9.oop.herencia;

public abstract class Persona {

	// atributos
	
	private String nombre;
	protected String apellido;
	public String colorPelo;
	public final int cantidadOrejas = 2;
	//no se puede cambiar este atributo pues se tiene como constante
	// por ejemplo al usar el constructor, no se puede cambiar
	public static int cantidadNariz = 1;
	// como es static, el valor es para todas las instancias
	// si alguien cambia el valor, se cambia para todas las instancias
	//CineMain2
	//public final static int cantidadNariz = 2;
	// es para TODOS y no se puede cambiar
	
	
	// constructor
	
	public Persona(String nombre, String apellido, String colorPelo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.colorPelo = colorPelo;
	}
	
	
	public final int getCantidadOjos() {
		return 2; // ninguno de sus hijos puede cambiarla o sobreescribirla
	}
	
	//get y set
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public void detalle() {
		System.out.println(this.toString());
		//manda a archivo
		detallar();
	}
	
	// metodo es del OBject, pero PErsona le cambia el comportamiento
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public abstract void detallar();
	//no esta implementado por que el o los hijos deben implementar
	///el comportamiento
	
}
