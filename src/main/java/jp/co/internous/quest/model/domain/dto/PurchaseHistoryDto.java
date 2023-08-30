

package jp.co.internous.quest.model.domain.dto;

public class PurchaseHistoryDto {
	private String purchasedAt;
	private String productName;
	private int price;
	private int productCount;
	private String firstName;
	private String familyName;
	private String address;
	
	public String getPurchasedAt() {
		return purchasedAt;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public int getProductCount() {
		return productCount;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getAddress() {
		return address;
	}

	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
