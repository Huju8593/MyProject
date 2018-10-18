<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>用户列表</title>
<style>
table {
	border-collapse: collapse;
}
</style>
</head>
<body>

	<table width="100%" cellpadding="8px" border="1PX" cellspacing="0"
		border="1">
		<h1>打卡器</h1>
		<a>导出表格</a>

		<tr>
			<th>导出时间</th>
			<th>人数(:人)</th>
			<th colspan="7">小伙伴公司</th>
			<th>总工作时间(:T)</th>
		</tr>
		<tr align="center">
			<td rowspan="2">部门</td>
			<td rowspan="2">姓名</td>
			<c:forEach items="${users}" var="user">
			</c:forEach>
			<td>${times[0].date}</td>
			<td>${times[1].date}</td>
			<td>${times[2].date}</td>
			<td>${times[3].date}</td>
			<td>${times[4].date}</td>
			<td>${times[5].date}</td>
			<td>${times[6].date}</td>
			<td>-----</td>
		</tr>
		<tr align="center">
			<td>${times[0].week}</td>
			<td>${times[1].week}</td>
			<td>${times[2].week}</td>
			<td>${times[3].week}</td>
			<td>${times[4].week}</td>
			<td>${times[5].week}</td>
			<td>${times[6].week}</td>
			<td>-----</td>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr align="center">
				<%-- <td rowspan="3">${project.section}</td> --%>
				<td>${user.username}</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</c:forEach>
	</table>


	<script type="text/javascript">
		var html = "<html><head><meta charset='utf-8' /></head><body>"
				+ document.getElementsByTagName("table")[0].outerHTML
				+ "</body></html>";
		var blob = new Blob([ html ], {
			type : "application/vnd.ms-excel"
		});
		var a = document.getElementsByTagName("a")[0];
		a.href = URL.createObjectURL(blob);
		a.download = "打卡器.xls";
	</script>
</body>
</html>