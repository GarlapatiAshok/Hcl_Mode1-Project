<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login PAGE</title>

<style>
.mandatory {
	color: red;
}
</style>
</head>

<body style="color: green">
<h4 align="right"><a href="<%=request.getContextPath()+"/mvc/bankHome"%>"><span style="color:blue"><b>BANK HOME PAGE</b></span></a></h4><pre></pre>
	<center>
		<span style="color: red">WELCOME TO BANK!!..</span>
	</center>
	<pre></pre>
	<form action="custValidate" method="post">
		<div align="center">
			<h2 style="color: orange">Customer Login Page</h2>
			<fieldset style="border: solid 1px; width: 300px;">

				<pre></pre>
				<label class="mandatory">*</label><label><b>Username:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" name="custloginid" /><br>
				<pre></pre>
				<label class="mandatory">*</label><label><b>Password:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="password" name="password" /><br> <br>
				<pre></pre>
				<input type=submit value="Login" />&nbsp;&nbsp;&nbsp; <input
					type="reset" value="Clear" /> <br> <br>
				<pre></pre>

			</fieldset>

		</div>
	</form>
	<span style="color:blue">${error}</span>
	<span style="color:blue">${logout}</span>
<pre></pre>
</body>
</html>