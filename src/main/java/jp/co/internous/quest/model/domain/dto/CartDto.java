
package jp.co.internous.quest.model.domain.dto;

import java.sql.Timestamp;

/**
 * カート画面に表示するためのDTO
 * @author spacecat1945
 *
 */
public class CartDto {
	
	private int id;
	private String imageFullPath;
	private String productName;
	private int price;
	private int productCount;
	private int subtotal;
	private Timestamp createdAt;
	private Timestamp updatedAt;	
	
	/**
	 * IDを取得する
	 * @return ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * IDを設定する
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 商品名を取得する
	 * @return 商品名
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * 商品名を設定する
	 * @param productName 商品名
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * 画像フルパスを取得する
	 * @return 画像フルパス
	 */
	public String getImageFullPath() {
		return imageFullPath;
	}
	
	/**
	 * 画像フルパスを設定する
	 * @param imageFullPath 画像フルパス
	 */
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	
	/**
	 * 価格を取得する
	 * @return 価格
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * 価格を設定する
	 * @param price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * 個数を取得する
	 * @return 個数
	 */
	public int getProductCount() {
		return productCount;
	}
	
	/**
	 * 個数を設定する
	 * @param productCount 個数
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	/**
	 * 小計を取得する
	 * @return 小計
	 */
	public int getSubtotal() {
		return subtotal;
	}
	
	/**
	 * 小計を設定する
	 * @param subtotal 小計
	 */
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 * 登録日時を取得する
	 * @return 登録日時
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	/**
	 * 登録日時を設定する
	 * @param createdAt 登録日時
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	/**
	 * 更新日時を取得する
	 * @return 更新日時
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	/**
	 * 更新日時を設定する
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}