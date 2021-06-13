package nz.co.tmsandbox.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promotion {
	
	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Price")
	private float price;
	
	@JsonProperty("MinimumPhotoCount")
	private int minimumPhotoCount;
	
	@JsonProperty("OriginalPrice")
	private float originalPrice;
	
	@JsonProperty("Recommended")
	private boolean recommended;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getMinimumPhotoCount() {
		return minimumPhotoCount;
	}
	public void setMinimumPhotoCount(int minimumPhotoCount) {
		this.minimumPhotoCount = minimumPhotoCount;
	}
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public boolean isRecommended() {
		return recommended;
	}
	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}
}
