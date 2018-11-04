<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Register</title>
</head>
<script>

</script>
<style type="text/css">
.error{
color:red;
}
</style>
<body>


<P style="background:black; color:white;">  The time on the server is ${serverTime}. </P>

<h1>회원가입 양식</h1>

<form:form modelAttribute="member" method="post">            
<table>
	<tr>
		<td>사용자 ID</td>
		<td><form:input path="user_Id" /></td>
		<td><form:errors path="user_Id" cssClass="error"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><form:input path="user_Name" /></td>
		<td><form:errors path="user_Name" cssClass="error"/></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><form:input path="user_Email" /></td>
		<td><form:errors path="user_Email" cssClass="error"/></td>
	</tr>
	<tr>
		<td>별명</td>
		<td><form:input path="user_NickName" /></td>
		<td><form:errors path="user_NickName" cssClass="error"/></td>
	</tr>
	<tr>
		<td><form:input path="user_RegDate" type="date" /></td>
	</tr>
	<tr>
		<td><form:button type="submit">회원가입</form:button></td>
	</tr>
	
</table>
</form:form>

<a href="/list" style="border:dotted;">회원 목록</a>




</body>
</html>
