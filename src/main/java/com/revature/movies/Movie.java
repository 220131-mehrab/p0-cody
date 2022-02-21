package com.revature.movies;

public class Movie {
    private int rank;
    private String title;
    private String genre;
    private String actors ;

    public Movie() {}

    public Movie(String name){

        this(1005, title, genre,"");
    }

    public Movie(int rank, String title, String genre, String actors) {
        this.rank = rank;
        this.title = title;
        this.genre = genre;
        this.actors = actors;
    }

    public static Movie of(){
        return new Movie();
    }

    public Movie rk(int rk){
        this.rank  = rk;
        return this;
    }

    public Movie tl(String tl){
        this.title  = tl;
        return this;
    }
    public Movie gr(String gr){
        this.genre  = gr;
        return this;
    }
    public Movie act(String act){
        this.actors = act;
        return this;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return genre;
    }

    public String getActors() {
        return actors;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }


}
