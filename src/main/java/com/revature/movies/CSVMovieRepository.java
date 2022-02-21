package com.revature.movies;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVMovieRepository {
    private List<Movie> Movielist;
    private InputStream file;

    public CSVMovieRepository(String filename){
        this.Movielist = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            String[] movieColumns = scanner.next().split(",");
            Movie temp = new Movie(movieColumns[2]);
            this.Movielist.add(temp);
        }
    }

    public List<Movie> getMovieList() {

        return Movielist;
    }
    public Movie getMovie(String name){
        Movie result = null;
        for(Movie movie : this.Movielist){
            if(movie.getName().equals(name)){
                result = movie;
            }
        }
        return result;
    }
}
