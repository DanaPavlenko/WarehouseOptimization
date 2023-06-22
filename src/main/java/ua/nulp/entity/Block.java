package ua.nulp.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ua.nulp.validation.annotation.UniqueBlock;

@Entity
@Table(name = "block")
public class Block extends AbstractEntity {

	@UniqueBlock(message = "Such block already exists")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private Size size;
	@ManyToOne(fetch = FetchType.LAZY)
	private Zone zone;
	@ManyToOne(fetch = FetchType.LAZY)
	private Commodity commodity;

	public Block(String name, Size size, Zone zone, Commodity commodity) {
		this.name = name;
		this.size = size;
		this.zone = zone;
		this.commodity = commodity;
	}

	public Block() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

}
