package ua.nulp.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "commodity")
public class Commodity extends AbstractEntity implements Comparable<Commodity>{

	private String name;
	
	private Integer weight;
	
    @Min(value = 1)
    @Max(value = 100_000)
	private Integer count;

    
	private BigDecimal sales;
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	private Size size;
	@OneToMany(mappedBy = "commodity")
	private List<Block> blocks = new ArrayList<>();

	public Commodity() {
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

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public BigDecimal getSales() {
		return sales;
	}

	public void setSales(BigDecimal sales) {
		this.sales = sales;
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

	@Override
	public int compareTo(Commodity o) {
		return this.getSales().compareTo(o.getSales());
	}

}