<html>
    <center>
    <head>
<h1>SDFC BANK</h1>
<h2>EXTRAODINARY SERVICS</h2>
<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/add">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Tranfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeacnt">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
</head>

    <body>
<h1 style="color:red">All User Records</h1>
<table border="1">
<tr>
<th>Account No</th>
<th>User Name</th>      
<th>Amount</th>
<th>Address</th>
<th>Phone No</th>
</tr>
<tr>
<td>${bank.account_no}</td>
<td>${bank.name}</td>
<td>${bank.amount}</td>
<td>${bank.address}</td>
<td>${bank.mobile_no}</td>
</tr>
</c:forEach>
</table>
<a href="/">Home</a>
</body>
</center>
</html>