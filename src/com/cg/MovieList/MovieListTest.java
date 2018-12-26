/*	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 
*/

package com.cg.MovieList;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

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
	
	@Test
	public void testForRemoveMethodToRemoveAllTheMovieDetailsList(){
		boolean isEmptyList = movieDetailsList.removeMovieList();
		assertTrue(isEmptyList);
	}
	
	@Test
	public void testForFindMovieByMovieName(){
		MovieInformation movieGetMovieByName = movieDetailsList.getDetailsByMovieName("ArjunReddy");
		System.out.println(movieGetMovieByName);
	}
	
	@Test
	public void testForFindMovieByMovieGenre() {
		MovieInformation movieGetMovieByGenre = movieDetailsList.getDetailsByMovieGenre("Love");
		System.out.println(movieGetMovieByGenre);
	}
	@Test
	public void testForSortOfListByMovieName() {
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
		System.out.println("sortMovieListByMovieName");
		List<MovieInformation> sortMovieListByMovieName = movieDetailsList.sortByMovieName();
		for (MovieInformation movieInformation : sortMovieListByMovieName) {
			System.out.println(movieInformation.toString());
		}
		
	}
	@Test
	public void testForSortOfListByActorName() {
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
		System.out.println("sortMovieListByActorName");
		List<MovieInformation> sortMovieListByActorName = movieDetailsList.sortByActorName();
		for (MovieInformation movieInformation : sortMovieListByActorName) {
			System.out.println(movieInformation.toString());
		}
	}
	@Test
	public void testForSortOfListByActressName() {
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
		System.out.println("sortMovieListByActressName");
		List<MovieInformation> sortMovieListByActressName = movieDetailsList.sortByActressName();
		for (MovieInformation movieInformation : sortMovieListByActressName) {
			System.out.println(movieInformation.toString());
		}
	}
	@Test
	public void testForSortOfListByGenreName() {
		movieDetailsList.addMovie(movieOne);
		movieDetailsList.addMovie(movieTwo);
		movieDetailsList.addMovie(movieThree);
		movieDetailsList.addMovie(movieFour);
		movieDetailsList.addMovie(movieFive);
		System.out.println("sortMovieListByGenreName");
		List<MovieInformation> sortMovieListByGenreName = movieDetailsList.sortByGenreName();
		for (MovieInformation movieInformation : sortMovieListByGenreName) {
			System.out.println(movieInformation.toString());
		}
	}

}









