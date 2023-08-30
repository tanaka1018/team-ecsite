package jp.co.internous.quest.model.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * ログインセッション
 * @author horo3150
 *
 */
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class LoginSession implements Serializable {
	private static final long serialVersionUID = -4505629762363906244L;

	private int userId;
	private int tmpUserId;
	private String userName;
	private String password;
	private boolean logined;
	
	/**
	 * ユーザーIDを設定する
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * ユーザーIDを取得する
	 * @return ユーザーID
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * 仮ユーザーIDを設定する
	 * @param tmpUserId 仮ユーザーID
	 */
	public void setTmpUserId(int tmpUserId) {
		this.tmpUserId = tmpUserId;
	}
	
	/**
	 * 仮ユーザーIDを取得する
	 * @return 仮ユーザーID
	 */
	public int getTmpUserId() {
		return tmpUserId;
	}
	
	/**
	 * ユーザー名を設定する
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * ユーザー名を取得する
	 * @return ユーザー名
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * パスワードを設定する
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * パスワードを取得する
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * ログインフラグを設定する
	 * @param logined ログインフラグ
	 */
	public void setLogined(boolean logined) {
		this.logined = logined;
	}
	
	/**
	 * ログインフラグを取得する
	 * @return ログインフラグ
	 */
	public boolean getLogined() {
		return logined;
	}
	
}
