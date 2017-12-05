<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate"
		modelAttribute="three">
		<table class="formtable">
			<tr>
				<td class="label">Year:</td>
				<td><sf:input class="control" type="text" path="year" /><br>
					</td>
			</tr>
			<tr>
				<td class="label">Semester:</td>
				<td><sf:input class="control" type="text" path="semester" /></td>
				
			</tr>
			<tr>
				<td class="label">Code:</td>
				<td><sf:input class="control" type="text" path="code" /></td>
				
			</tr>
			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" type="text" path="name" /></td>
				
			</tr>
			<tr>
				<td class="label">Check:</td>
				<td><sf:input class="control" type="text" path="check" /></td>
				
			</tr>
			<tr>
				<td class="label">Score:</td>
				<td><sf:input class="control" type="text" path="score" /></td>
				
			</tr>
			
			<tr>
				<td class="label"></td>
				<td><input class="control" type="submit" value="새 제안" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>

