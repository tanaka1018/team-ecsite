package jp.co.internous.quest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import jp.co.internous.quest.model.domain.MstUser;
import jp.co.internous.quest.model.form.UserForm;
import jp.co.internous.quest.model.mapper.MstUserMapper;
import jp.co.internous.quest.model.mapper.TblCartMapper;
import jp.co.internous.quest.model.session.LoginSession;

/**
 * 認証に関する処理を行うコントローラー
 * @author horo3150
 *
 */
@RestController
@RequestMapping("/quest/auth")
public class AuthController {
	/*
	*フィールド定義
	*/
	private Gson gson = new Gson();

	@Autowired
	private LoginSession loginSession;

	@Autowired
	private MstUserMapper userMapper;

	@Autowired
	private TblCartMapper cartMapper;

	/**
	 * ログイン処理をおこなう
	 * @param f ユーザーフォーム
	 * @return ログインしたユーザー情報(JSON形式)
	 */
	@PostMapping("/login")
	public String login(@RequestBody UserForm f) {
		MstUser user = userMapper.findByUserNameAndPassword(f.getUserName(), f.getPassword());

		int tmpUserId = loginSession.getTmpUserId();
		// 仮IDでカート追加されていれば、本ユーザーIDに更新する。
		if (user != null && tmpUserId != 0) {
			int count = cartMapper.findCountByUserId(tmpUserId);
			if (count > 0) {
				cartMapper.updateUserId(user.getId(), tmpUserId);
			}
		}

		if (user != null) {
			loginSession.setTmpUserId(0);
			loginSession.setLogined(true);
			loginSession.setUserId(user.getId());
			loginSession.setUserName(user.getUserName());
			loginSession.setPassword(user.getPassword());
		} else {
			loginSession.setLogined(false);
			loginSession.setUserId(0);
			loginSession.setUserName(null);
			loginSession.setPassword(null);
		}

		return gson.toJson(user);
	}

	/**
	 * ログアウト処理をおこなう
	 * @return 空文字
	 */
	@PostMapping("/logout")
	public String logout() {
		
		loginSession.setTmpUserId(0);
		loginSession.setUserId(0);
		loginSession.setUserName(null);
		loginSession.setPassword(null);
		loginSession.setLogined(false);

		return "";
	}

	/**
	 * パスワード再設定をおこなう
	 * @param f ユーザーフォーム
	 * @return 処理後のメッセージ
	 */
	@PostMapping("/resetPassword")
		public String resetPassword(@RequestBody UserForm f) {
			String newPassword = f.getNewPassword();
				
			MstUser user = userMapper.findByUserNameAndPassword(f.getUserName(), f.getPassword());
			if (user == null) {
				return "現在のパスワードが正しくありません。";
			}
				
			if (user.getPassword().equals(newPassword)) {
				return "現在のパスワードと同一文字列が入力されました。";
			}
			
			// mst_userとloginSessionのパスワードを更新する
			userMapper.updatePassword(user.getUserName(), f.getNewPassword());
			loginSession.setPassword(f.getNewPassword());
				
			return "パスワードが再設定されました。";
		}
	}
