package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import vo.ProductVo;
import util.DB;
import util.MyLog;
import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class Product {

	
	public static List getProducts(int cat){
		
		List lstPdts = new ArrayList();
		ResultSet resultSet = null;
		String query = "select lsr.sell_request_id, lsr.product_name, lsr.product_description, lsr.cost, lsr.quantity, u.user_name, c.category_name from local_sell_request lsr, user u, category c where c.category_id ="+cat+" and lsr.seller=u.user_id and c.category_id=lsr.category";
		System.out.println(""+query);
		Connection connection = DB.getConnection();
		resultSet = DB.readFromDB(query, connection);
		try{
			while(resultSet.next()){
				//lstPdts.add(resultSet.getString("product_id"));
				String pdtDesc = resultSet.getString("product_description");
				String pdtPrice = resultSet.getString("cost");
				String pdtName = resultSet.getString("product_name");
				String seller = resultSet.getString("user_name");
				String sell_request_id = resultSet.getString("sell_request_id");
				//System.out.println(""+pdtId);
				ProductVo pdtVo = new ProductVo(pdtName, pdtDesc, pdtPrice, seller, sell_request_id);
				lstPdts.add(pdtVo);
				//System.out.println(""+resultSet.getFetchSize());
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*Map session = ActionContext.getContext().getSession();
		session.put("pdtName",cat_id);
		session.put("pdtPrice", arg1)*/
		return lstPdts;
	}
	
	
	public static List getPdtdetails(String pdtid){
		List pdtDetails = new ArrayList();
		ResultSet resultSet = null;
		String query = "select * from local_sell_request lsr, user u, category c where " +
				"lsr.sell_request_id ='"+pdtid+"' and lsr.seller=u.user_id and " +
						"c.category_id=lsr.category";
		System.out.println(""+query);
		Connection connection = DB.getConnection();
		resultSet = DB.readFromDB(query, connection);
		try{
			while(resultSet.next()){
				String pdtName = resultSet.getString("product_name");
				String pdtDesc = resultSet.getString("product_description");
				String pdtPrice = resultSet.getString("cost");
				String category = resultSet.getString("category_name");
				String pdtId = resultSet.getString("sell_request_id");
				String seller = resultSet.getString("user_name");
				int qty = resultSet.getInt("quantity");
				System.out.println(""+qty);
				ProductVo pdtVo = new ProductVo(pdtName,pdtDesc,pdtPrice,pdtId,category,seller,qty);
				pdtDetails.add(pdtVo);
			}
			return pdtDetails;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
}
