package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.Product;
import myutil.*;

public class DAL_Search 
{
	static void searchProducts(String productNameToSearch)
	{
		ArrayList<Product> listProducts = new ArrayList<Product>();
		String sqlQuery;
		ResultSet rs=null;
		sqlQuery="select * from local_sell_request where product like %'"+ productNameToSearch +"'%";
		try {
			rs=Query.select(sqlQuery);
			while(rs.next())
			{
				Product objPrd=new Product();
				objPrd.
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}