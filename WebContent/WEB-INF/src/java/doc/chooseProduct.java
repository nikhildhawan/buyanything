package doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.Session;

import model.Category;
import model.Product;
import util.DB;
import com.opensymphony.xwork2.ActionContext;

public class chooseProduct extends WebappSupport{
	
	private int cat_id;
	private List lstProducts = new ArrayList();
	
	public String execute(){
		System.out.println("Category id choosen in choosecategory jsp and recieved in chooseproduct.java:"+cat_id);
		Map session = ActionContext.getContext().getSession();
		session.put("catName",cat_id);
		lstProducts = Product.getProducts(cat_id);
		return "success";

	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public List getLstProducts() {
		return lstProducts;
	}
	public void setLstProducts(List lstProducts) {
		this.lstProducts = lstProducts;
	}
	
}
