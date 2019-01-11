<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/9 0009
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <form >
        <input type="text" name="name">
        <input type="submit" value="搜索">
    </form>

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
</table>
<br>
<ul>
    <c:choose>
        <c:when test="${pages.pages > 0}">
            <c:choose>
                <c:when test="${pages.isFirstPage}">
                    <%--<li>首页</li>
                    <li>上一页</li>--%>
                </c:when>
                <c:otherwise>
                    <li><a href="list.do?pageNum=1${name}">首页</a></li>
                    <li><a href="list.do?pageNum=${pages.prePage}${name}">上一页</a></li>
                </c:otherwise>
            </c:choose>
            <c:forEach items="${pages.navigatepageNums}" var="i">
                <c:choose>
                    <c:when test="${pages.pageNum == i}">
                        <li>${i}</li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="list.do?pageNum=${i}${name}">${i}</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <c:choose>
                <c:when test="${pages.isLastPage}">
                    <%--<li>尾页</li>
                    <li>下一页</li>--%>
                </c:when>
                <c:otherwise>
                    <li><a href="list.do?pageNum=${pages.nextPage}${name}">下一页</a></li>
                    <li><a href="list.do?pageNum=${pages.pages}${name}">尾页</a></li>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>
    <br>
</ul>
</body>
</html>
