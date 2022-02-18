package com.revature.movies;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args){
        String webAppName = "Movies";
        MovieRepository movieRepository = new MovieRepository("imdb_movie_data.csv");
        MovieService movieService = new MovieService(movieRepository);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();
        server.addContext(webAppName, null);
        server.addServlet(webAppName, "defaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName, "movieServlet", movieService).addMapping("/Movie");
        server.addServlet(webAppName,"SearchFormServlet", sfService).addMapping("/search");
        //System.out.println("Server running on http://localhost" + server.getServer().getPort());
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
