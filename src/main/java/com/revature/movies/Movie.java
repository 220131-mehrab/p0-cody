package com.revature.movies;

public class Movie {
    private String name;
    public Movie(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
