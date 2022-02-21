package com.revature.movies;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMovieRepository {

    private List<Movie> MovList;

    public InMemoryDexRepository(){
        MovList = new ArrayList<>();
        MovList.add(Movie.of().rank(1).title("Guardians of the Galaxy").genre("Action,Adventure,Sci-Fi").actors("Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana"));
    }


    public List<Movie> getMovieList() {

        return MovList;
    }
    public Movie getMovie(String name){
        Movie result = null;
        for(Movie movie : this.MovList){
            if(movie.getName().equals(name)){
                result = movie;
            }
        }
        return result;
    }
}
