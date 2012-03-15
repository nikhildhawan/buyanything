package doc;
import model.*;

import com.opensymphony.xwork2.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class sellerad extends ActionSupport{
	
	private String item;
	private String description;
	private String cost;
	private String cat_id;
	private Integer quantity;
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	private List lstCategory = new ArrayList();
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
		
		
		public List getLstCategory() {
		return lstCategory;
	}

	public void setLstCategory(List lstCategory) {
		this.lstCategory = lstCategory;
	}
	
	
	public String getCat_id() {
		return cat_id;
	}

	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}


		public String execute()
	{
		item=this.getItem();
		Map session = ActionContext.getContext().getSession();
		session.put("catName",cat_id);
		lstCategory = Category.getCategory(cat_id);
		//System.out.println("" + lstCategory.listIterator());
		return SUCCESS;
	}

		
	

}
