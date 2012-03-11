package doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Category;
import util.DB;
import com.opensymphony.xwork2.ActionContext;

public class chooseCategory extends WebappSupport{

	private List lstCategory = new ArrayList();
	
	public List getLstCategory() {
		return lstCategory;
	}
	public void setLstCategory(List lstCategory) {
		this.lstCategory = lstCategory;
	}
	
	
	public String execute(){
		
		lstCategory = Category.getCategory();
		return "success";
	}
}
