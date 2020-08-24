<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
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
	<form action="/insert" method="post" accept-charset="utf-8">
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
<script type="text/javascript">
$(document).ready(function(){
	var check = ${check};
	if(check == false)
		alert("중복된 제목이 존재합니다.");
});
</script>
</html>