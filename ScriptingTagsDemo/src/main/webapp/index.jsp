<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tags Demo</title>
</head>
<body>
<%!
int a=10;
String name="akshara";
int square()
{
	return a*a;
}
%>
<%
out.println("a "+a);
out.println("name "+name);
%>
<%=a
%>
<%= java.time.LocalDate.now() %>
<%= Math.random() %>
</body>
</html>