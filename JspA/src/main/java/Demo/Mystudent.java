package Demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Mystudent extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s1 = new Student(2,"syama","21");
		Student s2= new Student(3,"sita","99");
		req.setAttribute("syama", s1);
		req.setAttribute("sita", s2);
		req.getRequestDispatcher("/Display.jsp").forward(req, resp);
	}
	
}
