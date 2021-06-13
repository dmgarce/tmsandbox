package nz.co.tmsandbox.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fee {
	
	@JsonProperty("Bundle")
	private float bundle;

	@JsonProperty("EndDate")
	private float endDate;
	
	@JsonProperty("Feature")
	private float feature;
	
	@JsonProperty("Gallery")
	private float gallery;
	
	@JsonProperty("Listing")
	private float listing;
	
	@JsonProperty("Reserve")
	private float reserve;
	
	@JsonProperty("Subtitle")
	private float subtitle;
	
	@JsonProperty("TenDays")
	private float tenDays;
	
	@JsonProperty("ListingFeeTiers")
	private ListingFeeTier[] listingFeeTiers;
	
	@JsonProperty("SecondCategory")
	private float secondCategory;
	
	public float getBundle() {
		return bundle;
	}
	public void setBundle(float bundle) {
		this.bundle = bundle;
	}
	public float getEndDate() {
		return endDate;
	}
	public void setEndDate(float endDate) {
		this.endDate = endDate;
	}
	public float getFeature() {
		return feature;
	}
	public void setFeature(float feature) {
		this.feature = feature;
	}
	public float getGallery() {
		return gallery;
	}
	public void setGallery(float gallery) {
		this.gallery = gallery;
	}
	public float getListing() {
		return listing;
	}
	public void setListing(float listing) {
		this.listing = listing;
	}
	public float getReserve() {
		return reserve;
	}
	public void setReserve(float reserve) {
		this.reserve = reserve;
	}
	public float getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(float subtitle) {
		this.subtitle = subtitle;
	}
	public float getTenDays() {
		return tenDays;
	}
	public void setTenDays(float tenDays) {
		this.tenDays = tenDays;
	}
	public ListingFeeTier[] getListingFeeTiers() {
		return listingFeeTiers;
	}
	public void setListingFeeTiers(ListingFeeTier[] listingFeeTiers) {
		this.listingFeeTiers = listingFeeTiers;
	}
	public float getSecondCategory() {
		return secondCategory;
	}
	public void setSecondCategory(float secondCategory) {
		this.secondCategory = secondCategory;
	}
}
