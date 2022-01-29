package ar.com.educacionit.domain;

import ar.com.educacionit.services.CategoriaService;
//import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SociosServiceImpl;

public class SociosTest2 {

	public static void main(String[] args) throws ServiceException{
		
		SociosService service = new SociosServiceImpl();
		Socios socio = service.getOne(5l);
		
		socio.setApellido("nuevo apellido");
		socio.setNombre("nuevo nombre");
		socio.setEmail("emaillargounmailunmailunmailunmailunmailunmailunmailunmailunmailunmailunmailunmail@mail.com.ar");
		
		service.update(socio);
		
		
		
		/*
		//eso el constructor de la clase Socios sin id para instanciar un objeto
		Socios nuevoSocio = new Socios(nombre, apellido, email, direccion, pais);
		
		// si quiero invocar y crear en la base de datos un registro
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		// como ya tenemos la instancia creada nuevoSocio, le pasamos sus datos
		// a socioImpl para que use su metodo que viene de la interface iCrud
		// create, para que inserte estos datos a la tabla y cree el nuevo socio alla
		socioImpl.create(nuevoSocio);
		
		System.out.println("se ha creado el socios id: "+ nuevoSocio.getId());
		
		Socios otroSocio = socioImpl.findById(5L);
		
		if(otroSocio != null) {
			System.out.println("se ha creado el socios id: " + otroSocio.getId());
		}else {
			System.out.println("se ha encontrado al socio: " + otroSocio);
		}
		*/
		
	}
}
