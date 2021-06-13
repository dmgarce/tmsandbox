package nz.co.tmsandbox.api.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
	
	@JsonProperty("CategoryId")
	private int categoryId;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Path")
	private String path;
	
	@JsonProperty("CanListAuctions")
	private boolean canListAuctions;
	
	@JsonProperty("CanListClassifieds")
	private boolean canListClassifieds;
	
	@JsonProperty("CanRelist")
	private boolean canRelist;
	
	@JsonProperty("LegalNotice")
	private String legalNotice;
	
	@JsonProperty("DefaultDuration")
	private int defaultDuration;
	
	@JsonProperty("AllowedDurations")
	private int[] allowedDurations;
	
	@JsonProperty("Fees")
	private Fee fees;
	
	@JsonProperty("FreePhotoCount")
	private int freePhotoCount;
	
	@JsonProperty("MaximumPhotoCount")
	private int maximumPhotoCount;
	
	@JsonProperty("IsFreeToRelist")
	private boolean isFreeToRelist;
	
	@JsonProperty("Promotions")
	private List<Promotion> promotions;

	@JsonProperty("EmbeddedOptions")
	private List<EmbeddedContentOptions> embeddedOptions;
	
	@JsonProperty("MaximumTitleLength")
	private int maximumTitleLength;
	
	@JsonProperty("AreaOfBusiness")
	private int areaOfBusiness;
	
	@JsonProperty("DefaultRelistDuration")
	private int defaultRelistDuration;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isCanListAuctions() {
		return canListAuctions;
	}

	public void setCanListAuctions(boolean canListAuctions) {
		this.canListAuctions = canListAuctions;
	}

	public boolean isCanListClassifieds() {
		return canListClassifieds;
	}

	public void setCanListClassifieds(boolean canListClassifieds) {
		this.canListClassifieds = canListClassifieds;
	}

	public boolean isCanRelist() {
		return canRelist;
	}

	public void setCanRelist(boolean canRelist) {
		this.canRelist = canRelist;
	}

	public String getLegalNotice() {
		return legalNotice;
	}

	public void setLegalNotice(String legalNotice) {
		this.legalNotice = legalNotice;
	}

	public int getDefaultDuration() {
		return defaultDuration;
	}

	public void setDefaultDuration(int defaultDuration) {
		this.defaultDuration = defaultDuration;
	}

	public int[] getAllowedDurations() {
		return allowedDurations;
	}

	public void setAllowedDurations(int[] allowedDurations) {
		this.allowedDurations = allowedDurations;
	}

	public Fee getFees() {
		return fees;
	}

	public void setFees(Fee fees) {
		this.fees = fees;
	}

	public int getFreePhotoCount() {
		return freePhotoCount;
	}

	public void setFreePhotoCount(int freePhotoCount) {
		this.freePhotoCount = freePhotoCount;
	}

	public int getMaximumPhotoCount() {
		return maximumPhotoCount;
	}

	public void setMaximumPhotoCount(int maximumPhotoCount) {
		this.maximumPhotoCount = maximumPhotoCount;
	}

	public boolean isFreeToRelist() {
		return isFreeToRelist;
	}

	public void setFreeToRelist(boolean isFreeToRelist) {
		this.isFreeToRelist = isFreeToRelist;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public List<EmbeddedContentOptions> getEmbeddedOptions() {
		return embeddedOptions;
	}

	public void setEmbeddedOptions(List<EmbeddedContentOptions> embeddedOptions) {
		this.embeddedOptions = embeddedOptions;
	}

	public int getMaximumTitleLength() {
		return maximumTitleLength;
	}

	public void setMaximumTitleLength(int maximumTitleLength) {
		this.maximumTitleLength = maximumTitleLength;
	}

	public int getAreaOfBusiness() {
		return areaOfBusiness;
	}

	public void setAreaOfBusiness(int areaOfBusiness) {
		this.areaOfBusiness = areaOfBusiness;
	}

	public int getDefaultRelistDuration() {
		return defaultRelistDuration;
	}

	public void setDefaultRelistDuration(int defaultRelistDuration) {
		this.defaultRelistDuration = defaultRelistDuration;
	}

}
