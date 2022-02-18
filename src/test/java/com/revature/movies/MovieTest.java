package com.revature.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void constructorTest(){
        String name = "Spider-Man 3";
        Movie movie = new Movie(name);
    }

    @Test
    public void nameTest(){
        Movie movie = new Movie("Enemy");
        Assertions.assertEquals( "Enemy", movie.getName());
        movie = new Movie("The Dark Knight");
        Assertions.assertEquals("The Dark Knight", movie.getName());
    }

}
