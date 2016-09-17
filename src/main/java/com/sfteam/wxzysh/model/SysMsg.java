/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: SysMsg.java
 * @Description: 系统消息
 * @author: knight
 * @date: 2016年7月10日 下午7:11:39
 * @company: sfteam
 */
public class SysMsg {

	/**
	 * 信息ID
	 */
	private String smsId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 发送时间
	 */
	private String sendTime;

	/**
	 * @return the smsId
	 */
	public String getSmsId() {
		return smsId;
	}

	/**
	 * @param smsId
	 *            the smsId to set
	 */
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the sendTime
	 */
	public String getSendTime() {
		return sendTime;
	}

	/**
	 * @param sendTime
	 *            the sendTime to set
	 */
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
}
