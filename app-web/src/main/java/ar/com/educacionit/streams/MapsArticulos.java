package ar.com.educacionit.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class MapsArticulos {

	public static void main(String[] args) throws ServiceException {

		Collection<Articulos> articulos = new ArticulosServiceImpl().findAll();
		
		//solo quiero el precio de los articulos
		//y de precio mayor a algo
		
		List<Double> precioArticulos = articulos.stream()
					.map(aux -> aux.getPrecio())
					.filter(aux -> aux >= 500)
					.collect(Collectors.toList());
		
		System.out.println(precioArticulos);
	}

}
