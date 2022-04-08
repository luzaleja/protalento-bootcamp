package ar.com.educacionit.filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ar.com.educacionit.domain.Users;
import ar.com.educacionit.web.enums.ViewKeysEnum;


@WebFilter(filterName = "/SessionFilter", urlPatterns = "/controllers/*")
public class SessionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			
		//obtener la url a donde vamos ("/controller/AlgunServlet")

		/*
		 el request de aca es diferente al de httpservlet.
		 el de http servlet esta dentro del request de aca
		 hacemos un casteo para poder quedarnos con el request q necesitamos
		 */
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		//String url = req.getRequestURI(); // /app-web/controllers/
		
		//String contextPath = req.getContextPath(); // /app-web
		
		//definir las rutas o url a las cuales no se aplica este filtro

		//List<String> validatePath = Arrays.asList(
		//		contextPath + "/controllers/"
		//		);
		
		//boolean mustValidate = false;
		
		//for(String path : validatePath) {
		//	if(url.contains(path)) {
		//		mustValidate = true;
		//		break;
		//	}
		//}
		
		/*
		for(int i = 0; !mustValidate && i < validatePath.size(); i++) {
			if(url.contains(validatePath.get(i))) {
		//		mustValidate = true;
		//		break;
		//	}
		}
		*/
		
		//stream
		
		//boolean valida = validatePath.stream().filter(x -> url.contains(x)).count() > 0;
		
		//logica
		HttpSession session = req.getSession(false);
		
		//if(mustValidate) {
			if(session == null) {
				req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(), "Debe logearse");
				req.getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				//obtener es usuario de la session para ver si esta logeado
				Users loggedUser = (Users)req.getSession().getAttribute(ViewKeysEnum.USER.getParam());
				
				//la session puede estar sucia, entonces primero revisamos que exista
				if(loggedUser != null) {
					//dejo que acceda al /controller/AlgunServlet solicitado
					chain.doFilter(request, response);
				} else {
					req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(), "Debe logearse");
					req.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			}
		//} else {
			//dejo que acceda al servlet solicitado
		//	chain.doFilter(request, response);
		//}
	}

}
