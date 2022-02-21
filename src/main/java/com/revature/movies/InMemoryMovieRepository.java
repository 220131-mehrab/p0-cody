package com.revature.movies;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMovieRepository implements MovieRepository{

    private List<Movie> MovList;

    public InMemoryMovieRepository(){
        MovList = new ArrayList<>();
        MovList.add(Movie.of().rk(1).tl("Guardians of the Galaxy").gr("Action,Adventure,Sci-Fi").act("Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana"));
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

    @Override
    public List<Movie> getMovie() {
        return null;
    }

}
