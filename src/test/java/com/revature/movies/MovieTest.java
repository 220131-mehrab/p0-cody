package com.revature.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MovieTest {
    @Test
    public void constructorTest() {
        String name = "Spider-Man 3";
        Movie movie = new Movie(name);
        movie = new Movie(5, "Suicide Squad", "Action,Adventure,Fantasy", "Will Smith, Jared Leto, Margot Robbie, Viola Davis");
    }

    @Test
    public void builderTest() {
        Movie actual = Movie.of().rk(3).tl("Split").gr("Horror,Thriller").act("James McAvoy, Anya Taylor-Joy, Haley Lu Richardson, Jessica Sula");
        Assertions.assertEquals("Split", actual.getName());
        actual = Movie.of().gr("Noomi Rapace, Logan Marshall-Green, Michael Fassbender, Charlize Theron").tl("Prometheus").rk(2);
    }

    @Test
    public void nameTest() {
        Movie movie = new Movie("Enemy");
        Assertions.assertEquals("Enemy", movie.getName());
        movie = new Movie("The Dark Knight");
        Assertions.assertEquals("The Dark Knight", movie.getName());
    }

    @Test
    public void comparatorTests() {
        List<Movie> movieList = Arrays.asList(
                Movie.of().rk(1).tl("Guardians of the Galaxy").gr("Action,Adventure,Sci-Fi").act("Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana"),
                Movie.of().rk(2).tl("Guardians of the Galaxy").gr("Action,Adventure,Sci-Fi").act("Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana"),
                Movie.of().rk(3).tl("Sully").gr("Biography,Drama").act(""),
                Movie.of().rk(1).tl("Guardians of the Galaxy").gr("Action,Adventure,Sci-Fi").act("Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana")
        );
        System.out.println(movieList.toString());

        movieList.sort(null);

        System.out.println(movieList.toString());

//        movieList.sort(new Comparator<Movie>(){
//
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                return Integer.compare(o1.getName().length(), o2.getName().length());
//            }
//        });
//        movieList.sort((Comparator<Movie>) (Movie o1, Movie o2) -> {
//            return Integer.compare(o1.getName().length(), o2.getName().length());
//        });
        movieList.sort((o1, o2) -> Integer.compare(o1.getName().length(), o2.getName().length()));
        System.out.println(movieList.toString());

    }
}
