package ar.com.educacionit.services.exceptions;

public class ServiceException extends Exception{

	//private String errorCode;
	//private String description;
	
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	//otro constructor que reciba la GenericException
}
