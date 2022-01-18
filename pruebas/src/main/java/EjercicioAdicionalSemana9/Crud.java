package EjercicioAdicionalSemana9;

import java.util.Scanner;

public interface Crud {
	
	public Inscripcion inscribir(Scanner teclado) throws InscripcionYaExisteException;
	
	public void eliminar(Scanner teclado) throws InscripcionNoExisteException ;
	
	public void buscar(Scanner teclado);

}
