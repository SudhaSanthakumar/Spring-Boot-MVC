<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>books</title>
</head>
<body>
<h1 >Books</h1>
<table>
  <c:forEach items="${books}" var="book">
    <tr>
      <td><c:out value="${book.bookName}" /></td>
      <td><c:out value="${book.bookId}" /></td>
    </tr>
  </c:forEach>
  
</table>
</body>
</html>