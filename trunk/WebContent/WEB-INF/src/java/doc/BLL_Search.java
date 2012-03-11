package doc;

import java.util.ArrayList;

import model.DAL_Search;
import vo.Product;

import com.opensymphony.xwork2.ActionSupport;

public class BLL_Search extends ActionSupport
{
	String searchtext,searchcriteria;
	ArrayList<Product> searchresultlist;
	
	
	public String execute()
	{
		System.out.println(" "+searchcriteria+"is the search criteriia "+searchtext+" is the text");
		searchresultlist=DAL_Search.searchProducts(searchtext);
		return SUCCESS;
	}

	public String getSearchtext() {
		return searchtext;
	}


	public void setSearchtext(String searchtext) {
		this.searchtext = searchtext;
	}


	public String getSearchcriteria() {
		return searchcriteria;
	}


	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}


	public ArrayList getSearchresultlist() {
		return searchresultlist;
	}


	public void setSearchresultlist(ArrayList searchresultlist) {
		this.searchresultlist = searchresultlist;
	}

}
