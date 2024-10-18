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
    HttpSession mySession = request.getSession(false);
    if (mySession!= null) {
        mySession.invalidate();
    }
    response.sendRedirect("index.jsp");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>

