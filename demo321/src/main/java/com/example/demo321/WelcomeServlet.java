package com.example.demo321;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context = getServletContext();

        String username = (String) context.getAttribute("username");

        System.out.println("Username: " + username);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
        dispatcher.forward(request, response);
    }
}
