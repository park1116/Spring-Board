<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board</title>
</head>
<body>
	<div align="right" style="padding: 1%;">
		<textarea rows="1" cols="20%" id="searchData"></textarea>
		<button>Search</button>
	</div>
	<table style="width: 98%; margin: 1%;">
		<tr>
			<th> 글 번호 </th>
			<th> 제목 </th>
			<th> 내용 </th>
			<th> 작성자 </th>
			<th> 작성 날짜 </th>
		</tr>
		<c:forEach var="dto" items="${list}" varStatus="status">
			<tr>
				<td align="center" width="10%"> ${status.count} </td>
				<td align="center" width="20%"> <c:out value="${dto.title}" /> </td>
				<td align="center" width="*%"> <c:out value="${dto.content}" /> </td>
				<td align="center" width="10%"> <c:out value="${dto.name}" /> </td>
				<td align="center" width="10%"> <c:out value="${dto.regdate}" /> </td>
			</tr>
		</c:forEach>
	</table>
	<div align="left" style="padding: 1%;">
		<button onclick="location='create'">Create</button>
	</div>
</body>
</html>
