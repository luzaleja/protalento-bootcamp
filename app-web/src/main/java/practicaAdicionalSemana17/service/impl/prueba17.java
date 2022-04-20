package practicaAdicionalSemana17.service.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana17.service.ListadoService;

public class prueba17 {

	public static void main(String[] args) {

		ListadoService ls = new ListadoServiceImpl();
		
		List<Imagenes> list = new ArrayList<>();
		
		Imagenes imge = new Imagenes(6L,"https://cdn.pixabay.com/photo/2018/11/09/08/08/forest-3804001_960_720.jpg");
		
		try {
			ls.update(imge);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		try {
			list = ls.findAll();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		for(Imagenes img : list) {
			System.out.println(img);
		}
	}

}
