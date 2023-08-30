package jp.co.internous.quest.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.quest.model.domain.MstCategory;
import jp.co.internous.quest.model.domain.MstProduct;
import jp.co.internous.quest.model.form.SearchForm;
import jp.co.internous.quest.model.mapper.MstCategoryMapper;
import jp.co.internous.quest.model.mapper.MstProductMapper;
import jp.co.internous.quest.model.session.LoginSession;

/**
 * 商品検索に関する処理を行うコントローラー
 * @author horo3150
 *
 */
@Controller
@RequestMapping("/quest")
public class IndexController {
	
	/*
	 * フィールド定義
	 */
	@Autowired
	private MstCategoryMapper categoryMapper;	
	
	@Autowired
	private MstProductMapper productMapper; 
	
	@Autowired
	private LoginSession loginSession;
	
	/**
	 * トップページを初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/")
	public String index(Model m) {
		
		if (!loginSession.getLogined() && loginSession.getTmpUserId() == 0) {
			int tmpUserId = new Random().nextInt(1_000_000_000);
			tmpUserId *= -1;
			loginSession.setTmpUserId(tmpUserId);
		}
		
		// カテゴリのドロップダSウンリストのためのデータを取得
	    List<MstCategory> categories = categoryMapper.find();
	    m.addAttribute("categories", categories);
	    
	    // 商品情報を取得
	    List<MstProduct> products = productMapper.find();
	    m.addAttribute("products", products);
		m.addAttribute("selected", 0);
	    m.addAttribute("loginSession", loginSession);
		
		return "index";
	}

	/**
	 * 検索処理を行う
	 * @param f 検索用フォーム
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm f, Model m) {

		List<MstProduct> products = null;

		String keywords = f.getKeywords().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
		if (f.getCategory() == 0) {
			// カテゴリー未選択の状態
			products = productMapper.findByProductName(keywords.split(" "));
		} else {
			products = productMapper.findByCategoryAndProductName(f.getCategory(), keywords.split(" "));
		}

		List<MstCategory> categories = categoryMapper.find();
		
		m.addAttribute("keywords", keywords);
		m.addAttribute("selected", f.getCategory()); 
		m.addAttribute("categories", categories); 
		m.addAttribute("products", products);
		// page_header.htmlでsessionの変数を表示させているため、loginSessionも画面に送る。
		m.addAttribute("loginSession", loginSession);
	 return "index";	
	}
}
