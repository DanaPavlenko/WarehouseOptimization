package ua.nulp.model.view;

public class BlockView {
	
private Integer id;
	
	private String name;
	
	private Integer length;
	
	private Integer width;
	
	private Integer height;
	
	private String commodity;
	
	private String zone;

	public BlockView() {
	}

	public BlockView(Integer id, String name, Integer length, Integer width, Integer height, String commodity, String zone) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.commodity = commodity;
		this.zone = zone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
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
	
	
}
