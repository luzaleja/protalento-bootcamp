package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.dao.UserDao;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.dao.impl.UserDaoImpl;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.domain.Users;
import ar.com.educacionit.services.LoginService;
import ar.com.educacionit.services.exceptions.ServiceException;
import at.favre.lib.crypto.bcrypt.BCrypt;

public class LoginServiceImpl implements LoginService {

	private UserDao userDao;
	private SociosDao socioDao;
	
	public LoginServiceImpl() {
		this.userDao = new UserDaoImpl();
		this.socioDao = new SocioDaoImpl();
	}
	
	@Override
	public Users getUserByUserNameAndPassword(String username, String passwordFromHtml) throws ServiceException {
		Users users = null;
		try {
			Users usersTemp = this.userDao.getUserByUserName(username);
			
			//valido password
			BCrypt.Result result = BCrypt.verifyer().verify(passwordFromHtml.getBytes(), usersTemp.getPassword().getBytes());				
			if(!result.verified) {
				users = null;
			} else {
				users = this.userDao.getUserByUserName(username);
				Socios socio = this.socioDao.getSociosByUserId(users.getId());
				users.setSocio(socio);
			}
			/*
			if(users != null) {
				Socios socio = this.socioDao.getSociosByUserId(users.getId());
				users.setSocio(socio);
			}*/
		} catch (GenericException e) {
			throw new ServiceException(e.getMessage(),e);
		}
		return users;
	}

}
