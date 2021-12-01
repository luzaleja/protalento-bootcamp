package ar.com.educacionit.domain;

import java.util.Date;

public class ArticuloTest {
	
	public static void main(String[] args) {
		//assert
		Articulos miArticulo = new Articulos("titulo1", new Date(), "0001", 2500d, 5, 1l, 1l);
	
		miArticulo.getTitulo().equals("titulo1");
		
		System.out.println("ok");
	
		String titulo = miArticulo.getTitulo(true);
		
		boolean iguales = titulo.equals("TITULO1");
		//f3 vamos a ver el metodo getTitulo
		//alt flecha izquierda vamos al archivo anterior
		
		if (iguales) {
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
	}

}
