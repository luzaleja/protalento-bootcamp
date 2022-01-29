package ar.com.educacionit.domain;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class FindAllSociosTest {

	public static void main(String[] args) {
		
		// creo la implementacion que me permite acceder a la db (CRUDl)
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		List<Socios> vectorDeSocios = new ArrayList<>();
		try {
			vectorDeSocios = socioImpl.findAll();
		} catch (GenericException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Socios socio : vectorDeSocios) {
			System.out.println(socio);
		}
	}
}
