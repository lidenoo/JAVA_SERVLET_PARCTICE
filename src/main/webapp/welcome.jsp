<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WELCOME!!!!</title>
</head>
<body>

<form action="/maven_02/request" method="post">

    <input  type="submit" value="TEST CONNECT">



</form>


<%

    Object getStr = request.getAttribute("getStr");
    Object getConstat = request.getAttribute("getConstat");
    
%>

<%if(getStr !=null){%>

<%="HELLO!!!"+getStr %>
<%}%>

<%
if(getConstat !=null){%>
<%=getConstat %>
<%}%>





</body>
</html>
