package ar.com.educacionit.dao.exception;

public class GenericException extends Exception {

	public GenericException(String msj) {
		super(msj);
	}

	public GenericException(String msj, Throwable cause) {
		super(msj, cause);
	}
	
	
}
