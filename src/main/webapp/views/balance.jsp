<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <center>
        <h1>SDFC BANK</h1>
        <h2>EXTRAODINARY SERVICS</h2>
        <a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/add">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Tranfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/closeacnt">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
<body>      
    <h1>BALANCE FORM</h1>
<form:form  method="post" action="/checkbal">
<table>
<tr>
<td>Account Number:</td>
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
<td><input type="submit" value="Submit"></td>
<td><input type="submit" value="Clear"></td>
</tr>
</table>
</form:form>
</body>
</center>
</html>