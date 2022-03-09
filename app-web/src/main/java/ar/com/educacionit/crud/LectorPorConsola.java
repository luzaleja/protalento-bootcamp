package ar.com.educacionit.crud;

import java.util.Scanner;

public class LectorPorConsola implements ILectora {

	private Scanner teclado;
	private Integer opcion;
	
	public LectorPorConsola(Scanner teclado, Integer opcion) {
		this.teclado = teclado;
		this.opcion = opcion;
	}
	
	@Override
	public Data leerDatos() {
		Data data = new Data();
		Long id;
		String titulo;
		if(opcion == 1) {
			System.out.println("Ingrese el id: ");
			id = teclado.nextLong();
			System.out.println("Ingrese el titulo: ");
			titulo = teclado.next();
			data.setId(id);
			data.setTitulo(titulo);
		} else if(opcion == 2) {
			System.out.println("Ingrese el id: ");
			id = teclado.nextLong();
			data.setId(id);
		} else if(opcion == 3) {
			System.out.println("Ingrese el titulo: ");
			titulo = teclado.next();
			data.setTitulo(titulo);
		} else {
			System.out.println("Ingrese el id a eliminar: ");
			id = teclado.nextLong();
			data.setId(id);
		}
		return data;
	}

}
