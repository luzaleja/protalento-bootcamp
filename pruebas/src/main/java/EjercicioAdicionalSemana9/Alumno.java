package EjercicioAdicionalSemana9;

public class Alumno {

	//atributos
	
	private Long idAlumno;
	private String nombre;
	private String apellido;
	
	//constructor
	
	public Alumno(Long idAlumno, String nombre, String apellido) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//getters & setters
	
	public Long getIdAlumno() {
		return idAlumno;
	}

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

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	

	
}
