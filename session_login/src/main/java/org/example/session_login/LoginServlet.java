package org.example.session_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LoginServlet")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equals(username) && "123".equals(password)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            req.getSession().setAttribute("user",user);   // 跟这个地方设置的值要一致
            resp.sendRedirect(this.getServletContext().getContextPath() + "/IndexServlet");

        }else {
            resp.sendRedirect(this.getServletContext().getContextPath() + "/login.jsp");
        }
    }
}
