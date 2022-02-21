package com.revature.movies;

import java.util.List;

public interface MovieRepository {
    Movie getMovie(String name);
    List<Movie> getMovie();

}
