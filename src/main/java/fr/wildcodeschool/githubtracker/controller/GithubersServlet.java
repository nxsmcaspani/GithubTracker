package fr.wildcodeschool.githubtracker.controller;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "GithubersServlet", value = "/githubers")
public class GithubersServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Githuber> githubersList = new ArrayList<Githuber>();
        githubersList.add(new Githuber("Huber", "huber@top.com", "hubtop", 1, "http://www.aie.am/awesome.png"));
        githubersList.add(new Githuber("John", "john@doe.com", "jodoe", 2, "http://www.aie.am/jdoe.png"));
        githubersList.add(new Githuber("Patrick", "pay@oche.com", "patoche", 3, "http://www.aie.am/asaint.png"));
        githubersList.add(new Githuber("Emmanuel", "manu@mypres.com", "respectmyautoritaaa", 4, "http://www.france.com/yourlord.png"));
        githubersList.add(new Githuber("Simon", "stemplar@saint.com", "thesaint", 5, "http://www.thesaint.com/itsme.png"));
        request.setAttribute("data", githubersList);
        request.getRequestDispatcher("githubers.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    };

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Preprocess request: we actually don't need to do any business stuff, so just display JSP.
//
//    }

}
