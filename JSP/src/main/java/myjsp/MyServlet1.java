package myjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/first")
public class MyServlet1 implements Servlet {

	private  ServletConfig config; 

	public MyServlet1()
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
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Servlet Navbar</title>\r\n"
				+ "    <style>\r\n"
				+ "        /* Reset default margin and padding */\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Navbar styling */\r\n"
				+ "        .navbar {\r\n"
				+ "            background-color: #007bff; /* Blue background */\r\n"
				+ "            padding: 15px 20px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "            align-items: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Logo styling */\r\n"
				+ "        .logo {\r\n"
				+ "            color: white;\r\n"
				+ "            font-size: 24px;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Navigation links */\r\n"
				+ "        .nav-links {\r\n"
				+ "            list-style: none;\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 20px;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .nav-links li {\r\n"
				+ "            display: inline;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Styling for anchor links */\r\n"
				+ "        .nav-links a {\r\n"
				+ "            color: white;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            font-size: 18px;\r\n"
				+ "            padding: 8px 12px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            transition: background 0.3s;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Hover effect */\r\n"
				+ "        .nav-links a:hover {\r\n"
				+ "            background-color: rgba(255, 255, 255, 0.2);\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "    <nav class=\"navbar\">\r\n"
				+ "        <div class=\"logo\">My WebApp</div>\r\n"
				+ "        <ul class=\"nav-links\">\r\n"
				+ "            <li><a href=\"login\">login</a></li>\r\n"
				+ "            <li><a href=\"form\">form</a></li>\r\n"
				+ "        </ul>\r\n"
				+ "    </nav>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "";
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
