package ar.com.educacionit.domain;

import ar.com.educacionit.services.CategoriaService;
//import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SociosServiceImpl;

public class SociosTest {

	public static void main(String[] args) throws ServiceException{
		
		//simulo que alguien cargo los datos desde teclado
		String nombre = "JUAN";
		String apellido = "PEREZ";
		String email = "unmail3@mail.com";
		String direccion = "calle 13";
		Long pais = 1l; //1=ARG, 2=COL, 3=BRA, ETC
		Long userId = 1l;
		
		//Socios ss = new SociosServiceImpl().getOne(1l);
		//esto funciona porque el getOne usa el SociosDao para traer una variable de tipo Socios
		//System.out.println(ss);
		
		SociosService service = new SociosServiceImpl();
		Socios socio = new Socios(nombre,apellido,email,direccion,pais,userId);
		service.save(socio);
		
		
		//socio.setApellido("nuevo apellido");
		//socio.setNombre("nuevo nombre");
		//socio.setEmail("email@mail.com.ar");
		
		//service.update(socio);
		/*
		CategoriaService cservice = new CategoriaServiceImpl();
		Categorias categoria = new Categorias("televisores","abc1234",1l);
		cservice.save(categoria);
		
		categoria.setCodigo("10000");
		categoria.setDescripcion("descripcion nueva");
		
		cservice.update(categoria);
		
		*/
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
