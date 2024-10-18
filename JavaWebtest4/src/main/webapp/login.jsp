<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/10/18
  Time: 09:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
  String usermane=request.getParameter("username");
  String password=request.getParameter("password");

  if ("lyra".equals(usermane) && "123456".equals(password)){
    HttpSession mySeesion =request.getSession();
    mySeesion.setAttribute("username",usermane);
    response.sendRedirect("welcome.jsp");
  }else {
    response.sendRedirect("index.jsp");
  }

  // 简单的用户名和密码验证（实际应用中应使用数据库和加密）
%>

<html>
<head>
  <title>Title</title>
</head>
<body>

</body>
</html>
