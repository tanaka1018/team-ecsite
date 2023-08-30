package jp.co.internous.quest.model.domain;

import java.sql.Timestamp;
/**
 * mst_productのドメイン
 * @author r-kikuchi8888
 *
 */
public class MstProduct {
	
	private int id;
	
	private String productName;
	
	private String productNameKana;
	
	private String productDescription;
	
	private int categoryId;
	
	private int price;
	
	private String imageFullPath;
	
	private String releaseDate;
	
	private String releaseCompany;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
	
	/**
     * 商品IDを取得する。
     * 
     * @return 商品ID
     */
	public int getId() {
		return id;
	}
	
	/**
     * 商品IDを設定する。
     * 
     * @param id 商品ID
     */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
     * 商品名を取得する。
     * 
     * @return 商品名
     */
	public String getProductName() {
		return productName;
	}
	
	 /**
     * 商品名を設定する。
     * 
     * @param productName 商品名
     */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	 /**
     * 商品名のかな表記を取得する。
     * 
     * @return 商品名のかな表記
     */
	public String getProductNameKana() {
		return productNameKana;
	}
	
	/**
     * 商品名のかな表記を設定する。
     * 
     * @param productNameKana 商品名のかな表記
     */
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana; 
	}

    /**
     * 商品の詳細説明を取得する。
     * 
     * @return 商品の詳細説明
     */
	public String getProductDescription() {
		return productDescription;
	}
	
	/**
     * 商品の詳細説明を設定する。
     * 
     * @param productDescription 商品の詳細説明
     */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	/**
	 * 商品カテゴリIDを取得する。
	 * 
	 * @return 商品カテゴリID
	 */
	public int getCategoryId() {
		return categoryId;
	}
	
	/**
	 * 商品カテゴリIDを設定する。
	 * 
	 * @param categoryId 商品カテゴリID
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * 商品の価格を取得する。
	 * 
	 * @return 商品の価格
	 */
	public  int getPrice() {
		return price;
	}
	
	/**
	 * 商品の価格を設定する。
	 * 
	 * @param price 商品の価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * 商品の画像のフルパスを取得する。
	 * 
	 * @return 商品の画像のフルパス
	 */
	public String getImageFullPath() {
		return imageFullPath;
	}
	
	/**
	 * 商品の画像のフルパスを設定する。
	 * 
	 * @param imageFullPath 商品の画像のフルパス
	 */
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	
	/**
	 * 商品の発売日を取得する。
	 * 
	 * @return 商品の発売日
	 */
	public String getReleaseDate() {
		return releaseDate;
	}
	
	/**
	 * 商品の発売日を設定する。
	 * 
	 * @param releaseDate 商品の発売日
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;	
	}
	
	/**
	 * 商品の発売会社を取得する。
	 * 
	 * @return 商品の発売会社
	 */
	public  String getReleaseCompany() {
		return releaseCompany;
	}
	
	/**
	 * 商品の発売会社を設定する。
	 * 
	 * @param releaseCompany 商品の発売会社
	 */
	public void setReleaseCompany( String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	
	/**
	 * 商品の作成日時を取得する。
	 * 
	 * @return 商品の作成日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * 商品の作成日時を設定する。
	 * 
	 * @param createdAt 商品の作成日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * 商品の更新日時を取得する。
	 * 
	 * @return 商品の更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * 商品の更新日時を設定する。
	 * 
	 * @param updatedAt 商品の更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
