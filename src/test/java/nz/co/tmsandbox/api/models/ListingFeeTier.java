package nz.co.tmsandbox.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingFeeTier {
	
	@JsonProperty("MinimumTierPrice")
	private int minimumTierPrice;
	
	@JsonProperty("FixedFee")
	private float fixedFee;
	
	public int getMinimumTierPrice() {
		return minimumTierPrice;
	}
	public void setMinimumTierPrice(int minimumTierPrice) {
		this.minimumTierPrice = minimumTierPrice;
	}
	public float getFixedFee() {
		return fixedFee;
	}
	public void setFixedFee(float fixedFee) {
		this.fixedFee = fixedFee;
	}
	
}
