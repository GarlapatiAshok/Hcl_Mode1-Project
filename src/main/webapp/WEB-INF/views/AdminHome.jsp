<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN HOME PAGE</title>
</head>
<body>
<h4 align="right"><a href="<%=request.getContextPath()+"/mvc/adminLogout"%>"><span style="color:blue"><b>Logout</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange">ADMIN HOME PAGE</font></h2>
<span style="color:red">Welcome to ADMIN Home Page!!</span>
<h4><a href="<%=request.getContextPath()+"/mvc/showRegister"%>"><span style="color:blue"><b>CREATE NEW ACCOUNT</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllAccDetails"%>"><span style="color:blue"><b>VIEW ALL ACC INFO</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllTxnDetails"%>"><span style="color:blue"><b>VIEW ALL TRANSACTION</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/amtWithDraw"%>"><span style="color:blue"><b>AMOUNT WITHDRAWL</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/amtDeposit"%>"><span style="color:blue"><b>AMOUNT DEPOSIT</b></span></a></h4><pre></pre>
</center>
</body>
</html>