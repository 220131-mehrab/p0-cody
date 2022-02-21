package com.revature.movies;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private int rank;
    private String title;
    private String genre;
    private String actors ;

    public Movie() {}

    public Movie(String name){

        this(1005, "", "","");
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

    public String getName(){
        return this.title;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String  toString() {
        return "Movie{" +
                "rank=" + rank +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", actors='" + actors + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rank == movie.rank && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre) && Objects.equals(actors, movie.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, title, genre, actors);
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.rank, o.getRank());
    }
}
