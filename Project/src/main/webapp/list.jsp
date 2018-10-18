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

		<tr align="center">
			<td rowspan="3">${projects[0].section}</td>
			<td>${users[0].username}</td>
			<td>${maps[0].hour}</td>
			<td>${maps[1].hour}</td>
			<td>${maps[2].hour}</td>
			<td>${maps[3].hour}</td>
			<td>${maps[4].hour}</td>
			<td>${maps[5].hour}</td>
			<td>${maps[6].hour}</td>
			<td>-----</td>
		</tr>

		<tr align="center">
			<td>${users[1].username}</td>
			<td>111</td>
			<td>111</td>
			<td>111</td>
			<td>111</td>
			<td>111</td>
			<td>111</td>
			<td>111</td>
			<td>-----</td>
		</tr>
		<tr align="center">
			<td>${users[2].username}</td>
			<td>222</td>
			<td>222</td>
			<td>222</td>
			<td>222</td>
			<td>222</td>
			<td>222</td>
			<td>222</td>
			<td>-----</td>
		</tr>
		<tr align="center">
			<td rowspan="2">${projects[1].section}</td>
			<td>${users[3].username}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>-----</td>
		</tr>
		<tr align="center">
			<td>${users[4].username}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>${user.hour}</td>
			<td>-----</td>
		</tr>
		<tr align="center">
			<td colspan="9"></td>
			<td>------</td>
		</tr>
	</table>


	<script type="text/javascript">
		// 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
		var html = "<html><head><meta charset='utf-8' /></head><body>"
				+ document.getElementsByTagName("table")[0].outerHTML
				+ "</body></html>";
		// 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
		var blob = new Blob([ html ], {
			type : "application/vnd.ms-excel"
		});
		var a = document.getElementsByTagName("a")[0];
		// 利用URL.createObjectURL()方法为a元素生成blob URL
		a.href = URL.createObjectURL(blob);
		// 设置文件名
		a.download = "打卡器.xls";
	</script>
</body>
</html>