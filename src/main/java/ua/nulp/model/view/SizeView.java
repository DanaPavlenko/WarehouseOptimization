package ua.nulp.model.view;

public class SizeView {
	
    private Integer id;
	
	private Integer length;
	
	private Integer width;
	
	private Integer height;
	
	private String fullSize;

	public SizeView(Integer id, Integer length, Integer width, Integer height) {
		this.id = id;
		this.length = length;
		this.width = width;
		this.height = height;
		this.fullSize = length+"x"+width+"x"+height;
	}

	public SizeView() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getFullSize() {
		return fullSize;
	}

	public void setFullSize(String fullSize) {
		this.fullSize = fullSize;
	}
	
	
	
	

}
