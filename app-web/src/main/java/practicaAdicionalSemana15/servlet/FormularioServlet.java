package practicaAdicionalSemana15.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practicaAdicionalSemana15.entidades.Formulario;
import practicaAdicionalSemana15.repository.MapaRepository;

@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//traemos los datos del request
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String documento = req.getParameter("documento");
		String edad = req.getParameter("edad");
		String ocupacion = req.getParameter("ocupacion");
		String fechaNacimientoStr = req.getParameter("fechaNacimiento");
		
		List<String> requestValues = Arrays.asList(nombre,apellido,documento,edad,ocupacion,fechaNacimientoStr);
		
		//revisamos que no esten vacios
		int camposVacios = 0;
		String camposVaciosStr = "";
		
		int a = 0;
		for(String value:requestValues) {
			if(value.trim().isEmpty()) {
				camposVacios++;
				camposVaciosStr+=(a + " ");
			}
			a++;
		}
		
		//tenemos un target 
		String target = "/practicaAdicionalSemana15/success.jsp";
		
		//si algun campo esta vacio, enviamos a error
		if(camposVacios > 0) {
			target = "/practicaAdicionalSemana15/error.jsp";
			//guardamos los datos en resp para que se puedan utilizar
			req.setAttribute("camposVacios", camposVaciosStr);
		} else {
			//instanciamos el formulario y lo agregamos al map
			String[] fechaArray = fechaNacimientoStr.split("-");
			String fecha = fechaArray[2]+"/"+fechaArray[1]+"/"+fechaArray[0];
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNacimiento = null;
			try {
				fechaNacimiento = format.parse(fecha);
			} catch (ParseException e) {
				e.printStackTrace();
			}
					
			Formulario form = new Formulario(nombre,apellido,Long.parseLong(documento),Integer.parseInt(edad),ocupacion,fechaNacimiento);
			MapaRepository.addFormulario(form);
			
			//guardamos el mapa en session para que se pueda utilizar durante la sesion
			req.setAttribute("formulario", form);
		}
		
		getServletContext().getRequestDispatcher(target).forward(req,resp);
	}
}
