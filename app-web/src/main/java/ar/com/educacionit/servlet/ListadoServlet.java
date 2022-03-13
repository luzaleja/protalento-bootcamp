package ar.com.educacionit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listado")
public class ListadoServlet extends HttpServlet {
	//Los servlet no tienen el metodo main, porque no son de tipo consola
	//sino web
	//servlet es una clase java que atiende peticiones (requests)
	
	//el doPost es como el main 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("llegue al servlet /listado que escucha y atiende por POST");//esto imprime por consola
		resp.getWriter().print("hola frontend, soy el backend y atendi tu solicitud por POST");//esto en el frontend
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("hola frontend, soy el backend y atendi tu solicitud por GET");
	}
}
