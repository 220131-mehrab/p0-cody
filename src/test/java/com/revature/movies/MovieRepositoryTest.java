package com.revature.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryTest {
    @Test
    public void getMovieTest(){
        CSVMovieRepository testRepo = new CSVMovieRepository("movietest.csv");
        Movie actual = testRepo.getMovie("Spider-Man 3");
        Movie expected = new Movie("Spider-Man 3");
        Assertions.assertEquals(expected.getName(), actual.getName());
    }
}
