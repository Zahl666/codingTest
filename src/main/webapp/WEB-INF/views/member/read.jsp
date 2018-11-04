<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberRead</title>
</head>
<body>
<table class="table table-bordered">
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>이메일</th>
		<th>별명</th>
		<th>등록일자</th>
	</tr>

	<tr>
		<td>${memberVO.user_Id }</td>
		<td>${memberVO.user_Name }</td>
		<td>${memberVO.user_Email }</td>
		<td>${memberVO.user_NickName }</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd" value="${memberVO.user_RegDate }" /></td>
	</tr>

</table>
</body>
</html>