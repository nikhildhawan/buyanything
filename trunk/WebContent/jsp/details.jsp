<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Product Details</title>
</head>
<body>
<s:form action="pdtDetails.action" method="post">
<h1 align="center"> BUY ANYTHING</h1>
<a
href="file:///home/rashi/Pictures/nikhil/IMG_7005.JPG"><img
style="border: 0px solid ; width: 135px; height: 186px;" alt="nikhil"
src="file:///home/rashi/Pictures/nikhil/IMG_7005.JPG"></a><br></br><br></br>
<s:iterator value="pdtDetails">
<tr>
<td>Product Name : </td>
<td><s:property value="pdtName"/></td>
</tr>
<tr>
<td>Product Description : </td>
<td><s:property value="pdtDesc"/></td>
</tr>
<tr>
<td>Product Price : </td>
<td><s:property value="pdtPrice"/></td>
</tr>
<tr>
<td>Category : </td>
<td><s:property value="category"/></td>
</tr>
<tr>
<td>Seller : </td>
<td><s:property value="seller"/></td>
</tr>
<tr>
<td><s:textfield value = '1' label="Quantity"/></td>

<td>Quantity Available :</td>
<td><s:property value="qty" /></td>
</tr>
</s:iterator>
<tr>
<td><s:submit name="submit" value="Add to Cart" theme="simple"/></td>
<td><s:submit name="submit" value="Buy This Item" theme="simple"/></td>
</tr>
</s:form>
</body>
</html>