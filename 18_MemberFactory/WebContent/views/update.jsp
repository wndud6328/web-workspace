<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 정보 수정</h2>
	
	<form action="/update.do" method="post">
		ID : <input type="text" name="id" value="${vo.id}" readonly><br>
		PASSWORD : <input type="password" name="password" value="${vo.password}"><br>
		NAME : <input type="text" name="name" value="${vo.name}"><br>
		ADDRESS : <input type="text" name="address" value="${vo.address}"><br>
		<input type="submit" value="정보수정">
	</form>
	
</body>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 정보 수정</h2>
	
	<form action="/update.do" method="post">
		ID : <input type="text" name="id" value="${vo.id}" readonly><br>
		PASSWORD : <input type="password" name="password" value="${vo.password}"><br>
		NAME : <input type="text" name="name" value="${vo.name}"><br>
		ADDRESS : <input type="text" name="address" value="${vo.address}"><br>
		<input type="submit" value="정보수정">
	</form>
	
</body>
>>>>>>> 39962ce69ee23085eb516ff40cf41f72958c13ab
</html>