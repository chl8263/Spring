<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table {
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
<p>
	<table>
		<tr>
			<td>년도</td>
			<td>학기</td>
			<td>과목 코드</td>
			<td>과목 명</td>
			<td>구분</td>
			<td>이수 학점</td>
		</tr>
		<c:forEach var="four" items="${four}">
			<tr>
				<td><c:out value="${four.year }"></c:out></td>
				<td><c:out value="${four.semester }"></c:out></td>
				<td><c:out value="${four.code }"></c:out></td>
				<td><c:out value="${four.name }"></c:out></td>
				<td><c:out value="${four.check }"></c:out></td>
				<td><c:out value="${four.score }"></c:out></td>
			</tr>
		</c:forEach>

	</table>
	</p>
</body>
</html>