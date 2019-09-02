<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome你好
<c:forEach items="${user }" var="obj">
${obj.username }
</c:forEach>
<%-- ${user.username }
${user.password }
${user.age }
<c:forEach items="${user.fruit }" var="obj">
${obj }
</c:forEach>
<c:forEach items="${img }" var="picture">
<img alt="" src="<%=request.getContextPath() %>/serverimg/${picture}">
</c:forEach> --%>
</body>
</html>