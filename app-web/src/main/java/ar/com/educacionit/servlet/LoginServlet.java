package ar.com.educacionit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.educacionit.domain.Users;
import ar.com.educacionit.services.LoginService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.LoginServiceImpl;
import ar.com.educacionit.web.enums.ViewKeysEnum;
import ar.com.educacionit.web.enums.ViewEnums;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String data = req.getParameter("data");
	
		LoginDTO loginDTO = objectMapper.readValue(data, LoginDTO.class);
				
		ViewEnums target = ViewEnums.LOGIN_SUCCESS;

		//validaciones
		if(isValid(loginDTO.getUsername(), loginDTO.getPassword())) {

			//LOGIN SERVICE
			LoginService ls = new LoginServiceImpl();
			
			Users user;
			
			try {
				user = ls.getUserByUserNameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
				
				if(user == null) {
					req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(), ViewKeysEnum.USUARIO_PASSWORD_INVALIDO.getParam());
					target = ViewEnums.LOGIN;
				} else {
					//si el usuario existe, es decir, no es null, lo quiero guardar
					//lo puedo guardar en el request o en la session
					//como es un usuario con password, es mejor guardarlo
					//en la sesion
					req.getSession().setAttribute(ViewKeysEnum.USER.getParam(), user);
				}		
			} catch (ServiceException e) {	
				//crear una tabla de mapeo de errores clave-error
				//por ejemplo, si el error que encuentra java es x, devuelve error 401, etc
				req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(), e.getMessage());
				target = ViewEnums.LOGIN;
			}
		} else {
			req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(), ViewKeysEnum.USUARIO_PASSWORD_INVALIDO.getParam());
			target = ViewEnums.LOGIN;
		}
		
		// ir a target
		getServletContext().getRequestDispatcher(target.getView()).forward(req, resp);
	}
	
	protected boolean isValid(String usernameFromHtml, String passwordFromHtml) {
		return (usernameFromHtml != null && !usernameFromHtml.isBlank()) 
				&&
				(passwordFromHtml != null && !passwordFromHtml.isBlank());
	}
}
