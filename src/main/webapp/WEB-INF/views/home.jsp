<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script>
$('button').click(function() {
	alert("searching page..");
});
</script>
<body>

<h1>
	Hello world!  
</h1>
<a href="member/register">가입</a>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
