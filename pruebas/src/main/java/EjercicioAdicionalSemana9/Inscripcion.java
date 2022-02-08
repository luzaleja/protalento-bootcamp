package EjercicioAdicionalSemana9;

public class Inscripcion {

	// La inscripcion se va a guardar por cada alumno, 
	// de acuerdo a su matricula y a la materia a la que se está inscribiendo
		
	// Una matricula es unica, no se puede repetir entre alumnos
	// Una materia va a tener un id unico dependiendo del curso y el turno
		
	private Long idInscripcion; // [0]
	private Long matricula; // de alumno [1]
	private Long idMateria; // [2]
	private static long contador = 0;
	
	public Inscripcion(Long matricula, Long idMateria) {
		super();
		contador += 1;
		this.idInscripcion = contador;
		this.matricula = matricula;
		this.idMateria = idMateria;
	}

	public Long getIdInscripcion() {
		return idInscripcion;
	}

	public Long getMatricula() {
		return matricula;
	}

	public Long getIdMateria() {
		return idMateria;
	}

	@Override
	public String toString() {
		return "Inscripcion [idInscripcion=" + idInscripcion + ", matricula=" + matricula + ", idMateria=" + idMateria
				+ "]";
	}

	
}
