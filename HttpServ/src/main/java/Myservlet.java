import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		resp.getWriter().println("<h1>"+username+"</h1>");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "  <meta charset=\"UTF-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "  <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "  <form action=\"login\" method=\"post\">\r\n"
				+ "    <label for=\"name\">user name</label>\r\n"
				
				+ "    <input type=\"text\" id=\"name\" name=\"username\" placeholder=\"enter user name\">\r\n"
				+ "<br>"
				+ "    <label for=\"password\"> password</label>\r\n"
				+ "    <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"enter password\">\r\n"
				+ "<br>"
				+ "<button>login</button>"
				+ "  </form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
			
	}

}
