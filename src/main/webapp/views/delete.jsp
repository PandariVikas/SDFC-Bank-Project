<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<center>
        <body>
<h1>SDFC BANK</h1>
<h2>EXTRADORANY SERVICES</h2>
<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/add">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/bal">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Tranfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/closeacnt">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;

</center>
<fieldset>
<h1>CLOSE YOUR ACCOUNT PERMENENTLY</h1>
<form:form method="post" action="/closeact" modelAttribute="bank">
BANK   AC/NO:      			 :<form:input path="account_no"/><br><br>
NAME					     :<form:input path="name"/><br><br>
PASSWORD            		  :<form:input path="password"/><br><br>
<input type="submit" value="CLOSE"><br><br>
</center>
</fieldset>
</form:form>
</body>
</html>