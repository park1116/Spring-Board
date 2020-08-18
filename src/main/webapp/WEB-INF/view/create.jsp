<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>글쓰기</title>
</head>
<body>
	<form action="/insert" method="post">
		<table style="width: 98%; margin: 1%;">
			<tr>
				<td style="width: 10%;" align="center">제목</td>
			 	<td>
			 		<input type="text" name="title" style="width: 98%; margin: 1%;"/>
			 	</td>
		 	</tr>
		 	<tr>
				<td style="width: 10%;" align="center">작성자 </td>
			 	<td>
					<input type="text" name="name" style="width: 98%; margin: 1%;"/>
				</td>
			</tr>
			<tr>
				<td style="width: 10%;" align="center">내용</td>
			 	<td>
					<input type="text" name="content" style="width: 98%; margin: 1%; height: 20%"/>
				</td>
			</tr>
		</table>
		<div align="right" style="padding: 1%;">
			<button type="submit">등록</button>
			<button type="button" onclick="history.back(-1)">취소</button>
		</div>
	</form>	
</body>
</html>