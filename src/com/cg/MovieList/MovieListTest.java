/*	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 
*/

package com.cg.MovieList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieListTest {
	private MovieInformation movieOne;
	private MovieInformation movieTwo;
	private MovieInformation movieThree;
	private MovieInformation movieFour;
	private MovieInformation movieFive;
	private MovieDetailsList movieDetailsList;
	
	@Before
	public void setup() {
		movieOne=new MovieInformation("BusinessMan", "MaheshBabu", "Kajal", "Inspirational");
		movieTwo=new MovieInformation("ArjunReddy", "VijayDevarakonda", "ShaliniPandey", "Love");
		movieThree=new MovieInformation("HalfGirlFriend", "ArjunKapoor", "SraddhaKapoor", "Love");
		movieFour=new MovieInformation("Robo2.o", "RajiniKanth", "AmiJakson", "ScienceFiction");
		movieFive=new MovieInformation("Kaleja", "MaheshBabu", "Anushka", "comedy"); 
		movieDetailsList = new MovieDetailsList();
	}
	

	@Test
	public void testForAddMovie() {
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
	}
	@Test
	public void testForDeleteMovie() {
		movieDetailsList.removeMovie(movieOne);
	}
	
	/*@Test
	public void testForRemoveMethodToRemoveAllTheMovieDetailsList(){
		boolean isEmptyList = movieDetailsList.removeMovieList();
		assertTrue(isEmptyList);
	}
	
	@Test
	public void testForFindMovieByMovieName(){
		MovieInformation movieGetMovieByName = movieDetailsList.getDetailsByMovieName("Yuganiki Okkadu");
		System.out.println(movieGetMovieByName);
	}*/

}
