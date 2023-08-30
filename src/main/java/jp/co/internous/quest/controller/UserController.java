package jp.co.internous.quest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.quest.model.domain.MstUser;
import jp.co.internous.quest.model.form.UserForm;
import jp.co.internous.quest.model.mapper.MstUserMapper;
import jp.co.internous.quest.model.session.LoginSession;


/**
 * ユーザー登録に関する処理を行うコントローラー
 * @author tanaka1018
 *
 */
@Controller
@RequestMapping("/quest/user")
public class UserController {
		
	@Autowired
	private MstUserMapper userMapper;
	
	@Autowired
	private LoginSession loginSession;
	/*
	 * フィールド定義
	 */
	
	/**
	 * 新規ユーザー登録画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return 新規ユーザー登録画面
	 */
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("loginSession", loginSession);
		return "register_user";
	}
	
	/**
	 * ユーザー名重複チェックを行う
	 * @param f ユーザーフォーム
	 * @return true:登録成功、false:登録失敗
	 */
	@PostMapping("/duplicatedUserName")
	@ResponseBody
	public boolean duplicatedUserName(@RequestBody UserForm f) {
		// DBに同じ名前のユーザーがいるかチェックしたい
		int count = userMapper.findCountByUserName(f.getUserName());
		// DB同じ名前の件数が0の場合はtrue、1の場合はfalse
		boolean result = false;
		if(count > 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
		
	/**
	 * ユーザー情報登録を行う
	 * @param UserForm ユーザーフォーム
	 * @return true:登録成功、false:登録失敗
	 */
	@PostMapping("/register")
	@ResponseBody
	public boolean register(@RequestBody UserForm f) {
		//DBに情報を登録(挿入)したい
		MstUser addUser = new MstUser(f);
		
		addUser.setUserName(f.getUserName());
		addUser.setPassword(f.getPassword());
		addUser.setFamilyName(f.getFamilyName());
		addUser.setFirstName(f.getFirstName());
		addUser.setFamilyNameKana(f.getFamilyNameKana());
		addUser.setFirstNameKana(f.getFirstNameKana());
		addUser.setGender(f.getGender());
		addUser.setCreatedAt(f.getCreatedAt());
		addUser.setUpdatedAt(f.getUpdatedAt());
		
		int count = userMapper.insert(addUser);
		//DBに登録成功し、件数が増えた場合は1(true)、失敗の場合は0(false)		
		boolean result = false;
		if(count > 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
