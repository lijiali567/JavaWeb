package org.example.session_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null){
            resp.getWriter().println("您还未登录，请先<a href= '"+this.getServletContext().getContextPath()+"/login.jsp'> 登录 </a>");
        }else {
            resp.getWriter().println("欢迎回来：" + user.getUsername() + ",<a href='"+this.getServletContext().getContextPath()+"/LogoutServlet'>退出</a>");

            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60 * 30);
            cookie.setPath("/session_login");
            HttpServletResponse response = null;
            response.addCookie(cookie); //servletResponse应该是通过Servlet的service方法或者其他相应的方法传入的响应对象
        }

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

