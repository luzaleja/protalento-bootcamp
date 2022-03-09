package ejercicioAdicionalSemana9in2;

import java.util.HashSet;
import java.util.Set;

public class DatosDBMemoria {

	Set<Alumnos> alumnos = new HashSet<>();
	Set<Materias> materias = new HashSet<>();
	Set<Inscripciones> inscripciones = new HashSet<>();

	public void crearAlumno(Alumnos alumno) {
		alumnos.add(alumno);
	}
	
	public void crearMateria(Materias materia) {
		materias.add(materia);
	}

	public void crearInscripcion(Inscripciones inscripcion) {
		inscripciones.add(inscripcion);
	}
	
	public void buscarInscripcion() {
		
	}
	
	public void eliminarInscripcion() {
		
	}
}
