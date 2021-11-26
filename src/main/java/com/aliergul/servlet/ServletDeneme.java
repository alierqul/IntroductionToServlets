package com.aliergul.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * http://localhost:8080/01_Servlets/home
 * Web tarayıcısı üzerinden Java Çalıştırmayı Sağlıyor.
*/
@WebServlet("/home")
public class ServletDeneme extends HttpServlet {
	private static final long serialVersionUID = -7003761688667485174L;

	public ServletDeneme() {
		//super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//	super.doGet(req, resp);
		
		resp.getWriter().append("Server Bilgisi")
		.append(req.getContextPath()).append("\n");
		
		resp.getWriter().append("Method Bilgisi")
		.append(req.getMethod());
		}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	
}
