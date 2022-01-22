package ar.com.educacionit.dao.exception;

/*
 * es una checked exception, entonces tienen que extender de Exception
 */

public class DuplicatedException extends Exception {

	public DuplicatedException(String message, Throwable cause) {
		super(message, cause);
	}


	
}
