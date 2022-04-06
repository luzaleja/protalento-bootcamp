package ar.com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/controllers/BuscarProductosServlet")
public class BuscarProductosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArticulosService service = new ArticulosServiceImpl();
		
		try {
			List<Articulos> listado = service.findAll();
			req.setAttribute("LISTADO", listado);
			//mando el listado
			getServletContext().getRequestDispatcher("/listado.jsp").forward(req,resp);
		} catch(ServiceException e) {
			List<Articulos> listado = new ArrayList<>();
			//si no puede encontrar articulos con el findAll
			//envio un listado vacio
			req.setAttribute("LISTADO", listado);
			getServletContext().getRequestDispatcher("/listado.jsp").forward(req,resp);
		}
	}
}
