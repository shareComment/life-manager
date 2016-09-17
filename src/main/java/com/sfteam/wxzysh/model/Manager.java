/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Manager.java
 * @Description: 管理员数据模型
 * @author: knight
 * @date: 2016年6月27日 上午11:58:54
 * @company: sfteam
 */
public class Manager {

	/**
	 * ID
	 */
	private String mngId;

	/**
	 * 管理员昵称
	 */
	private String nickname;

	/**
	 * 管理员密码
	 */
	private String password;

	/**
	 * 盐值
	 */
	private String salt;

	/**
	 * 手机号码
	 */
	private String telephone;

	/**
	 * 上回登录时间
	 */
	private String lastTime;

	/**
	 * @return the mngId
	 */
	public String getMngId() {
		return mngId;
	}

	/**
	 * @param mngId
	 *            the mngId to set
	 */
	public void setMngId(String mngId) {
		this.mngId = mngId;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname
	 *            the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the lastTime
	 */
	public String getLastTime() {
		return lastTime;
	}

	/**
	 * @param lastTime
	 *            the lastTime to set
	 */
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

}
