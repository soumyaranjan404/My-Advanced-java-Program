package demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieDao implements Dao {
	private static MovieDao instance = new MovieDao();
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String queryString = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
	Connection con = null;

	private MovieDao() {

	} 

	public static MovieDao getInstance() {
		return instance;
	}

	public static Movie rowtoMovie(ResultSet rs)

	{
		if (rs != null) {
			try {
				return new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean insertMovie(Movie movie) {
		String query = "insert into movie values(?,?,?,?,?,?,?)";

		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(queryString);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, movie.getId());
			pt.setString(2, movie.getName());
			pt.setString(3, movie.getHero());
			pt.setString(4, movie.getHeroine());
			pt.setDate(5, movie.getReleaseDate());
			pt.setDouble(6, movie.getBudget());
			pt.setDouble(7, movie.getCollection());
			int insert = pt.executeUpdate();
			if (insert == 1)
				return true;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Movie findMovieByid(int id) {
		String query = "select id,name,hero, heroine,releaseDate,budget,collection from movie where id=?";
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(queryString);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, id);
			ResultSet rs = pt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					int idval = rs.getInt("id");
					String moviename = rs.getString("name");
					String hero = rs.getString("hero");
					String heroine = rs.getString("heroine");
					Date releaseDate = rs.getDate("releaseDate");
					double budget = rs.getDouble("budget");
					double collection = rs.getDouble("collection");
					return new Movie(idval, moviename, hero, heroine, releaseDate, budget, collection);

				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<Movie> findAllMovie()

	{
		ArrayList<Movie> al = new ArrayList<Movie>();
		try {
			String query = "select * from movie";
			Class.forName(driverName);
			con = DriverManager.getConnection(queryString);
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet executeQuery = statement.executeQuery();
			while (executeQuery.next()) {
				al.add(rowtoMovie(executeQuery));
			}
			if (al != null) {
				return al;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteMovieById(int id) {
		String deletequery = "delete from movie where id=1";
		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(queryString);
			Statement stmt = con.createStatement();
			int noofrows = stmt.executeUpdate(deletequery);
			if (noofrows != 0) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	public boolean updateMovie(Movie movie,int id)
	
	{
		String updateQuery = "update movie set name=?,hero=?,heroine=?,releaseDate=?,budget=?,collection=? where id= ?";
		Connection connection = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(queryString);
			PreparedStatement statement = connection.prepareStatement(updateQuery);
      
      
			statement.setString(1, movie.getName());
			statement.setString(2, movie.getHero());
			statement.setString(3, movie.getHeroine());
			statement.setDate(4, movie.getReleaseDate());
			statement.setDouble(5, movie.getBudget());
			statement.setDouble(6, movie.getCollection());
			statement.setInt(7, id);

			int rows_updated = statement.executeUpdate();

			if (rows_updated == 1)
				return true;

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

