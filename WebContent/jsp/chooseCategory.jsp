<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Choose Category</title>
</head>
<body>
<s:form action="chooseCategory.action" method="post">
<h1 align="center"> BUY ANYTHING</h1>
<a href="home" />Home</a>
<s:label value ="Select Category"/>
<s:select name="cat_id" list="lstCategory" listValue="cat_name" listKey="cat_id" headerKey="-1" headerValue="--Select Category--" align="center"></s:select>
 <s:submit value="SUBMIT"/>
</s:form>
</body>
</html>