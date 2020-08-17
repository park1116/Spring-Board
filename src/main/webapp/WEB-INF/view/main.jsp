<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
}

textarea {
	overflow: hidden;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board</title>
</head>
<body>
	<div align="right" style="padding: 1%;">
		<form action="/search" method="post">
			<input type="text" name="searchData" placeholder="검색어를 입력하세요." />
			<button type="submit">검색</button>
		</form>
	</div>
	<table style="width: 98%; margin: 1%;">
		<tr>
			<th>글 번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성 날짜</th>
		</tr>
		<c:forEach var="dto" items="${list}" varStatus="status">
			<tr>
				<td align="center" width="10%">${dto.num}</td>
				<td align="center" width="20%">${dto.title}</td>
				<td align="center" width="*%"> ${dto.content} </td>
				<td align="center" width="10%">${dto.name}</td>
				<td align="center" width="10%">${dto.regdate}</td>
			</tr>
		</c:forEach>
	</table>
	<div align="left" style="padding: 1%;">
		<button onclick="location='create'">글 쓰기</button>
	</div>
</body>
<script> 
function read(content){ 
	var content = content;
	aja
} 
</script> 
</html>
