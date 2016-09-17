/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Feed.java
 * @Description: 用户反馈数据模型
 * @author: knight
 * @date: 2016年6月29日 下午10:41:17
 * @company: sfteam
 */
public class Feed {

	/**
	 * ID
	 */
	private String feedId;

	/**
	 * 会员昵称
	 */
	private String nickname;

	/**
	 * 手机号码
	 */
	private String telephone;

	/**
	 * 反馈内容
	 */
	private String feedCon;

	/**
	 * 添加时间
	 */
	private String addTime;

	/**
	 * @return the feedId
	 */
	public String getFeedId() {
		return feedId;
	}

	/**
	 * @param feedId
	 *            the feedId to set
	 */
	public void setFeedId(String feedId) {
		this.feedId = feedId;
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
	 * @return the feedCon
	 */
	public String getFeedCon() {
		return feedCon;
	}

	/**
	 * @param feedCon
	 *            the feedCon to set
	 */
	public void setFeedCon(String feedCon) {
		this.feedCon = feedCon;
	}

	/**
	 * @return the addTime
	 */
	public String getAddTime() {
		return addTime;
	}

	/**
	 * @param addTime
	 *            the addTime to set
	 */
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}
