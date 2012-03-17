<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BUYER:POST AD</title>
</head>
<body bgcolor="DarkSalmon">
BUYER : POST AD <br>
<s:form action="buyad11" method="post">
<s:textfield name="buy_item" label="product Name"/>
<!--<s:label value ="Select Category"/>-->

<s:select name="cat_id2" list="lstCategory1" headerKey="-1" headerValue="--Select Category--"
 align="center"></s:select>
<s:textfield name="buy_description" label="description" />
<s:textfield name="mincost" label="mincost"/>
<s:textfield name="maxcost" label="maxcost"/>
<s:submit value="Add"/>
</s:form>
</body>
</html>