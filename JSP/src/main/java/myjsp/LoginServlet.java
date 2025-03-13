package myjsp;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.jdbc.EmpOperation;
import com.jdbc.EmployeData;


import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/LoginServlet")

public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String join= req.getParameter("joiningDate");
      
        double salary = Double.parseDouble(req.getParameter("salary"));
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String role = req.getParameter("role");
         Date date = Date.valueOf(req.getParameter("joiningDate"));
        EmployeData emp = new EmployeData(id,name,date,salary,email,phoneNumber,role);
        EmpOperation em= EmpOperation.getInstance();
        em.saveEmployee(emp);
        res.getWriter().println("<h2>inser succefully</h2>");
		
	}

}
