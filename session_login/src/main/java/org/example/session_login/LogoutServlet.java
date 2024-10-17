package org.example.session_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getSession().removeAttribute("User");
        req.getSession().removeAttribute("user");  // 这个地方要填写的是 user  , 而不是  User
        resp.sendRedirect(this.getServletContext().getContextPath() +"/IndexServlet");
    }
}
