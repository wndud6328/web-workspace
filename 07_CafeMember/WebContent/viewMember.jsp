<%@page import="java.util.List"%>
<%@ page import = "servlet.model.MemberVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		String name = request.getParameter("name");
		List<MemberVO> list = (List) application.getAttribute("list");
	%>
	<div class="container">
		<% if(name!=null) {%>
			<h4><%= name %>님이 방금전 회원가입 하셨습니다.</h4>
		<% }%>
		<h2>전체 Cage 명단 리스트</h2>
		<table class="table">
			<tr>
				<th></th>
				<th>이름</th>
				<th>나이</th>
				<th>주소</th>
			</tr>
			<%
			if(list!=null){
			for(int i=0; i<list.size(); i++){ %>
					<tr>
						<td><%= i+1 %></td>
						<td><%= list.get(i).getName() %></td>
						<td><%= list.get(i).getAge() %></td>
						<td><%= list.get(i).getAddr() %></td>
					</tr>
				<% } } %>
		</table>
	</div>

</body>
</html>