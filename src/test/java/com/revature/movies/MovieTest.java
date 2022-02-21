package com.revature.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void constructorTest(){
        String name = "Spider-Man 3";
        Movie movie = new Movie(name);
        movie = new Movie(5, "Suicide Squad", "Action,Adventure,Fantasy", "Will Smith, Jared Leto, Margot Robbie, Viola Davis");
    }

    @Test
    public void builderTest(){
        Movie actual = Movie.of().rank(3).title("Split").genre("Horror,Thriller").actors("James McAvoy, Anya Taylor-Joy, Haley Lu Richardson, Jessica Sula");
        Assertions.assertEquals("Split", actual.getName());
        actual = Movie.of().genre("Noomi Rapace, Logan Marshall-Green, Michael Fassbender, Charlize Theron").title("Prometheus").id(2);

    @Test
    public void nameTest(){
        Movie movie = new Movie("Enemy");
        Assertions.assertEquals( "Enemy", movie.getName());
        movie = new Movie("The Dark Knight");
        Assertions.assertEquals("The Dark Knight", movie.getName());
    }

}
