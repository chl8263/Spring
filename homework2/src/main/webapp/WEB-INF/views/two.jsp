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
			<c:forEach var="two" items="${two}">

				<td>${two.name}</td>


			</c:forEach>
					<td>총점</td>
		</tr>
		
		<tr>
			<c:forEach var="two" items="${two}">
				<td>${two.value}</td>


			</c:forEach>
				<td>${sum.sum}</td>
		</tr>
		<%-- <tr>
				<td><c:out value="${one.year }"></c:out></td>
				<td><c:out value="${one.semester }"></c:out></td>
				<td><c:out value="${one.score }"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/one_link">링크 </a></td>
			</tr> --%>


	</table>
	</p>

</body>
</html>