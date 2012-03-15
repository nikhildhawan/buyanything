<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import="java.util.Map" %>
<%@ page import ="com.opensymphony.xwork2.*"%>

<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AD of seller is </title>
</head>
<body bgcolor="DarkSalmon">
The advertisement posted by you is :
<br>
Product name :<s:property value="item"/><br>
Category :<s:property value="cat_id"/><br>
Description :<s:property value="description"/><br>
Cost:<s:property value="cost"/><br>
Quantity:<s:property value="quantity"/><br>
<br>
<a href="buyad" />View all my advertisements</a> <br>
<a href="buyad" /> Show potential Buyers</a>
<br>

<%

String item =request.getParameter("item");
String cat_id=request.getParameter("cat_id");
String description=request.getParameter("description");
String cost=request.getParameter("cost");
String quantity=request.getParameter("quantity");

Map session1= ActionContext.getContext().getSession();
String uid_current=(String)session1.get("uid");
String connectionURL = "jdbc:mysql://localhost:3306/buy_anything";
Connection connection = null;
PreparedStatement pstatement = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
int updateQuery = 0;
if(item!=null){
	if(item!=""){
		try{
			connection=DriverManager.getConnection(connectionURL,"root","ruchi");
			String queryString="insert into local_sell_request(category, product_name,product_description,cost,quantity,seller) values ((select category_id from category where category_name = ?),?, ?,?,?,?)";
			pstatement = connection.prepareStatement(queryString);
			pstatement.setString(1,cat_id);
			pstatement.setString(2,item);
			pstatement.setString(3,description);
			pstatement.setString(4,cost);
			pstatement.setString(5,quantity);
			pstatement.setString(6,uid_current);
			updateQuery=pstatement.executeUpdate();
			if(updateQuery !=0){ %>
			<br>
			<TABLE style="background-color : #E3E4FA;"
			WIDTH="30%" border="1">
			<tr><th>DATA IS INSERTED SUCCESSFULLY IN DATABASE.</th></tr>
			</TABLE> <%
			} }
		
		catch (Exception ex){
			out.println("unable");
		}
		finally {
			pstatement.close();
			connection.close();
		
			
		}
		
		 }
	}




%>



</body>
</html>