<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>打卡器</title>
<style>
table {
	border-collapse: collapse;
}
</style>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>

	<table width="100%" cellpadding="8px" border="1PX" cellspacing="0"
		border="1">
		<a style="text-decoration: none">导出表格</a>
		<br>
		<br>
	<select id="dateinfo" name="dateinfo">
			<option>===请选择当前月份之前的月份===</option>
	</select>
	<br>
	<br>
		<tr>
			<th>/</th>
			<th>人数:${size}</th>
			<th colspan="31">小伙伴公司(十月份)</th>
			<th>总工作时间:(h)</th>
		</tr>
		<tr align="center">
			<td rowspan="2">部门</td>
			<td rowspan="2">姓名</td>
			<c:forEach items="" var="li">
				<td align="center"></td>
			</c:forEach>
			<td></td>
		</tr>

		<tr>
			<c:forEach items="" var="section">
				<td align="center"></td>
			</c:forEach>
			<td></td>
		</tr>

		<c:forEach items="${sections}" var="section">
			<c:forEach items="${section.list}" var="list">
				<tr align="center">
					<td>${list.sectionname}</td>
					<td>${list.empname}</td>
					<c:forEach items="${list.list}" var="li">
						<td class="b">
						<span vr="${li.id}">${li.day}</span> 
						</td>
					</c:forEach>
					<th>${list.sums eq '0' ? '':list.sums}</th>
				</tr>
			</c:forEach>
		</c:forEach>
		<tr align="center">
			<th colspan="33">总计:(h)</th>
			<th></th>
		</tr>
	</table>

	<script type="text/javascript">
		$(".b").click(function() {
			window.open('show.do?id=' + $(this).children("span").attr('vr'),"", '_self');
		});
		
		/* 选择下拉框传的对应值 */
		$("#dateinfo").change(function(){
			var option=$(this).val();
		});
	</script>

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
	<script type="text/javascript" src="jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="1.js"></script>
</html>