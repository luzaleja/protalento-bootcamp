package ejercicioAdicionalSemana9in2;

import java.util.Scanner;

public interface Crud<T extends Entity> {

	public T crear(Scanner teclado);
	
	public void eliminar(Scanner teclado);
	
	public void buscar(Scanner teclado);
}
