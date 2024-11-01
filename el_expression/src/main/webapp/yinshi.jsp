<%@ page import="java.util.Map" %>
<%@ page import="java.util.LinkedHashMap" %><%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/11/1
  Time: 08:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式隐式对象</title>
</head>
<body>
<%
    Map<String, String> map = new LinkedHashMap<String, String>();
    map.put("a", "aaaaxxx");
    map.put("b", "bbbb");
    map.put("c", "cccc");
    request.setAttribute("map", map);
%>
<!-- 根据关键字取map集合的数据 -->
${map.c} <br>
${map["b"]} <br>
<!-- 迭代Map集合 -->
<c:forEach var="me" items="${map}">
    ${me.key}=${me.value}<br/>
</c:forEach>
</body>
</html>
