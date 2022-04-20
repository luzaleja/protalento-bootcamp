package practicaAdicionalSemana17.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana17.service.ListadoService;
import practicaAdicionalSemana17.service.impl.ListadoServiceImpl;

@WebServlet("/ListadoImagenesServlet")
public class ListadoImagenesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//buscar todas las imagenes
		ListadoService ls = new ListadoServiceImpl();
		
		List<Imagenes> images = new ArrayList<>();
		
		try {
			images = ls.findAll();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		req.getSession().setAttribute("listadoImagenes", images);
		
		getServletContext().getRequestDispatcher("/tabla.jsp").forward(req, resp);
	}
	
}
