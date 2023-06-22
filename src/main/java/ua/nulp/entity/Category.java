package ua.nulp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.nulp.validation.annotation.UniqueCategory;

@Entity
@Table(name = "category")
public class Category extends AbstractEntity {

	@UniqueCategory(message = "Such category already exists")
	private String name;

	@OneToMany(mappedBy = "category")
	private List<Commodity> commodities = new ArrayList<>();

	public Category() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}

}
