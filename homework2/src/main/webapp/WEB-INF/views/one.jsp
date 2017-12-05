<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#a {
	 margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
	
	
}
table {
	width: 400px;
	border: 1px solid blue;
	margin: 50px;
	padding: 10px;
	border-collapse: collapse;
}
tr,td{
border: 1px solid #444444;
 text-align: center;
}
</style>
</head>

<body  id="a">
	<p>
	<table>
		<tr>
			<td>년도</td>
			<td>학기</td>
			<td>이수 학점</td>
			<td>상세보기</td>
		</tr>
		<c:forEach var="one" items="${one}">
			<tr>
				<td><c:out value="${one.year }"></c:out></td>
				<td><c:out value="${one.semester }"></c:out></td>
				<td><c:out value="${one.score }"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/one_link?year=${one.year}&semester=${one.semester}">링크 </a></td>
			</tr>
		</c:forEach>

	</table>
	</p>
</body>

</html>