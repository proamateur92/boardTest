<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list }" var="list">
		<tr>
			<td><c:out value="${list.bno }" /></td>
			<td><c:out value="${list.title }" /></td>
			<td><c:out value="${list.writer }" /></td>
		<fmt:formatDate value="${list.regdate}" pattern="yyyy-MM-dd" />
		</tr>
	</c:forEach>
</body>
</html>