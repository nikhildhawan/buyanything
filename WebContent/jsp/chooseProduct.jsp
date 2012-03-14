<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Choose Products</title>
</head>
<body>
<s:form action="chooseProduct.action" method="post">
<h1 align="center"> BUY ANYTHING</h1>
<a href="home" />Home</a>
<s:iterator value="lstProducts">
<tr>

<td><s:property value= "pdtName"/></td>
<td><s:property value= "pdtDesc"/></td>
<td><s:property value= "pdtPrice"/></td>
<td><s:property value = "seller"/></td>
 <td><a href="productDetails?sell_request_id=<s:property value= "sell_request_id"/>" />Buy This Item</a></td>
 </tr>
</s:iterator>
</s:form>
</body>
</html>