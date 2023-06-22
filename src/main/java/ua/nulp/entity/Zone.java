package ua.nulp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ua.nulp.validation.annotation.UniqueZone;

@Entity
@Table(name = "zone")
public class Zone extends AbstractEntity {

	@UniqueZone(message = "Such zone already exists")
	private String name;

	@OneToMany(mappedBy = "zone")
	private List<Block> blocks;

	public Zone() {
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
