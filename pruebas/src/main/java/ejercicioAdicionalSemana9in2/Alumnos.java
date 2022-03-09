package ejercicioAdicionalSemana9in2;

import java.util.Objects;

public class Alumnos extends Entity {

	private Long idAlumno;
	private String nombre;
	private String apellido;
	
	public Alumnos(Long idAlumno, String nombre, String apellido) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Alumnos(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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

	public Long getIdAlumno() {
		return idAlumno;
	}

	@Override
	public String toString() {
		return "Alumnos [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlumno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumnos other = (Alumnos) obj;
		return Objects.equals(idAlumno, other.idAlumno);
	}
	
	
	
}
