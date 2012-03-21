<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ad Display</title>
</head>
<body>


<s:form>

<s:label> All ad posted by you are: </s:label>
<s:iterator value="lst"><br/>
<s:property value="name"/><br/>
<s:property value="desc"/><br/>
<s:property value="mincost"/><br/>
<s:property value="maxcost"/><br/>

</s:iterator>



</s:form>
</body>
</html>