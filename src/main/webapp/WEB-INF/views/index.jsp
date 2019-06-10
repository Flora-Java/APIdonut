<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1> Donuts</h1>

		<ul>
			<c:forEach items="${list}" var="b">
				<li> <a href="details?id=${b.id}"> ${b.name }</a></li>
			</c:forEach>



		</ul>
		
			
	</div>

</body>
</html>