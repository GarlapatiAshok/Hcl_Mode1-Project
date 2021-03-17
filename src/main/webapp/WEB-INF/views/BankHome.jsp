<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK HOME PAGE</title>
</head>
<body>
<center>
<h2><font color="orange">BANK HOME PAGE</font></h2>
<span style="color:red">Welcome to Bank Home Page!!</span>
<h4><a href="<%=request.getContextPath()+"/mvc/login"%>"><span style="color:blue"><b>ADMIN LOGIN</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/custLogin"%>"><span style="color:blue"><b>CUSTOMER LOGIN</b></span></a></h4><pre></pre>
</center>
</body>
</html>