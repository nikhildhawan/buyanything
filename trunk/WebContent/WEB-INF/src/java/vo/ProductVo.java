package vo;

public class ProductVo {

	private String pdtName;
	private String pdtDesc;
	
	private String pdtPrice;
	private String pdtId;
	private String category;
	private String seller;
	private String addId;
	private int qty;
	
	public ProductVo(String pdtName, String pdtDesc, String pdtPrice,
			String pdtId, String category, String seller, int qty) {
		//super();
		this.pdtName = pdtName;
		this.pdtDesc = pdtDesc;
		this.pdtPrice = pdtPrice;
		this.pdtId = pdtId;
		this.category = category;
		this.seller = seller;
		this.qty = qty;
	}

	

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getPdtDesc() {
		return pdtDesc;
	}

	public void setPdtDesc(String pdtDesc) {
		this.pdtDesc = pdtDesc;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public ProductVo(String pdtName, String pdtPrice, String category,
			String pdtId) {
		super();
		this.pdtName = pdtName;
		this.pdtPrice = pdtPrice;
		this.pdtId = pdtId;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public ProductVo(String pdtName,String pdtDesc ,String pdtPrice,String seller,String addId) {
		super();
		this.pdtName = pdtName;
		this.pdtDesc = pdtDesc;
		this.pdtPrice = pdtPrice;
		this.seller = seller;
		this.addId = addId;
	}

	public String getPdtId() {
		return pdtId;
	}

	public void setPdtId(String pdtId) {
		this.pdtId = pdtId;
	}
	
	
	
}