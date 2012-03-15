package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.DB;
import util.MyLog;
import com.opensymphony.xwork2.ActionContext;


public class Category {
	
	public static List getCategory(){
		List category = new ArrayList();
		ResultSet resultSet = null;
		String query = "select category_name from category";
		Connection connection = DB.getConnection();
		resultSet = DB.readFromDB(query, connection);
		
		try{
			while(resultSet.next()){
				category.add(resultSet.getString("category_name"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return category;
		
	}
	public static List getCategory(String catgory){
		List category = new ArrayList();
		ResultSet resultSet = null;
		String query = "select category_name from category";
		Connection connection = DB.getConnection();
		resultSet = DB.readFromDB(query, connection);
		try{
			while(resultSet.next()){
				category.add(resultSet.getString("category_name"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return category;
	}
}
