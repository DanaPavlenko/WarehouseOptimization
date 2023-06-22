package ua.nulp.model.request;

import org.springframework.stereotype.Component;

import ua.nulp.entity.Category;
import ua.nulp.entity.Size;
import ua.nulp.validation.annotation.UniqueCommodity;

@Component
public class CommodityRequest {

	private Integer id;

	@UniqueCommodity(message="Such commodity already exists")
	private String name;

	private String weight;

	private String count;

	private String sales;

	private Category category;

	private Size size;

	public CommodityRequest() {
	}

	public CommodityRequest(Integer id, String name, String weight, String count, String sales, Category category,
			Size size) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.count = count;
		this.sales = sales;
		this.category = category;
		this.size = size;
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

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

}
