package com.aliergul.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletClass
 */
@WebServlet(name="MyServletClass",
		urlPatterns = "/MyServletClass" )
//		initParams = { 
//				@WebInitParam(name = "userPass", value = "user"), 
//				@WebInitParam(name = "password", value = "123456")
//		})
public class MyServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		try {
			String userName=request.getParameter("userName");
			String pass=request.getParameter("password");
			out.println("<html>");
			
			out.println("<head>");
			out.println("<meta charset=\"ISO-8859-1\">");
			out.println("<title>MyServletClass Sınıfı Açıldı</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h2>Servlet Sayfası </h2>");
				out.println("<h2>Servlet Veri Alma</h2>");
				out.println("<h3>"+request.getContextPath()+"</h3>");
				out.println("<h2>Kullanıcı adı : <font color=red>"+userName+"</font></h2>");
				out.println("<h2>Paralo        : <font color=red>"+pass+"</font></h2>");
			out.println("</body>");
			
			out.println("</html>");
		} finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
