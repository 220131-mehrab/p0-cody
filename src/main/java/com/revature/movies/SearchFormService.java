package com.revature.movies;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<HTML>\n" +
                "<Head>\n" +
                "    <Title>Search Movies" +
                "</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "    <h1>Movie Search</h1>\n" +
                "    <Form action='Movie' method='get'>\n" +
                "    " +
                "    <input type='name' name='searchName'/>\n" +
                "        <input type='submit' value='Search'/>\n" +
                "        <a href='Movie'>See Movie List</a>\n" +
                "    " +
                "</Form>\n" +
                "</Body>\n" +
                "</HTML>";
        resp.getWriter().println(HTMLForm);
    }
}
