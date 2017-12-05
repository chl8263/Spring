<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
div {
	margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
	border-collapse: collapse;
	 text-align: center;
	
}
</style>
</head>
<body>
	<div>
		<p>
			<a href="${pageContext.request.contextPath}/one">학기별 이수학점 조회 </a>
		<p>
			<a href="${pageContext.request.contextPath}/two"> 이수 구분별 학점 조회</a>
		<p>
			<a href="${pageContext.request.contextPath}/three"> 수강신청하기</a>
		<p>
			<a href="${pageContext.request.contextPath}/four"> 수강신청 조회 </a>
		</p>
	</div>
</body>
</html>