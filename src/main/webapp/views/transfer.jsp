<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<center>
<h1>SDFC BANK</h1>
<h2>EXTRAODINARY SERVICS</h2>
<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/add">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/bal">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeacnt">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;

<h1>TRANSFER MONEY </h1>

<c:form method="post" action="/transferamt" modelAttribute="trans">
    <table
    <tr><td>BANK   AC/NO:</td>   			
         <td><c:input path="account_no"/></td>
         </tr>

<tr>
    <td>NAME:</td>
    <td><c:input path="name"/></td>
</tr>
<tr>
    <td>PASSWORD :</td>
    <td><c:input path="password"/></td>
</tr>
<tr>
    <td>TARGER ACCOUNT:</td>
    <td><c:input path="target_accountno"/></td>
</tr>
<tr>
    <td>AMOUNT:</td>
    <td><c:input path="amount"/></td>
</tr>
<tr>	
    <td>				
<input type="submit" value="TRANSFER">
</td>	
</tr>  
</center>
</c:form>


