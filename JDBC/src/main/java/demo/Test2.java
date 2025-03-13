package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========Application============");
		System.out.println("1 for savemovie");
		System.out.println("2 for deletemovie");
		System.out.println("3  for updatemovie");
		System.out.println("4 for finadall movie");
		System.out.println("5 for findmovie by id");
		MovieDao m = MovieDao.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("enter your choice");
			int choice = Integer.parseInt(reader.readLine());
			System.out.println(choice);

			switch (choice) {
			case 1: {
				System.out.println("tellmovie id");
				int intvalue = Integer.parseInt(reader.readLine());
				System.out.println("tell movie name");
				String movie = reader.readLine();
				System.out.println("tell hero name");
				String hero = reader.readLine();
				System.out.println("tell heroine name");
				String heroine = reader.readLine();
				System.out.println("tel relase date");
				Date date = Date.valueOf(reader.readLine());
				System.out.println("tell budget");
				double budget = Double.parseDouble(reader.readLine());
				System.out.println("tell collection");
				double collection = Double.parseDouble(reader.readLine());
				m.insertMovie(new Movie(intvalue, movie, hero, heroine, date, budget, collection));
				break;
			}

			case 2:
				System.out.println("enter id for delete");
				int id = Integer.parseInt(reader.readLine());
				m.deleteMovieById(id);
				break;
			case 3:
				break;
			case 4:
				List<Movie> li = m.findAllMovie();
				System.out.println(li);
			case 5:
				System.out.println("enter id for find movie");
				int idno = Integer.parseInt(reader.readLine());
				Movie mn = m.findMovieByid(idno);
				System.out.println(mn);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
