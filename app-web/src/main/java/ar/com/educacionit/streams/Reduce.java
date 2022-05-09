package ar.com.educacionit.streams;

import java.util.Collection;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class Reduce {

	public static void main(String[] args) throws ServiceException {

		Collection<Articulos> list = new ArticulosServiceImpl().findAll();
		
		//sumar el precio de cada articulo
		
		Double res = list.stream()
			.map(x -> x.getPrecio())
			.reduce(0d, (x,y) -> x + y ); //valor inicial, parametros, expresion 
		
		
		System.out.println(res);
	}

}
