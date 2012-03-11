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
	public static ArrayList<Product> searchProducts(String productNameToSearch)
	{
		ArrayList<Product> listProducts = new ArrayList<Product>();
		String sqlQuery;
		ResultSet rs=null;
		sqlQuery="select * from local_sell_request where product_name like '%"+ productNameToSearch +"%'";
		System.out.println(sqlQuery);
		try {
			rs=Query.select(sqlQuery);
			while(rs.next())
			{
				Product objPrd=new Product();
				objPrd.product_name=rs.getString("product_name");
				objPrd.category=rs.getInt("category");
				objPrd.cost=rs.getFloat("cost");
				objPrd.quantity=rs.getInt("Quantity");
				objPrd.sell_request_id=rs.getInt("sell_request_id");
				objPrd.seller=rs.getInt("seller");
				System.out.println(rs.getString("product_name"));
				listProducts.add(objPrd);
			}
			return listProducts;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
			try
			{
				rs.close();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	

}