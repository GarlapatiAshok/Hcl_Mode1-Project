<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>ACCOUNT INFO</title>

<style>
table, td {
  border: 1px solid black;
}
</style>

</head>
<body>
<h4><a href="<%=request.getContextPath()+"/mvc/adminHome"%>"><span style="color:blue"><b>ADMIN HOME</b></span></a></h4><pre></pre>
<center>
<h2 style="color:orange">ACCOUNT INFO</h2>
</center>
       
       <table width="700px" align="center">
		<!-- <tr>
			<td colspan=6 align="center" style="background-color: yellow">
			<b>FORM_VIEW</b></td>
		</tr> -->
		<tr style="background-color: yellow;">
			<td align="center"><b>CUSTOMERID</b></td>
			<td align="center"><b>ACCOUNTNUM</b></td>
			<td align="center"><b>BRANCHNAME</b></td>
			<td align="center"><b>IFSCCODE</b></td>
			<td align="center"><b>ACCTYPE</b></td>
			<td align="center"><b>ACCOUNTBAL</b></td>
		
			
		</tr>
		
		
        <!-- <table border="1">
 
            <th>CUSTOMERID</th>
            <th>ACCOUNTNUM</th>
            <th>BRANCHNAME</th>
            <th>IFSCCODE</th>
            <th>ACCTYPE</th>
             <th>ACCOUNTBAL</th> -->
 
            <c:forEach var="accdetails" items="${listAccDetails}">
               <tr style="border: 1px solid black">
 
                    <td>${accdetails.customerId}</td>
                     <td>${accdetails.accnum}</td>
                      <td>${accdetails.branchName}</td>
                       <td>${accdetails.ifscCode}</td>
                        <td>${accdetails.accType}</td>
                         <td>${accdetails.accBal}</td>
                </tr>
            </c:forEach>
            
        </table>
    </div>
</body>
</html>