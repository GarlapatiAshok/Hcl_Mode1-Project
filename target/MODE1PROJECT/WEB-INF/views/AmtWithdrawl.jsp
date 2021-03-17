<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AMOUNT WITHDRAWL</title>

<style>
#mainDiv {
    padding-top: 30px;
    padding-right: 10px;
    padding-bottom: 50px;
    padding-left: 255px;
}
.mandatory {
	color: #FF0000;
}
</style>

</head>
<body style="color:green">
<h4><a href="<%=request.getContextPath()+"/mvc/adminHome"%>"><span style="color:blue"><b>ADMIN HOME</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange">AMOUNT WITHDRAWL</font></h2>
</center>
<div id="mainDiv">
<form action="amtWthdrawlValidate" method="post">
<fieldset style="padding-left: 180px;width:  500px;">
		<pre></pre>
		
   <label class="mandatory">*</label><label><b>Acc Num:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="accnum" id="accnum" required></input><pre></pre>	
   
    <label class="mandatory">*</label><label><b>Amount:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="amtWithdrawl" id="amtWithdrawl" required></input><pre></pre>	
   
		      <div style="padding-left: 188px;">
              <input type="submit"  value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
              <input type="reset" value="clear">
              </div>
      
      
</fieldset>
</form>

</div>
<span style="color:blue">${message}</span>
<pre></pre>

</body>
</html>