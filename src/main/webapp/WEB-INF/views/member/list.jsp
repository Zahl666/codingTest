<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberList</title>
</head>
<body>
<table class="table table-bordered">
	<tr>
		<th>아이디</th>
	</tr>
	
<c:forEach items="${list }" var="memberVO">
	<tr>
		<td><a href="read?user_Id=${memberVO.user_Id }">${memberVO.user_Id }</a></td>
	</tr>
</c:forEach>	
</table>
</body>
</html>