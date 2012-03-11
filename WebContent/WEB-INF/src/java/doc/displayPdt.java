package doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.*;
import org.apache.catalina.Session;

//import com.login.dao.chooseDao;
//import com.login.dao.chooseProductDao;
import util.DB;
import com.opensymphony.xwork2.ActionContext;

public class displayPdt extends WebappSupport{

	private String addId;
	private String pdtName;
	private String pdtPrice;
	private List pdtDetails = new ArrayList();
	
	public String execute(){
		//System.out.println("pdt id is "+pdtId);
		pdtDetails = Product.getPdtdetails(addId);
		//System.out.println(""+pdtDetails);
		return "success";
	}

	public List getPdtDetails() {
		return pdtDetails;
	}

	public void setPdtDetails(List pdtDetails) {
		this.pdtDetails = pdtDetails;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public String getPdtName() {
		return pdtName;
	}

	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}

	public String getPdtPrice() {
		return pdtPrice;
	}

	public void setPdtPrice(String pdtPrice) {
		this.pdtPrice = pdtPrice;
	}

	
}
