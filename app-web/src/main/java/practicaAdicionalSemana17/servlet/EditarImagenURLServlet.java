package practicaAdicionalSemana17.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana17.service.ListadoService;
import practicaAdicionalSemana17.service.impl.ListadoServiceImpl;

@WebServlet("/EditarImagenURLServlet")
public class EditarImagenURLServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//traemos los datos del request
		String idStr = req.getParameter("imagenSeleccionada");
		String urlStrNueva = req.getParameter("urlNueva");
		
		//se que viene un numero en el idStr porque es un select
		Long id = Long.parseLong(idStr);
		
		//Si la url no viene vacia, la cambiamos
		if(!urlStrNueva.trim().isEmpty()) {
			//Creamos la imagen con el id y la nueva url
			
			Imagenes imagen = new Imagenes(id,urlStrNueva);
			
			//Hacemos el update
			ListadoService ls = new ListadoServiceImpl();
			try {
				ls.update(imagen);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		//borramos el carrousel actual del request para que cuando vaya al index 
		//busque nuevamente en la base de datos el actualizado
		
		req.removeAttribute("imagenes");
		req.getSession().removeAttribute("listadoImagenes");
		
		//enviamos al carrousel
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
	}
}
