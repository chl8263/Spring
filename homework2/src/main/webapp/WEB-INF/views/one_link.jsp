<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<style>
/* table {

	width: 400px;
	border: 1px solid blue;
	margin: 50px;
	padding: 10px;
	border-collapse: collapse;
} */
#a {
	 margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
	border-collapse: collapse;
	
}
tr,td{
border: 1px solid #444444;
 text-align: center;
}
</style>
</head>
<body>
<table id="a">
<tr>
		<td>수강년도</td>
		<td>학기</td>
		<td>교과코드</td>
		<td>교과목명</td>
		<td>구분</td>
		<td>학점</td>
	</tr>
	<p>
		<c:forEach var="one_link" items="${one_link}">
		<tr>
			<td><c:out value="${one_link.year }"></c:out></td>
			<td><c:out value="${one_link.semester }"></c:out></td>
			<td><c:out value="${one_link.code }"></c:out></td>
			<td><c:out value="${one_link.name }"></c:out></td>
			<td><c:out value="${one_link.check }"></c:out></td>
			<td><c:out value="${one_link.score }"></c:out></td>
			
		</tr>
		</c:forEach>
	</p>
	</table>
</body>
</html>