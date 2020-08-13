<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style type="text/css">
table, th, td {
    border: 1px solid black;
}
table {
    border-collapse: collapse;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 98%; margin: 1%;">
		<tr>
			<td style="width: 10%;" align="center">제목</td>
		 	<td>
		 		<textarea rows="2" style="width: 98%; margin: 1%;"></textarea>
		 	</td>
	 	</tr>
	 	<tr>
			<td style="width: 10%;" align="center">작성자 </td>
		 	<td>
				<textarea rows="1" style="width: 98%; margin: 1%;"></textarea>
			</td>
		</tr>
		<tr>
			<td style="width: 10%;" align="center">내용</td>
		 	<td>
				<textarea rows="5" style="width: 98%; margin: 1%;"></textarea>
			</td>
		</tr>
	</table>
	<div align="right" style="padding: 1%;">
		<button>Create</button>
		<button onclick="location=''">Cancel</button>
	</div>
</body>
</html>