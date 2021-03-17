<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER HOME PAGE</title>
</head>
<body>
<h4 align="right"><a href="<%=request.getContextPath()+"/mvc/custLogout"%>"><span style="color:blue"><b>Logout</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange">CUSTOMER HOME PAGE</font></h2>
<span style="color:red">Welcome to CUSTOMER Home Page!!</span>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllCustDetails"%>"><span style="color:blue"><b>VIEW CUST INFO</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/fundTrans"%>"><span style="color:blue"><b>FUND TRANSFER</b></span></a></h4><pre></pre>
<h4><a href="<%=request.getContextPath()+"/mvc/getAllCustTxnDetails"%>"><span style="color:blue"><b>VIEW ALL TRANSACTION</b></span></a></h4><pre></pre>
</center>
</body>
</html>