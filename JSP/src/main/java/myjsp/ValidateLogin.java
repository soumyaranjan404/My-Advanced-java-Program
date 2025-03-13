package myjsp;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

import com.jdbc.EmpOperation;
import com.jdbc.EmployeData;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/ValidateLogin")
public class ValidateLogin extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("username");
		String email = request.getParameter("email");
		EmpOperation obj=EmpOperation.getInstance();
		EmployeData emp=obj.findEmployeeData(name, email);
		if(emp!=null)
		{
			RequestDispatcher r=request.getRequestDispatcher("success.jsp");
			r.forward(request, response);
			
		}
		else
		{
			RequestDispatcher r=request.getRequestDispatcher("Error.jsp");
			r.forward(request, response);
		}
			}

}
