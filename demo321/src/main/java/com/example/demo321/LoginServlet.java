package com.example.demo321;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            ServletContext context = getServletContext();
            context.setAttribute("username", username);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/WelcomeServlet");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    }
}
