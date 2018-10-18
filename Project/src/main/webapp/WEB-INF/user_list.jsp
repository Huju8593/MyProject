<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>用户列表</title>
</head style="font-size:30px;">
<body>
	<h2>用户列表</h2>
	<table width="100%" cellpadding="8px" border="1PX" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>密码</th>
			<th>手机号码</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.uid}</td>
				<td>${user.username}</td>
				<td>${user.hour}</td>
				<td><a href="change_password.do?id=${user.id }">修改密码</a> <a
					href="change_phone.do?id=${user.id }">修改手机号码</a> <a
					href="delete_user.do?id=${user.id}"
					onclick="return confirm('您确定要删除么?')">删除</a></td>
			</tr>
		</c:forEach>

		<c:forEach items="${projects}" var="project">
			<tr>
				<td>${project.id}</td>
				<td>${project.pid}</td>
				<td>${project.username}</td>
				<td>${project.section}</td>
				<td><a href="change_password.do?id=${user.id }">修改密码</a> <a
					href="change_phone.do?id=${user.id }">修改手机号码</a> <a
					href="delete_user.do?id=${user.id}"
					onclick="return confirm('您确定要删除么?')">删除</a></td>
			</tr>
		</c:forEach>

		<c:forEach items="${times}" var="time">
			<tr>
				<td>${time.id}</td>
				<td>${time.tid}</td>
				<td>${time.week}</td>
				<td>${time.date}</td>
				<td><a href="change_password.do?id=${user.id }">修改密码</a> <a
					href="change_phone.do?id=${user.id }">修改手机号码</a> <a
					href="delete_user.do?id=${user.id}"
					onclick="return confirm('您确定要删除么?')">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>