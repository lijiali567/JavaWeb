<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/10/23
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>问卷调查</h2>
<form action="${pageContext.request.contextPath}/user/info" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>

            <td><input type="submit" name="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>
