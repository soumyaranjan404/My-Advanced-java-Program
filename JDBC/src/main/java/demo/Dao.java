package demo;

import java.util.List;

public interface Dao {
	public boolean updateMovie(Movie movie,int id);
	
	public boolean deleteMovieById(int id);
	
	public List<Movie> findAllMovie();
	
	public Movie findMovieByid(int id);
	
	public boolean insertMovie(Movie movie);
	

}
