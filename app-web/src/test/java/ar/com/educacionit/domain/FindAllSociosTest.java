package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class FindAllSociosTest {

	public static void main(String[] args) {
		
		// creo la implementacion que me permite acceder a la db (CRUDl)
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		
		Socios[] vectorDeSocios = socioImpl.findAll();
		
		for(Socios socio : vectorDeSocios) {
			System.out.println(socio);
		}
	}
}
