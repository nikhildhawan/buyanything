<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>
</head>
<body>
<s:actionerror />
<s:form action="login" method="post"> <table cellspacing="10">
	<tr><s:textfield  name="username" key="Username" size="20" /></tr>
    <tr><s:password name="password" key="Password" size="20" /></tr>
    <tr><s:submit method="checkLogin" value="LOGIN" align="center" />
    
    </table>
</s:form>

</body>
</html>