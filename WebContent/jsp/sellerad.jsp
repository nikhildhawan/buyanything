<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SELLER:POST AD</title>
</head>
<body bgcolor="DarkSalmon">
SELLER : POST AD <br>
<s:form action="add">
<s:textfield name="item" label="product Name"/>

<s:select name="cat_id" list="lstCategory" headerKey="-1" headerValue="--Select Category--"
 align="center"></s:select>
<s:textfield name="description" label="description" />
<s:textfield name="cost" label="cost"/>
<s:textfield name="quantity" label="quantity"/>
<s:submit value="Add"/>

</s:form>
</body>
</html>