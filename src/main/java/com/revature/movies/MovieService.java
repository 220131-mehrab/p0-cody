package com.revature.movies;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MovieService extends HttpServlet {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");

        if(userInput != null){
            String result = movieRepository.getMovie(userInput).getName();
            resp.getWriter().println(result);
        } else {
            for (Movie movie :  movieRepository.getMovie()) {
                resp.getWriter().println(movie);
            }
        }
    }
}
