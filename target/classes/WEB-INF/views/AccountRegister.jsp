<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Bank Register Form</title>

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
<h2><font color="orange"> BANK REGISTRATION FORM</font></h2>
</center>
<div id="mainDiv">
<form action="register" method="post">
<fieldset style="padding-left: 180px;width:  500px;">
		<pre></pre>
		
    <label class="mandatory">*</label><label><b> Name:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="text" name="name" id="firstname" required></input><pre></pre>	
    
    
    <label class="mandatory">*</label><label><b>Father Name:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="fatherName" id="fathername" required></input><pre></pre>	
    
    <label class="mandatory">*</label><label><b>Gender:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="radio" name="gender" id="gender" value="male"/>
          <label for="male">male</label>
        <input type="radio" name="gender" id="gender" value="female"/>
          <label for="female">female</label><br><pre></pre>
    
  
          
    	<label class="mandatory">*</label><label><b>DOB:</b></label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="date" name="dob" id="dob_b"/><pre></pre>
          
         <!--  <fieldset  style="width: 635px;">
        <legend><b>Address:</b></legend>
          <label><b>Present Address:</b></label>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <textarea name="presentaddress" rows="5" cols="20"></textarea>
             <pre></pre>
           <label><b>Permanent Address:</b></label>&nbsp;
              <textarea name="permanentaddress" rows="5" cols="20"></textarea>
      </fieldset><pre></pre>  -->
      <label class="mandatory">*</label><label><b>Address:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      
              <textarea name="address" rows="5" cols="20"></textarea>
             <pre></pre>
      
      <label class="mandatory">*</label><label><b>Email Id:</b></label>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="email" id="email" name="email" required /><pre></pre>
             
              <label class="mandatory">*</label><label><b>Mobile Number:</b></label>
               &nbsp;&nbsp;&nbsp;&nbsp;
		      <input type="text" name="mobilenumber"/></input><pre></pre>
		      
		      <label class="mandatory">*</label><label><b>Pan:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="pan" id="pan" required></input><pre></pre>	
    
    <label class="mandatory">*</label><label><b>Aadhar:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="aadhar" id="aadhar" required></input><pre></pre>	
     
		      
		     <label class="mandatory">*</label><label><b>Password:</b></label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="password" id="password" name="password" required /><pre></pre>   
		      
		      <div style="padding-left: 188px;">
              <input type="submit"  value="Submit">&nbsp;&nbsp;&nbsp;  
              <input type="reset" value="clear">
              </div>
      
      
</fieldset>
</form>
</div>
<span style="color:blue">${message}</span>
<pre></pre>

</body>
</html>
