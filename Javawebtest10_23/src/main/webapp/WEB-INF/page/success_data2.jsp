<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/10/24
  Time: 08:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>问卷调查</title>
</head>
<body>
    <h2>问卷调查提交成功</h2>
    <table>
        <tr><td>年龄：</td>${user.getAge()}</tr>
        <tr><td>用户名：</td>${user.getUsername()}</tr>
    </table>

</body>
</html>
