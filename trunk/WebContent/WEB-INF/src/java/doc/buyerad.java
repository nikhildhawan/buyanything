package doc;
import model.*;
import com.opensymphony.xwork2.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import util.DB;


public class buyerad extends ActionSupport {
	
	private String buy_item;
	private String cat_id2;
	private String mincost;
	private String maxcost;
	private String buy_description;
//	private String uid_current;
	


	
	


	

	/*public String getUid() {
		return uid_current;
	}
	public void setUid(String uid) {
		this.uid_current = uid;
	}
*/

	private List lstCategory1 = new ArrayList();
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
	public List getLstCategory1() {
		return lstCategory1;
	}
	public void setLstCategory1(List lstCategory1) {
		this.lstCategory1 = lstCategory1;
	}


	public String execute()
	{
		buy_item=this.getBuy_item();
		Map session = ActionContext.getContext().getSession();
		session.put("catName",cat_id2);
	
		//session.put("uid",uid);
	//	uid=(String)session.get(user_id);
		//uid=5;
	//	uid_current=(String)session.get("uid");		
		//String uid_current=(String)session.get("uid");
		
		
		lstCategory1 = Category.getCategory(cat_id2);
		return SUCCESS;
	}
	
	void insertBuyAd()
	{
		Map session = ActionContext.getContext().getSession();
		DB db = new DB();
		String query;
		int flag=0;
		query="insert into buy_request(category, product_name,product_description,user,min_cost, max_cost) values ('" + cat_id2 + "'," + " '" + buy_item + "', " + "'" + buy_description + "', "+ "'" + session.get("uid") + "', "+ "'" + mincost + "', "+ "'" + maxcost + "');";
		
				
				try {
					int result = db.insert(query);
					if (result != 0) {
						flag = 1;
					}
					System.out.print("flag=" + flag);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	}
	
}

