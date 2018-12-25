package com.cg.MovieList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieDetailsList {
	List<MovieInformation> movieList =new ArrayList<MovieInformation>();
	
	public void addMovie(MovieInformation movieInformation) {
		movieList.add(movieInformation);
		System.out.println(movieInformation);
	}
	
	public void removeMovie(MovieInformation movieInformation) {
		movieList.remove(movieInformation);
	}
	
	public boolean removeMovieList() {
		movieList.removeAll(movieList);
		if(movieList.isEmpty())
			return true;
		else
			return false;
	}
	public MovieInformation getDetailsByMovieName(String movieName) {
		MovieInformation getMovieDetailsByMovieName =null;
		Iterator<MovieInformation> iterator =movieList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getMovieName().equalsIgnoreCase(movieName))
				getMovieDetailsByMovieName= iterator.next();
			System.out.println(getMovieDetailsByMovieName);
			break;
		}
		return getMovieDetailsByMovieName;
	}

}
