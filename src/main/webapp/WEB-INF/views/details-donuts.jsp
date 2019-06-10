<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css" rel="stylesheet" integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m" crossorigin="anonymous">

</head>
<body>
  <div class="container">
  
	<h5> <a href="/">Back to list</a></h5>
  
    <h1>Donut</h1>
     <h3><b>Name:</b> ${list.name }</h3>
     <h3><b>Calories:</b> ${list.calories }</h3>
     <h3><b>Extras: </b></h3>
     <ul>
				<li> ${list.extras[0] }</li>
				<li> ${list.extras[1] }</li>
	</ul>	
  
  
  </div>


</body>
</html>