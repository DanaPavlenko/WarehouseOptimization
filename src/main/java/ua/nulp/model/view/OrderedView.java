package ua.nulp.model.view;

public class OrderedView {
	
	private String block;
	
	private String commodity;

	public OrderedView(String block, String commodity) {
		this.block = block;
		this.commodity = commodity;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	
	

}
