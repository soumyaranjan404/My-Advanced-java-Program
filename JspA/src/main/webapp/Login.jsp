<%@page import="Demo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Student s= new Student(2,"soumya","29"); %>
<h1>
id:
<%=s.getId() %>
</h1>
<h1>
name:
<%=s.getName() %>
</h1>

<h1>
roll:
<%=s.getRoll() %>
</h1>

<% %>
<%= %>
<%! %>

</body>   
</html>