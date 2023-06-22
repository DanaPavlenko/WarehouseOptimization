package ua.nulp.model.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ua.nulp.entity.Block;
import ua.nulp.entity.Size;

public class CommodityView {

private Integer id;
	
	private String name;
	
	private Integer weight;
	
	private Integer count;
	
	private BigDecimal sales;
	
	private String category;
	
	private Size size; 
	
	private List<Block> blocks = new ArrayList<>();

	public CommodityView() {
	}

	public CommodityView(Integer id, String name, Integer weight, Integer count, BigDecimal sales, String category, Integer length, Integer width, Integer height) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.count = count;
		this.sales = sales;
		this.category = category;
		this.size = new Size(length, width, height);
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public BigDecimal getSales() {
		return sales;
	}

	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	
}
