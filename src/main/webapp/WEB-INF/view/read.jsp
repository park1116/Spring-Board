<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	padding: 1%;
}

table {
	border-collapse: collapse;
}
</style>
<head>
<meta charset="UTF-8">
<title>글읽기</title>
</head>
<body>
	<table style="width: 98%; margin: 1%;">
		<tr>
			<td style="width: 10%;" align="center">글 번호</td>
			<td style="width: 10%;" align="center">${dto.num}</td>
			<td style="width: 10%;" align="center">제목</td>
			<td>${dto.title}</td>
		</tr>
		<tr>
			<td style="width: 10%;" align="center">작성자</td>
			<td colspan="3">${dto.name}</td>
		</tr>
		<tr>
			<td style="width: 10%;" align="center">내용</td>
			<td colspan="3">${dto.content}</td>
		</tr>
	</table>
	<div align="center" style="padding: 1%;">
		<button type="button" onclick="reviseData('${dto.title}')">수정</button>
		<button type="button" onclick="location=''">목록으로</button>
		<button type="button" onclick="deleteData('${dto.title}')">삭제</button>
	</div>
</body>
<script type="text/javascript">
function deleteData(title){
	var result = confirm(${dto.num}+"번 글\n정말로 '"+title+"' 글을 삭제하시겠습니까?");
	if(result){
		location.href="/delete?num="+${dto.num}+"";
	}else{
		location.reload();
	}
}

function reviseData(title){
	location.href="/revise?title="+title+"";	
}
</script>
</html>