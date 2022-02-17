package com.revature.movies;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieRepository {
    private List<String> Movielist;
    private InputStream file;

    public MovieRepository(String filename){
        this.Movielist = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            this.Movielist.add(scanner.next());
        }
    }

    public List<String> getMovielist() {
        return Movielist;
    }
    public String getMovie(String name){
        String result = "";
        for(String movie : this.Movielist){
            if(movie.contains(name)){
                result = movie;
            }
        }
        return result;
    }
}
