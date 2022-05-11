package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.domain.Users;

public interface UserDao {

	public Users getUserByUserName(String username) throws GenericException;
}
