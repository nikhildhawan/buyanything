package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.DB;
import util.MyLog;
import vo.CategoryVo;

import com.opensymphony.xwork2.ActionContext;


public class Category {
	
	public static ArrayList<CategoryVo> getCategory(){
		ArrayList<CategoryVo> category = new ArrayList<CategoryVo>();
		ResultSet resultSet = null;
		String query = "select category_id,category_name,description from category";
		Connection connection = DB.getConnection();
		resultSet = DB.readFromDB(query, connection);
		
		try{
			while(resultSet.next())
			{
				CategoryVo objcatvo=new CategoryVo(resultSet.getInt("category_id"),resultSet.getString("category_name"),resultSet.getString("description"));
				category.add(objcatvo);
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
