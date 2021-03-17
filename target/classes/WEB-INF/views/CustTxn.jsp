<!-- HARDCODED BY GARLAPATI ASHOK -->
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>TRANSACTION DETAIL</title>

<style>
table, td {
  border: 1px solid black;
}
</style>

</head>
<body>
<h4><a href="<%=request.getContextPath()+"/mvc/custHome"%>"><span style="color:blue"><b>CUST HOME</b></span></a></h4><pre></pre>
<center>
<h2 style="color:orange">TRANSACTION DETAIL</h2>
</center>    
      <table width="700px" align="center">
 
 <tr style="background-color: yellow;">
			<td align="center"><b>TXNID</b></td>
			<td align="center"><b>TXNDTTM</b></td>
			<td align="center"><b>ACCNUM</b></td>
			<td align="center"><b>DESCRIPTION</b></td>
			<td align="center"><b>WITHDRAWL</b></td>
			<td align="center"><b>DEPOSIT</b></td>
		    <td align="center"><b>ACCBAL</b></td>
			<td align="center"><b>REMARKS</b></td>
			<td align="center"><b>TXNTYPE</b></td>
			
			
		</tr>
		
            <<!-- th>TXNID</th>
            <th>TXNDTTM</th>
            <th>ACCNUM</th>
            <th>DESCRIPTION</th>
            <th>WITHDRAWL</th>
             <th>DEPOSIT</th>
             <th>ACCBAL</th>
            <th>REMARKS</th>
             <th>TXNTYPE</th> -->
 
            <c:forEach var="txndetails" items="${listTxnDetails}">
                <tr style="border: 1px solid black">
 
                    <td>${txndetails.txnId}</td>
                     <td>${txndetails.txnDttm}</td>
                      <td>${txndetails.accNum}</td>
                       <td>${txndetails.description}</td>
                        <td>${txndetails.withdrawl}</td>
                         <td>${txndetails.deposit}</td>
                         <td>${txndetails.accBal}</td>
                        <td>${txndetails.remarks}</td>
                         <td>${txndetails.txnType}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>