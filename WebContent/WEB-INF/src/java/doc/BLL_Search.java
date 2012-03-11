package doc;

import java.util.ArrayList;

import model.DAL_Search;
import vo.Product;

import com.opensymphony.xwork2.ActionSupport;

public class BLL_Search extends ActionSupport
{
	String searchtext,searchby;
	int mincost,maxcost;
	ArrayList<Product> searchresultlist;
	
	
	public String execute()
	{
		System.out.println(" "+searchby+" is the search criteria, "+searchtext+" " + mincost+", "+maxcost+" is the input");
		if(searchby!=null && searchby.equalsIgnoreCase("product"))
		{
			searchresultlist=DAL_Search.searchProducts(searchtext);
			return "category";
		}
		else if(searchby!=null && searchby.equalsIgnoreCase("cost"))
		{
			searchresultlist=DAL_Search.searchProductsByCost(mincost,maxcost);
			return "cost";
		}
		return ERROR;
		
		
	}

	public int getMaxcost() {
		return maxcost;
	}

	public void setMaxcost(int maxcost) {
		this.maxcost = maxcost;
	}

	public String getSearchby() {
		return searchby;
	}

	public void setSearchby(String searchby) {
		this.searchby = searchby;
	}

	public int getMincost() {
		return mincost;
	}

	public void setMincost(int mincost) {
		this.mincost = mincost;
	}

	public String getSearchtext() {
		return searchtext;
	}


	public void setSearchtext(String searchtext) {
		this.searchtext = searchtext;
	}


	public ArrayList getSearchresultlist() {
		return searchresultlist;
	}


	public void setSearchresultlist(ArrayList searchresultlist) {
		this.searchresultlist = searchresultlist;
	}

}
