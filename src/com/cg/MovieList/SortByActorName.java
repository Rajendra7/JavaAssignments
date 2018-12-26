package com.cg.MovieList;

import java.util.Comparator;

public final class SortByActorName extends MovieDetailsList implements Comparator<MovieInformation> {

	@Override
	public int compare(MovieInformation arg0,  MovieInformation arg1) {
		
		return (arg0.getMovieName().compareTo(arg1.getMovieName()));
	}

}
