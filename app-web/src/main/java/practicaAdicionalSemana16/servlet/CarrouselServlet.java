package practicaAdicionalSemana16.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Carrousel;
import practicaAdicionalSemana16.service.CarrouselService;
import practicaAdicionalSemana16.service.impl.CarrouselServiceImpl;

@WebServlet("/CarrouselServlet")
public class CarrouselServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CarrouselService cs = new CarrouselServiceImpl();
		
		Collection<Carrousel> carrousel = new ArrayList<>();
		
		try {
			carrousel = cs.getActiveCarrousel();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		req.setAttribute("imagenes", carrousel);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
