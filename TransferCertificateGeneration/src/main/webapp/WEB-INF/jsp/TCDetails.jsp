<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Transfer Certificate Details</title>
</head>
<body> 
	<h1 style="color:green ;text-align:center">Transfer Certificate Details</h1>
	
	<div class="container">
      <table border=1 style="margin-left:auto; 
    margin-right:auto; width:1000px;">
      
        <tr>
          <th>Serial Number</th>
          <th>Register Number</th>
          <th>Student Name</th>
        </tr>
        <c:forEach  items="${tcdetails}" var ="tc">
        <form action="generate" method=POST>
        <tr style="height:30;">
          <td>${tc.serialNo}</td>
          <td>${tc.registerNumber}</td>
          <td>${tc.studentName} </td>
          <td> <input type="submit"  value="Generate PDF" /> 
          <input type="hidden" name="serialnumber" value="${tc.serialNo}"/>
            </td>
        </tr>
        </form>
        </c:forEach>
      </table>
    </div>
    
</body>
</html>