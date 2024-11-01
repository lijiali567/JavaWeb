<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/11/1
  Time: 08:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.el_expression.Utils" %>
<html>
<head>
    <title>EL表达式调用Java方法</title>
</head>
<body>
<%
  // 假设Utils类中有一个静态方法public static String sayHello(String name)
  // 该方法返回"Hello, " + name
  String result = Utils.sayHello("EL表达式");
  request.setAttribute("result", result);
%>
使用EL表达式调用Java方法: ${result}
</body>
</html>
