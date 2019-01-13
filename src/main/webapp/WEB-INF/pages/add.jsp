<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/8 0008
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd.do" method="post" >
    姓名：<input type="text" name="name"><br>
    密码：<input type="text" name="password"><br>
    电子邮箱：<input type="email" name="email"><br>
    <input type="submit" name="submit" value="确认添加">
</form>

</body>
</html>
