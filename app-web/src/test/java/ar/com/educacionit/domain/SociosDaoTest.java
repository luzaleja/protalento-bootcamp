package ar.com.educacionit.domain;

import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SociosServiceImpl;

public class SociosDaoTest {

	public static void main(String[] args) {
		
		SociosService service = new SociosServiceImpl();
		Socios socios = null; //inicializar la variable para que no salga error
		try {
			socios = service.getOne(1l);
		} catch (ServiceException se) {
			//si quiero el mensaje del ServiceException
			String msjDeService = se.getMessage();
			System.err.println(msjDeService);
			//si quiero la causa que origino se
			//que puede ser DuplicatedException o GenericException
			Throwable cause = se.getCause();
			//si quiero el mensaje de la causa
			String msjCause = cause.getMessage();
			System.err.println(msjCause);
		}
		//socio va a tener todos los atributos nulos por el momento
		System.out.println(socios);
		
		CategoriaService cservice = new CategoriaServiceImpl();
		Categorias c = null;
		try {
			c = cservice.getOne(2l);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
}
