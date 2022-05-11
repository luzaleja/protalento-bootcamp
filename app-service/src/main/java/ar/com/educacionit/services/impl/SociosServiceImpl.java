package ar.com.educacionit.services.impl;

//import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {

	public SociosServiceImpl() {
		super(new SocioDaoImpl());
	}
	//LISTA DE SERVICIOS 
	//para que el cliente no tenga acceso directo a la base de datos
	//se expone a los clientes lo necesario para que puedan 
	//acceder a la base de datos como nosotros queremos
	
	/*
	// atributos
	private SociosDao dao;
	
	// constructores
	public SociosServiceImpl() {
		//defino que implementacion usar de la interface SociosDao
		dao = new SocioDaoImpl();
	}
	
	public Socios getOne(Long id) {
		return dao.getOne(id);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	public Socios save(Socios entity) {
		return dao.save(entity);
	}

	public void update(Socios entity) {
		dao.update(entity);
	}

	public Socios[] findAll() {
		return dao.findAll();
	}
	*/
}
