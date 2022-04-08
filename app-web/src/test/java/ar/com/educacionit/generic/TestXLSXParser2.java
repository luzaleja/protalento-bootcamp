package ar.com.educacionit.generic;

import java.io.IOException;
import java.util.Collection;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class TestXLSXParser2 {

	public static void main(String[] args) throws IOException {

		String path = "./src/test/java/ar/com/educacionit/generic/articulos.xlsx"; //falta hacer el excel y poner el path
		//ver file parser main 
		
		IParser<Collection<Articulos>> xlsxParser = new XLSXFileParser(path);

		try {
			Collection<Articulos> articulos = xlsxParser.parse();
			System.out.println(articulos.size() == 1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
