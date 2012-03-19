package doc;

import java.util.ArrayList;

import model.Category;
import model.DAL_Search;
import vo.CategoryVo;
import vo.Product;

import com.opensymphony.xwork2.ActionSupport;

public class BLL_Search extends ActionSupport
{
	String searchtext,searchby;
	int mincost,maxcost,cat_id;
	ArrayList<Product> searchresultlist;
	private ArrayList<CategoryVo> lstCategory = new ArrayList<CategoryVo>();
	
	
	public String execute()
	{
		System.out.println(" "+searchby+" is the search criteria, "+searchtext+", "+ cat_id + " " + mincost+", "+maxcost+" is the input");
		if(searchby!=null && searchby.equalsIgnoreCase("product"))
		{
			searchresultlist=DAL_Search.searchProducts(searchtext);
			lstCategory = Category.getCategory();
			return "category";
		}
		else if(searchby!=null && searchby.equalsIgnoreCase("cost"))
		{
			searchresultlist=DAL_Search.searchProductsByCost(cat_id,mincost,maxcost);
			return "cost";
		}
		return ERROR;
		
		
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public ArrayList<CategoryVo> getLstCategory() {
		return lstCategory;
	}

	public void setLstCategory(ArrayList<CategoryVo> lstCategory) {
		this.lstCategory = lstCategory;
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
