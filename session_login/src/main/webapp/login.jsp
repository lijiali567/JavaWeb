<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/9/30
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
        用户名: <input name="username" type="text"/><br/>
        密码：  <input name="password" type="password"/><br/>
        <input type="submit" value="提交" id="bt"/>
    </form>
</body>
</html>
