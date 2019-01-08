<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/7 0007
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>电子邮件</th>
        <th>删除</th>
        <th>修改</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.password}</td>
            <td>${s.email}</td>
            <td><a href="/delete.do?id=${s.id}">删除</a> </td>
            <td><a href="/update.do?id=${s.id}">修改</a> </td>
        </tr>
    </c:forEach>
    </tbody>
    <div>
        <a href="/add.do"><h2>添加人员</h2></a>
    </div>
</table>

</body>
</html>
