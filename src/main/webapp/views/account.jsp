<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <center>
    <head>
        <h1>SDFC BANK</h1>
        <h2>EXTRAODINARY SERVICS</h2>
        <a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/bal">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Tranfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/closeacnt">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
    </head>
 
<body bgcolor="pink">
    <h1 style="color:red" >OPEN ACCOUNT FORM</h1>
<form:form modelAttribute="bank" action="/register">
<table>
<tr>
<td>Enter Account Number:</td>
<td><form:input path="account_no"/></td>
</tr>
<tr>
<td>Enter Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Enter Password:</td>
<td><form:input path="password"/></td>
</tr>
<tr>
<td>Enter Confirm Password:</td>
<td><form:password path="confirm_password"/></td>
</tr>
<tr>
<td>Enter Amount:</td>
<td><form:input path="amount"/></td>
</tr>
<tr>
<td>Enter Address:</td>
<td><form:input path="address"/></td>
</tr>
<tr>
    <td>Enter Mobile No:</td>
    <td><form:input path="mobile_no"/></td>
    </tr>
<tr>
<td><input type="submit" value="Submit"></td>
<td><input type="submit" value="Clear"></td>
</tr>
</table>
</form:form>
</body>
</center>
</html>