import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/first")
public class MyServlet implements Servlet {
	private  ServletConfig config;

	public MyServlet()
	{
		System.out.println("no ars constructor");
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("init method");

	}

	@Override
	public ServletConfig getServletConfig() {

		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method");
		String response="<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "   <meta charset=\"UTF-8\">\r\n"
				+ "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "   <title>Login page</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "   <h1>Login Page</h1>\r\n"
				+ "   <form action=\"/submit_login\" method=\"post\">\r\n"
				+ "      <label for=\"username\">Username:</label><br>\r\n"
				+ "      <input type=\"text\" id=\"username\" name=\"username\"><br>\r\n"
				+ "      <label for=\"password\">Password:</label><br>\r\n"
				+ "      <input type=\"password\" id=\"password\" name=\"password\"><br>\r\n"
				+ "      <input type=\"submit\" value=\"Login\">\r\n"
				+ "   </form>\r\n"
				+ "   <a href=\"/forgot_password\">Forgot Password?</a>\r\n"
				+ "   <a href=\"/register\">Register</a>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		PrintWriter writer = res.getWriter();
		writer.println(response);

	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method");

	}

}
