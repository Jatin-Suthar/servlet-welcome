package firstPackage;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Welcome extends HttpServlet {
	private String message = "";
	public void init() throws ServletException {
		message = "this is my first sevlet";
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>" + message + "</h1>");
	}
	public void destroy() {
		//nothing as such do nothing
	}
}

