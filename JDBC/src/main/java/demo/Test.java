package demo;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		
		MovieDao m1 = MovieDao.getInstance();
		Date date = Date.valueOf("2021-05-28");
		Movie name =m1.findMovieByid(1);
		System.out.println(name);
		m1.insertMovie(new Movie(2,"DJ","Allu","kartina",date,200,1000));
	

//boolean movidelete= m1.deleteMovieById(1);
//System.out.println(movidelete);
		System.out.println(m1.findAllMovie());

	}

}
