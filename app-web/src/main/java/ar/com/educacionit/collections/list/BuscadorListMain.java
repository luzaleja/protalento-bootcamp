package ar.com.educacionit.collections.list;

import java.util.List;

public class BuscadorListMain {

	public static void main(String[] args) {

		String clave = "iron man";
		//puede venir por teclado
		
		Buscador b = new Buscador(clave);
		
		b.buscar();
		
		List<String> resultados = b.getResultados();
		
		for(String res : resultados) {
			System.out.println(res);
		}
	}

}
