<%@ page import="org.example.el_expression.Person" %><%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/11/1
  Time: 08:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式获取数据</title>
</head>
<body>
<%
    request.setAttribute("name", "韩信");
%>
使用EL表达式获取数据: ${name}
<hr>
<%
  Person p = new Person();
p.setAge(12);
  request.setAttribute("person", p);
%>
使用EL表达式获取bean的属性: ${person.age}
</body>
</html>

