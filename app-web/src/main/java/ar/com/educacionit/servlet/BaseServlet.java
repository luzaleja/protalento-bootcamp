package ar.com.educacionit.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.web.enums.ViewEnums;
import ar.com.educacionit.web.enums.ViewKeysEnum;

public class BaseServlet extends HttpServlet {

	public void addAttribute(HttpServletRequest req, ViewKeysEnum key, String value) {
		req.setAttribute(key.getParam(), value);
	}
	
	public void redirect(ViewEnums target, HttpServletRequest req, HttpServletResponse resp) {
		
	}
}
