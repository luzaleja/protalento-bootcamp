package ejercicioAdicionalSemana9in2;

import java.util.Objects;

public class Materias extends Entity {

	private Long idMateria;
	private String curso;
	private String turno;
	
	public Materias(Long idMateria, String curso, String turno) {
		this.idMateria = idMateria;
		this.curso = curso;
		this.turno = turno;
	}

	public Materias(String curso, String turno) {
		this.curso = curso;
		this.turno = turno;
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

	public Long getIdMateria() {
		return idMateria;
	}

	@Override
	public String toString() {
		return "Materias [idMateria=" + idMateria + ", curso=" + curso + ", turno=" + turno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMateria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materias other = (Materias) obj;
		return Objects.equals(idMateria, other.idMateria);
	}
	
	
	
}
