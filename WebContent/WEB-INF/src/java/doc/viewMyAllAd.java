package doc;
import java.sql.Connection;
import java.util.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.DB;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;
import model.*;

import org.apache.catalina.Session;

public class viewMyAllAd extends ActionSupport {
	private String uid;
	private String name;
	private String desc;
	private String mincost;
	private String maxcost;
	private ArrayList<viewMyAllAd> lst;
	
	
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

public ArrayList getLst() {
		return lst;
	}

	public void setLst(ArrayList<viewMyAllAd> lst) {
		this.lst = lst;
	}

public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

public String execute(){
	
	Map session = ActionContext.getContext().getSession();
	 uid=session.get("uid").toString();
	
	
	ResultSet resultSet = null;
//Map session = ActionContext.getContext().getSession();
	//String uid=session.get("uid").toString();
	String query = "select * from buy_request b where " + " b.user ="+uid+" ";
	System.out.println(""+query);
	Connection connection = DB.getConnection();
	lst=new ArrayList<viewMyAllAd>();
	resultSet = DB.readFromDB(query, connection);
	try{
		while(resultSet.next()){
		 name = resultSet.getString("product_name");
		 System.out.println(name);
		 desc = resultSet.getString("product_description");
		 mincost = resultSet.getString("min_cost");
		 maxcost = resultSet.getString("max_cost");
		 viewMyAllAd a=new viewMyAllAd();
		 a.setName(name);
		 a.setDesc(desc);
		 a.setMaxcost(maxcost);
		 a.setMincost(mincost);
		 lst.add(a);
		
		
		}
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	


	
	
	
	
	return "success";}
}
