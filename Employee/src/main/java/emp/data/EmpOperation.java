package emp.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpOperation implements EmployeeInterface {
	static private EmpOperation e = new EmpOperation();
	private EmpOperation()
	{
		
	}
	public static EmpOperation getInstance()
	{
		return e;
	}
	 public EmployeData getEmpData(ResultSet rs)
	 {     
		 if(rs!=null)
		 {
			 try {
				return new EmployeData(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getString(7));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return null;
	 }
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbconnector = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
	Connection con=null;
	
	
	public boolean saveEmployee(EmployeData emp)
	{    String query= "insert into employee values(?,?,?,?,?,?,?)";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbconnector);
			PreparedStatement pt=con.prepareStatement(query);
			pt.setInt(1, emp.getId());
			pt.setString(2, emp.getName());
			pt.setDate(3, emp.getJoiningDate());
			pt.setDouble(4, emp.getSalary());
			pt.setString(5, emp.getEmail());
			pt.setString(6, emp.getPhoneNumber());
			pt.setString(7,emp.getRole());
			int update=pt.executeUpdate();
			if(update!=0)
			{
				System.out.println("one record insert sucefuuly");
				return true;

			}			   
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public boolean deleteById(int id)
	{
		String query="delete from employee where id="+id;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbconnector);
			Statement st=con.createStatement();
		   boolean b=  st.execute(query);
		     if(!b)
		     {
		    	 System.out.println("delete succefull");
		    	 return true;
		     }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public List<EmployeData> findAllEmployees()
	
	{
		String query = "select * from employee";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbconnector);
			PreparedStatement pt=con.prepareStatement(query);
			ResultSet rs=pt.executeQuery();
			List<EmployeData> l = new ArrayList<EmployeData>();
			while(rs.next())
			{
				l.add(getEmpData(rs));
			}
				
			return l;	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public EmployeData findEmployeeById(int id)
	{  
		String query = "select * from employee where id="+id;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbconnector);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
				return getEmpData(rs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public EmployeData findEmployeesByPhoneNumber(String numb)
	{   String Query="select * from employee where phoneNumber="+numb;
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(dbconnector);
		
		 PreparedStatement pt=con.prepareStatement(Query);
		 ResultSet rs=pt.executeQuery();
		 while(rs.next())
			 return getEmpData(rs);
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		return null;
	}
	public boolean updateSalary(int id , double sal)
	{ String query="update employee set salary="+sal+"where id="+id;
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(dbconnector);
		PreparedStatement pt=con.prepareStatement(query);
		int num=pt.executeUpdate();
		if(num!=0)
		{
			System.out.println("one record is updated");
			return true;
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return false;
	}
	public boolean UpdateEmployee(int id , EmployeData emp)
	{
		return false;
	}
}
