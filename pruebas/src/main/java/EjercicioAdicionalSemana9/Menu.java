package EjercicioAdicionalSemana9;

import java.util.Scanner;

public class Menu implements Crud {

	public Inscripcion inscribir(Scanner teclado) throws InscripcionYaExisteException{
		
		//inscripciones va a tener 0 = idInscripcion, 1=matricula, 2= idCurso
		
		System.out.println("Por favor ingrese los datos del alumno a inscribir: ");
		System.out.println("Ingrese el número de matricula: ");
		Long matricula = teclado.nextLong();
			
		System.out.println("Por favor ingrese el id de la materia a la que desea inscribir al alumno: ");
		Long idMateria = teclado.nextLong();
			
		System.out.println("Por favor ingrese el número único de inscripción: ");
		Long idInscripcion = teclado.nextLong();
		
		DatosDBMemoria datos = new DatosDBMemoria();
		if(datos.buscar(idInscripcion)) {
			throw new InscripcionYaExisteException("El id " +idInscripcion+" ya existe en la base de datos.");
		} else {
			return new Inscripcion(idInscripcion,matricula,idMateria);
		}
	}

	public void eliminar(Scanner teclado) throws InscripcionNoExisteException {
		System.out.println("Por favor indique el id de la inscripción que desea eliminar: ");
		Long idInscripcion = teclado.nextLong();
		DatosDBMemoria datos = new DatosDBMemoria();
		if(datos.buscar(idInscripcion)) {
			datos.borrarInscripcion(idInscripcion);
		} else {
			throw new InscripcionNoExisteException("El id "+idInscripcion+" no existe.");
		}
	}

	public void buscar(Scanner teclado) {
		System.out.println("Por favor indique el id de la inscripción que desea buscar: ");
		Long idInscripcion = teclado.nextLong();
		DatosDBMemoria datos = new DatosDBMemoria();
		datos.buscarInscripcion(idInscripcion);
	}
	
}
