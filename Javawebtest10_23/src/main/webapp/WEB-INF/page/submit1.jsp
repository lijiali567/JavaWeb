<%--
  Created by IntelliJ IDEA.
  User: 李嘉丽
  Date: 2024/10/23
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>问卷调查</title>
</head>
<body>
<h2>问卷调查</h2>
<form action="${pageContext.request.contextPath}/bind1/getParams" method="post">
  <table>
    <tr>
      <td>年龄：</td>
      <td><input type="text" name="age"><br></td>
    </tr>
    <tr>
      <td>性别：</td>
      <td><input type="text" name="gender"><br></td>
    </tr>
    <tr>
      <td>爱好：</td>
      <td>
        <input type="checkbox" name="hobbies" value="阅读">阅读<br>
        <input type="checkbox" name="hobbies" value="电影">电影<br>
        <input type="checkbox" name="hobbies" value="运动">运动<br>
      </td>
    </tr>
    <tr>
      <td><input type="submit" value="提交"></td>
    </tr>
  </table>
</form>
</body>
</html>
