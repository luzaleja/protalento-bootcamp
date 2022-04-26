package ar.com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;
import ar.com.educacionit.web.enums.ViewKeysEnum;

@WebServlet("/controllers/ListadoServlet")
public class ListadoServlet extends HttpServlet {
	//Los servlet no tienen el metodo main, porque no son de tipo consola
	//sino web
	//servlet es una clase java que atiende peticiones (requests)
	
	//el doPost es como el main 
	
	@Override
	protected void doPost(HttpServletRequest entrada, HttpServletResponse salida) throws ServletException, IOException {
		System.out.println("llegue al servlet /listado que escucha y atiende por POST");//esto imprime por consola
		salida.getWriter().print("hola frontend, soy el backend y atendi tu solicitud por POST");//esto en el frontend
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instancio ArticulosService para poder llegar a la base de datos
		//y traer la lista requerida
		ArticulosService articuloService = new ArticulosServiceImpl();
		
		try {
			List<Articulos> articulos = articuloService.findAll();
			
			//guardamos el listado en un lugar llamado "request"
			request.setAttribute(ViewKeysEnum.LISTADO.getParam(), articulos);
			
			//ahora envia el request con el nuevo atributo, que es la lista
			//de articulos, a la otra pagina
			
			getServletContext().getRequestDispatcher("/listado.jsp").forward(request, response);
			//getServletContext() lo tiene porque extiende de HttpServlet
			//este encuentra el WebServlet de esta clase
			//getRequestDispatcher() lleva dentro a donde se va a mandar el request 
			//con el nuevo atributo
			//como es .jsp sabemos que es codigo java que se compila y se muestra como html
			//forward le esta diciendo que envia el request con el listado y la respuesta
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	
	
	}
}
