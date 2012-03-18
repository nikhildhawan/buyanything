package doc;

import java.util.Map;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import util.DB;

import com.opensymphony.xwork2.ActionContext;

public class findPotentialSellers {
	
public findPotentialSellers [] execute()
{
	findPotentialSellers [] sellers = null;
	Map session = ActionContext.getContext().getSession();
	String buy_request_id=(String)session.get("buy_request_id");
	String buyer_sql = "select * from buy_request where buy_request_id = " + buy_request_id;
	Connection connection = DB.getConnection();
	ResultSet buyerData = DB.readFromDB(buyer_sql, connection);
	try 
	{
		//JOptionPane.showMessageDialog(null, "Am here");
		buyerData.first();
		String category_id = buyerData.getString("category");
		String product_name = buyerData.getString("product_name");
		String min_cost = buyerData.getString("min_cost");
		String max_cost = buyerData.getString("max_cost");
		String sql="select * from local_sell_request where category = ";
		sql = sql + category_id + " and product_name = '" + product_name + "' and cost > " + min_cost;
		sql = sql + " and cost < " + max_cost + ";";
		//JOptionPane.showMessageDialog(null, sql);
		//System.out.println(sql);
		ResultSet potentialSellers = DB.readFromDB(sql, connection);
		if(potentialSellers.first())
		{
			JOptionPane.showMessageDialog(null, "Yes some data is there " + potentialSellers.getString(1));
			//populate data from pontentialSellers result set onto the jsp page this work is pending still
		}
	} 
	catch (Exception ex) 
	{
		JOptionPane.showMessageDialog(null, "Ended up being caught for ur mistakes there is no data to display");
		ex.printStackTrace();
	}
	return sellers;
	}
}
