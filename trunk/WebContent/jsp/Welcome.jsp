<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>
</head>
<body>
<s:action name='addcompactheader' executeResult='true' />
<s:actionerror />
<a href="home" />Home</a>
<h2>Welcome <s:property value="#session['first_name']" />...!</h2>

<h1 align="center"> BUY ANYTHING </h1>
<s:form action="select.action" method="post">

<a href="select" />Buy a Item</a><br/>
<a href="displayCat" />Post Sell Advertisement</a><br/>
<a href="buyad" />Post Buyer Advertisement</a><br/>
<a href="searchName" />Search By Name</a><br/>
<a href="searchCost" />Search By Cost Range</a>

</s:form>

</body>
</html>