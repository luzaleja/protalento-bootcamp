package EjercicioAdicionalSemana9;

public class Inscripcion {

	// La inscripcion se va a guardar por cada alumno, 
	// de acuerdo a su matricula y a la materia a la que se está inscribiendo
		
	// Una matricula es unica, no se puede repetir entre alumnos
	// Una materia va a tener un id unico dependiendo del curso y el turno
		
	private Long idInscripcion; // [0]
	private Long idAlumno; // de alumno [1]
	private Long idMateria; // [2]
	
	public Inscripcion(Long idAlumno, Long idMateria) {
		this.idAlumno = idAlumno;
		this.idMateria = idMateria;
	}

	public Inscripcion(Long idInscripcion, Long idAlumno, Long idMateria) {
		this.idInscripcion = idInscripcion;
		this.idAlumno = idAlumno;
		this.idMateria = idMateria;
	}

	public Long getIdInscripcion() {
		return idInscripcion;
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

	@Override
	public String toString() {
		return "Inscripcion [idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria
				+ "]";
	}

	
}
