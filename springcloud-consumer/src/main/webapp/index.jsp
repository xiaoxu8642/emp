<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div align="center">
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>电话</td>
            <td>部门</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${empList}" var="e">
            <tr>
                <td>${e.id}</td>
                <td>${e.ename}</td>
                <td>${e.age}</td>
                <td>${e.phone}</td>
                <td>${e.dept.dname}</td>
                <td><a href="delete/${e.id}">删除</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="center">
                <a href="emps?page=${page-1}">上一页</a>
                <a href="emps?page=${page+1}">下一页</a>
            </td>
        </tr>
    </table>
</body>
</html>
