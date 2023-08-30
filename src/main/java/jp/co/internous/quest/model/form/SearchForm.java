package jp.co.internous.quest.model.form;

import java.io.Serializable;

/**
 * 検索フォーム
 * @author horo3150
 *
 */
public class SearchForm  implements Serializable{
	private static final long serialVersionUID = 1L;
	private int category;
	private String keywords;

	/**
	 * キーワードを設定する
	 * @return keywords キーワード
	 */
	public String getKeywords() {
		return keywords;
	}
	
	/**
	 * キーワードを取得する
	 * @return キーワード
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	/**
	 * カテゴリを設定する
	 * @param category カテゴリ
	 */
	public int getCategory() {
		return category;
	}
	
	/**
	 * カテゴリを取得する
	 * @return カテゴリ
	 */
	public void setCategory(int category) {
		this.category = category;
	}
}
