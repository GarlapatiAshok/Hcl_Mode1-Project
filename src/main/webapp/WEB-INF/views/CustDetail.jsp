<!-- HARDCODED BY GARLAPATI ASHOK -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>CUSTOMER INFO</title>

<style>
table, td {
  border: 1px solid black;
}
</style>

</head>
<body>
<h4><a href="<%=request.getContextPath()+"/mvc/custHome"%>"><span style="color:blue"><b>CUST HOME</b></span></a></h4><pre></pre>
<center>
<h2 style="color:orange">CUSTOMER INFO</h2>
</center>
        
        <table width="700px" align="center">
 
 
 <tr style="background-color: yellow;">
			<td align="center"><b>CUSTOMERID</b></td>
			<td align="center"><b>BRANCHNAME</b></td>
			<td align="center"><b>IFSCCODE</b></td>
			<td align="center"><b>ACCOUNTNUM</b></td>
			<td align="center"><b>NAME</b></td>
			<td align="center"><b>DOB</b></td>
		    <td align="center"><b>MOBILENUMBER</b></td>
			<td align="center"><b>EMAIL</b></td>
			<td align="center"><b>AADHAR</b></td>
			<td align="center"><b>PAN</b></td>
			
		</tr>
		
            <!-- <th>CUSTOMERID</th>
            <th>BRANCHNAME</th>           
            <th>IFSCCODE</th>
            <th>ACCOUNTNUM</th>
             <th>NAME</th>
             <th>DOB</th>
            <th>MOBILENUMBER</th>
            <th>EMAIL</th>
            <th>AADHAR</th>
            <th>PAN</th>
            -->
 
            <c:forEach var="custdetails" items="${listCustDetails1}">
                 <tr style="border: 1px solid black">
 
                    <td>${custdetails.customerId}</td>
                     <td>${custdetails.branchName}</td>
                      <td>${custdetails.ifscCode}</td>
                       <td>${custdetails.id}</td>
                     <td>${custdetails.name}</td>
                      <td>${custdetails.dob}</td>
                       <td>${custdetails.mobilenumber}</td>
                       <td>${custdetails.email}</td>
                     <td>${custdetails.aadhar}</td>
                      <td>${custdetails.pan}</td>
                                
                </tr>
            </c:forEach>
            
            <%-- <c:forEach var="custdetails1" items="${listCustDetails1}">
                <tr>
 
                    <td>${custdetails1.id}</td>
                     <td>${custdetails1.name}</td>
                      <td>${custdetails1.dob}</td>
                       <td>${custdetails1.mobilenumber}</td>
                       <td>${custdetails1.email}</td>
                     <td>${custdetails1.aadhar}</td>
                      <td>${custdetails1.pan}</td>
                                            
                </tr>
            </c:forEach> --%>
            
        </table>
    </div>
</body>
</html>