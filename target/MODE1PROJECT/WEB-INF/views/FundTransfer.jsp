<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fund Transfer</title>

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
<h4><a href="<%=request.getContextPath()+"/mvc/custHome"%>"><span style="color:blue"><b>CUST HOME</b></span></a></h4><pre></pre>
<center>
<h2><font color="orange">Fund Transfer</font></h2>
</center>
<div id="mainDiv">
<form action="fundTransValidate" method="post">
<fieldset style="padding-left: 180px;width:  500px;">
		<pre></pre>
		
   <label class="mandatory">*</label><label><b>From Acc Num:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="fromaccnum" id="fromaccnum" required></input><pre></pre>	
    
    <label class="mandatory">*</label><label><b>To Acc Num::</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="toaccnum" id="toaccnum" required></input><pre></pre>	
    
    <label class="mandatory">*</label><label><b>Amount:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="amount" id="amount" required></input><pre></pre>	
    
     <label class="mandatory">*</label><label><b>Remarks:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="remarks" id="remarks" required></input><pre></pre>	
		      
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