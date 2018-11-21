package br.com.dev.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	//middleware
	public OiMundoServlet() {
		System.out.println("Oi Mundo servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, servlet!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Servlet foi chamado!!!");
	}

	
	
}
