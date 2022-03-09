package ar.com.educacionit.generic;

import java.util.Collection;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class TestXLSXParser {

	public static void main(String[] args) throws ParseException {

		String path = "./src/test/java/ar/com/educacionit/generic/articulos.xlsx"; //falta hacer el excel y poner el path
		//ver file parser main 
		
		IParser<Collection<Articulos>> xlsxParser = new XLSXFileParser(path);

		Collection<Articulos> articulos = xlsxParser.parse();
		
		ArticulosService as = new ArticulosServiceImpl();
		
		for(Articulos unArticulo : articulos) {
			try {
				as.save(unArticulo);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
	}

}
