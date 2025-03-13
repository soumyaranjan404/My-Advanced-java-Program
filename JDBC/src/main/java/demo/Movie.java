package demo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Movie {


	private int id;
	private String name;
	private String hero;
	private String heroine;
	private Date releaseDate;
	private double budget;
	private double collection;

}