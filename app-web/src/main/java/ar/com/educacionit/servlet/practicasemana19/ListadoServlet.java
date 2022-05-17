package ar.com.educacionit.servlet.practicasemana19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Marcas;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.MarcasService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.MarcasServiceImpl;

@WebServlet("/ListadoServlet")
public class ListadoServlet extends HttpServlet {
	
	CategoriaService catService = new CategoriaServiceImpl();
	MarcasService marcaService = new MarcasServiceImpl();
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//obtener la lista de marcas
			List<Marcas> marcas = this.marcaService.findAll();

			//obtener la lista de categorias
			List<Categorias> categorias = this.catService.findAll();
			
			Map<String,Object> listado = new HashMap<>();
			listado.put("marcas", marcas);
			listado.put("categorias", categorias);
			
			//convertimos a json
			String json = objectMapper.writeValueAsString(listado);
			
			//escribo en el response el objeto
			resp.getWriter().print(json);
			
		} catch (ServiceException se) {
			//Si hay un error de conexion, mandamos un json con marcas y categorias vacias
			List<Marcas> marcas = new ArrayList<>();
			List<Categorias> categorias = new ArrayList<>();
			
			Map<String,Object> listado = new HashMap<>();
			listado.put("marcas", marcas);
			listado.put("categorias", categorias);
			
			//convertimos a json
			String json = objectMapper.writeValueAsString(listado);
			
			//escribo en el response el objeto
			resp.getWriter().print(json);
		}
	
	
	}
}
