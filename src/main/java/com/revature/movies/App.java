package com.revature.movies;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args){
        MovieRepository movieRepository = new MovieRepository("imdb_movie_data.csv");
        MovieService movieService = new MovieService(movieRepository);

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "movieServlet", movieService).addMapping("/");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
