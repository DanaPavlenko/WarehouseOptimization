package ua.nulp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "size")
public class Size extends AbstractEntity {

	private Integer length;

	private Integer width;

	private Integer height;
	@OneToMany(mappedBy = "size")
	private List<Block> blocks = new ArrayList<>();
	@OneToMany(mappedBy = "size")
	private List<Commodity> commodities = new ArrayList<>();

	public Size() {
	}

	public Size(Integer length, Integer width, Integer height) {
		this.length = length;
		this.width = width;
		this.height = height;
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

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

}
