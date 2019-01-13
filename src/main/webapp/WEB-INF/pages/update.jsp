<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8 0008
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/doUpdate.do" method="post" >
    <input type="text" name="id" hidden="hidden" value="${User.id}"><br>
    姓名：<input type="text" name="name" value="${User.name}"><br>
    密码：<input type="text" name="password" value="${User.password}"><br>
    电子邮箱：<input type="email" name="email" value="${User.email}"><br>
    部门：<input type="text" name="name" value="${User.dept}"><br>
    <input type="submit" name="submit" value="确认修改">
</form>
</body>
</html>
