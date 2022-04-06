package practicaAdicionalSemana16.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Carrousel;
import practicaAdicionalSemana16.service.CarrouselService;

public class prueba {

	public static void main(String[] args) {
		
		CarrouselService cs = new CarrouselServiceImpl();
		
		Collection<Carrousel> carrousel = new ArrayList<>();
		
		try {
			carrousel = cs.getActiveCarrousel();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	
		Carrousel c1 = carrousel.iterator().next();
		System.out.println(c1.getImagen());
		
		for(Carrousel image : carrousel) {
			if(image.getId() == c1.getId()) {
				continue;
			} else {
				System.out.println(image.getImagen());
			}
		}
	}

}