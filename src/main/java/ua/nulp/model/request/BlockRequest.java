package ua.nulp.model.request;

import org.springframework.stereotype.Component;

import ua.nulp.entity.Commodity;
import ua.nulp.entity.Size;
import ua.nulp.entity.Zone;
import ua.nulp.validation.annotation.UniqueBlock;


@Component
public class BlockRequest {
	
    private Integer id;
	
    @UniqueBlock
	private String name;
	
	private Size size;
	
	private Commodity commodity;
	
	private Zone zone;

	public BlockRequest() {
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
