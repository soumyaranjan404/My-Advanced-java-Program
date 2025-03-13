package demo;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= Date.valueOf("2021-05-19");
		String query = "insert into movie values(3,'dhruv','allu','alia','2023-09-12',700,12000)";
		
System.out.println(performDatabase(query));
	}
	public static boolean performDatabase(String query)
	
	{   Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
			Statement stm=con.createStatement();
			boolean isSelect=stm.execute(query);
			if(isSelect)
			{
				ResultSet rs=stm.getResultSet();
				while(rs.next())
				{
					Movie movie=MovieDao.rowtoMovie(rs);
					System.out.println(movie);
				}
			}
			else
			{
				int rowUpdate=stm.getUpdateCount();
				System.out.println(rowUpdate);		
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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

}
