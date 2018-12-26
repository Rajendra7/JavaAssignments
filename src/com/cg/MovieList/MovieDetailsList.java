package com.cg.MovieList;

import java.util.ArrayList;
import java.util.Collections;
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
	public MovieInformation getDetailsByMovieGenre(String genre) {
		MovieInformation getDetailsByMovieGenre=null;
		Iterator<MovieInformation> iterator=movieList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getGenre().equalsIgnoreCase(genre))
				getDetailsByMovieGenre=iterator.next();
			System.out.println(getDetailsByMovieGenre);
			break;
		}
		return getDetailsByMovieGenre;
	}

	public List<MovieInformation> sortByMovieName() {
		List<MovieInformation> movieListSortByMovieName=new ArrayList<MovieInformation>();
		Collections.sort(movieList,new SortByMovieName());
		Iterator<MovieInformation> iterator =movieList.iterator();
		while(iterator.hasNext()) {
			movieListSortByMovieName.add(iterator.next());
		}
		return movieListSortByMovieName;
	}

	public List<MovieInformation> sortByActorName() {
		List<MovieInformation> movieListSortByActorName=new ArrayList<MovieInformation>();
		Collections.sort(movieList,new SortByActorName());
		Iterator<MovieInformation> iterator =movieList.iterator();
		while(iterator.hasNext()) {
			movieListSortByActorName.add(iterator.next());
		}
		return movieListSortByActorName;
	}
	public List<MovieInformation> sortByActressName() {
		List<MovieInformation> movieListSortByActressName=new ArrayList<MovieInformation>();
		Collections.sort(movieList,new SortByActressName());
		Iterator<MovieInformation> iterator =movieList.iterator();
		while(iterator.hasNext()) {
			movieListSortByActressName.add(iterator.next());
		}
		return movieListSortByActressName;
	}

	public List<MovieInformation> sortByGenreName() {
		List<MovieInformation> movieListSortByGenreName=new ArrayList<MovieInformation>();
		Collections.sort(movieList,new SortByGenreName());
		Iterator<MovieInformation> iterator =movieList.iterator();
		while(iterator.hasNext()) {
			movieListSortByGenreName.add(iterator.next());
		}
		return movieListSortByGenreName;
	}
	
}
