<%@page import="javax.swing.JOptionPane"%>
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
<title>Details of buyers ad</title>
</head>
<body bgcolor="DarkSalmon">
<s:form action="insertAd" method="post" />
<br>
THE DETAILS OF ADVERTISEMENT POSTED BY YOU ARE:
<br>
Product name:<s:property value="buy_item"/><br>
Category :<s:property value="cat_id2"/><br>
Description :<s:property value="buy_description"/><br>

Minimum cost:<s:property value="mincost"/><br>
Maximum cost:<s:property value="maxcost"/><br>

<s:submit method="findSellers" value="Find Potential Sellers" align="left" />

<!-- 

String buy_description =request.getParameter("buy_description");
String cat_id2=request.getParameter("cat_id2");
String mincost=request.getParameter("mincost");
String maxcost=request.getParameter("maxcost");
String buy_item=request.getParameter("buy_item");
//String uid_current=request.getParameter("uid_current");
//String uid_current=(String)session.getValue("uid");

	Map session1= ActionContext.getContext().getSession();
	String uid_current=(String)session1.get("uid");

String connectionURL = "jdbc:mysql://localhost:3306/buy_anything";
Connection connection = null;
PreparedStatement pstatement = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
int updateQuery = 0;
if(buy_item!=null){
	if(buy_item!=""){
		try{
			connection=DriverManager.getConnection(connectionURL,"root","ruchi");
		//	String queryString="INSERT into buy_request(product_name,product_description,max_cost) values (?,?,?)";
		
String queryString="insert into buy_request(category, product_name,product_description,user,min_cost, max_cost) values ((select category_id from category where category_name = ?),?,?,?,?,?)";
			pstatement = connection.prepareStatement(queryString);
			pstatement.setString(1,cat_id2);
			pstatement.setString(2,buy_item);
			pstatement.setString(3,buy_description);
		    pstatement.setString(4,uid_current);
			pstatement.setString(5,mincost);
			pstatement.setString(6,maxcost);
			updateQuery=pstatement.executeUpdate();
			if(updateQuery !=0){
			<br>
			<TABLE style="background-color : #E3E4FA;"
			WIDTH="30%" border="1">
			<tr><th>DATA IS INSERTED SUCCESSFULLY IN DATABASE.</th></tr>
			</TABLE>
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





 -->


</body>
</html>