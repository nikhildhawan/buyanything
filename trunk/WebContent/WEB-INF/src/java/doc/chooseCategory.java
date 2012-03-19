package doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Category;
import util.DB;
import vo.CategoryVo;

import com.opensymphony.xwork2.ActionContext;

public class chooseCategory extends WebappSupport{

	private ArrayList<CategoryVo> lstCategory = new ArrayList<CategoryVo>();
	
	public ArrayList<CategoryVo> getLstCategory() {
		return lstCategory;
	}
	public void setLstCategory(ArrayList<CategoryVo> lstCategory) {
		this.lstCategory = lstCategory;
	}
	
	
	public String execute(){
		
		lstCategory = Category.getCategory();
		return "success";
	}
}
