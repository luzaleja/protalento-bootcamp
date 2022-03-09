package ejercicioAdicionalSemana9in2;

import java.util.Objects;

public class Inscripciones extends Entity {

	private Long idInscripcion;
	private Long idAlumno;
	private Long idMateria;
	
	public Inscripciones(Long idInscripcion, Long idAlumno, Long idMateria) {
		this.idInscripcion = idInscripcion;
		this.idAlumno = idAlumno;
		this.idMateria = idMateria;
	}

	public Inscripciones(Long idInscripcion, Long idMateria) {
		this.idInscripcion = idInscripcion;
		this.idMateria = idMateria;
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	public Long getIdInscripcion() {
		return idInscripcion;
	}

	@Override
	public String toString() {
		return "Inscripciones [idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idInscripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscripciones other = (Inscripciones) obj;
		return Objects.equals(idInscripcion, other.idInscripcion);
	}
	
	
}
