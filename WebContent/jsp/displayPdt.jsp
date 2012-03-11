<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Display Product</title>
</head>
<body>
<s:form action="login.action" method="post">

<s:label> Product chosen is </s:label>
<s:iterator value="pdtDetails">
<s:property value="pdtName"/>
<s:property value="pdtDesc"/>
<s:property value="pdtPrice"/>
<s:property value="category"/>

</s:iterator>
</s:form>
</body>
</html>