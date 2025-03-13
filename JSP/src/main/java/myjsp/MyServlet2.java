package myjsp;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/login")

public class MyServlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 String respons="<!DOCTYPE html>\r\n"
	 		+ "<html lang=\"en\">\r\n"
	 		+ "<head>\r\n"
	 		+ "    <meta charset=\"UTF-8\">\r\n"
	 		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
	 		+ "    <title>Login Page</title>\r\n"
	 		+ "    <style>\r\n"
	 		+ "        /* Reset default margin and padding */\r\n"
	 		+ "        body {\r\n"
	 		+ "            font-family: Arial, sans-serif;\r\n"
	 		+ "            margin: 0;\r\n"
	 		+ "            padding: 0;\r\n"
	 		+ "            background-color: #f4f4f4;\r\n"
	 		+ "            display: flex;\r\n"
	 		+ "            justify-content: center;\r\n"
	 		+ "            align-items: center;\r\n"
	 		+ "            height: 100vh;\r\n"
	 		+ "        }\r\n"
	 		+ "\r\n"
	 		+ "        /* Login container */\r\n"
	 		+ "        .login-container {\r\n"
	 		+ "            background: white;\r\n"
	 		+ "            padding: 20px;\r\n"
	 		+ "            border-radius: 10px;\r\n"
	 		+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n"
	 		+ "            width: 300px;\r\n"
	 		+ "            text-align: center;\r\n"
	 		+ "        }\r\n"
	 		+ "\r\n"
	 		+ "        /* Input fields */\r\n"
	 		+ "        .login-container input {\r\n"
	 		+ "            width: 100%;\r\n"
	 		+ "            padding: 10px;\r\n"
	 		+ "            margin: 10px 0;\r\n"
	 		+ "            border: 1px solid #ccc;\r\n"
	 		+ "            border-radius: 5px;\r\n"
	 		+ "        }\r\n"
	 		+ "\r\n"
	 		+ "        /* Login button */\r\n"
	 		+ "        .login-container button {\r\n"
	 		+ "            background-color: #007bff;\r\n"
	 		+ "            color: white;\r\n"
	 		+ "            padding: 10px;\r\n"
	 		+ "            width: 100%;\r\n"
	 		+ "            border: none;\r\n"
	 		+ "            border-radius: 5px;\r\n"
	 		+ "            cursor: pointer;\r\n"
	 		+ "            font-size: 16px;\r\n"
	 		+ "        }\r\n"
	 		+ "\r\n"
	 		+ "        /* Button hover effect */\r\n"
	 		+ "        .login-container button:hover {\r\n"
	 		+ "            background-color: #0056bre3;\r\n"
	 		+ "        }\r\n"
	 		+ "    </style>\r\n"
	 		+ "</head>\r\n"
	 		+ "<body>\r\n"
	 		+ "\r\n"
	 		+ "    <div class=\"login-container\">\r\n"
	 		+ "        <h2>Login</h2>\r\n"
	 		+ "        <form action=\"ValidateLogin\" method=\"GET\">\r\n"
	 		+ "            <input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required>\r\n"
	 		+ "            <input type=\"email\" name=\"email\" placeholder=\"Enter email\" required>\r\n"
	 		+ "            <button type=\"submit\">Login</button>\r\n"
	 		+ "        </form>\r\n"
	 		+ "    </div>\r\n"
	 		+ "\r\n"
	 		+ "</body>\r\n"
	 		+ "</html>\r\n"
	 		+ "";
		res.getWriter().println(respons);
	}

}
