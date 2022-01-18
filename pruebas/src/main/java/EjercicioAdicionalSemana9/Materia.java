package EjercicioAdicionalSemana9;

public class Materia {

	//atributos
	private Long id;
	private String curso;
	private String turno;
	
	//constructor
	
	public Materia(Long id, String curso, String turno) {
		super();
		this.id = id;
		this.curso = curso;
		this.turno = turno;
	}

	public Materia(String curso, String turno) {
		super();
		this.curso = curso;
		this.turno = turno;
	}

	//getters y setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", curso=" + curso + ", turno=" + turno + "]";
	}
	
	
	
	
}
