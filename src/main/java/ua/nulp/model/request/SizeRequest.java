package ua.nulp.model.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

@Component
public class SizeRequest {

	private Integer id;
	@Min(1)
	@Max(100)
	private String length;
	@Min(1)
	@Max(50)
	private String width;
	@Min(1)
	@Max(100)
	private String height;
	
	private String fullSize;

	public SizeRequest() {
	}

	public SizeRequest(String length, String width, String height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public SizeRequest(Integer id, String length, String width, String height) {
		this.id = id;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getFullSize() {
		return fullSize;
	}

	public void setFullSize(String fullSize) {
		this.fullSize = length.concat(width).concat(height);
	}
	
	
	
	
	
	
}
