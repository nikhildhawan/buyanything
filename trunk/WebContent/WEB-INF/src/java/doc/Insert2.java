package doc;

import java.util.Map;

import model.Category;
import java.sql.*;

import javax.swing.JOptionPane;

import util.DB;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Insert2 extends ActionSupport {
	
	private String buy_item;
	private String cat_id2;
	private String mincost;
	private String maxcost;
	private String buy_description;
	private String uid;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getBuy_item() {
		return buy_item;
	}
	public void setBuy_item(String buy_item) {
		this.buy_item = buy_item;
	}
	public String getCat_id2() {
		return cat_id2;
	}
	public void setCat_id2(String cat_id2) {
		this.cat_id2 = cat_id2;
	}
	public String getMincost() {
		return mincost;
	}
	public void setMincost(String mincost) {
		this.mincost = mincost;
	}
	public String getMaxcost() {
		return maxcost;
	}
	public void setMaxcost(String maxcost) {
		this.maxcost = maxcost;
	}
	public String getBuy_description() {
		return buy_description;
	}
	public void setBuy_description(String buy_description) {
		this.buy_description = buy_description;
	}
	
	
	public String execute()
	{
		buy_item=this.getBuy_item();
		Map session = ActionContext.getContext().getSession();
		//
		session.put("catName",cat_id2);
	
	    uid=session.get("uid").toString();
	    
		/*String connectionURL = "jdbc:mysql://localhost:3306/buy_anything";
		Connection connection = null;
		PreparedStatement pstatement = null;
		
		int updateQuery = 0;
		if(buy_item!=null){
			if(buy_item!=""){
				try{
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					connection=DriverManager.getConnection(connectionURL,"root","ruchi");
				//	String queryString="INSERT into buy_request(product_name,product_description,max_cost) values (?,?,?)";
				
		String queryString="insert into buy_request(category, product_name,product_description,user,min_cost, max_cost) values ((select category_id from category where category_name = ?),?,?,?,?,?)";
					pstatement = connection.prepareStatement(queryString);
					pstatement.setString(1,cat_id2);
					pstatement.setString(2,buy_item);
					pstatement.setString(3,buy_description);
				    pstatement.setString(4,uid);
					pstatement.setString(5,mincost);
					pstatement.setString(6,maxcost);
					updateQuery=pstatement.executeUpdate();
					pstatement.close();
					connection.close();
				}
					
				
				catch (Exception ex){
					System.out.println(ex);
				}
				finally {
				
				
					
				}
			}
		}*/
		String sql = "insert into buy_request(category, product_name,product_description,user,min_cost, max_cost) values ((select category_id from category where category_name = '"+ cat_id2 + "'),'" + buy_item + "','" + buy_description + "','" + uid + "','" + mincost + "','" + maxcost + "');";
		Connection connection = DB.getConnection();
		int rows = DB.update(connection, sql);
		return SUCCESS;
	}
	public void findSellers()
	{
		JOptionPane.showMessageDialog(null, "Hello World");
	}
			}
	

