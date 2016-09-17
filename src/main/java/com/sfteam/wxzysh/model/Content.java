/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Content.java
 * @Description: 关于我们、网站公告
 * @author: knight
 * @date: 2016年7月3日 下午10:03:58
 * @company: sfteam
 */
public class Content {

	/**
	 * ID
	 */
	private String conId;

	/**
	 * 类别（1：关于我们；2：网站公告）
	 */
	private String classId;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 更新者ID
	 */
	private String mngId;

	/**
	 * 更新者名
	 */
	private String mngName;

	/**
	 * 更新时间
	 */
	private String updTime;

	/**
	 * @return the conId
	 */
	public String getConId() {
		return conId;
	}

	/**
	 * @param conId
	 *            the conId to set
	 */
	public void setConId(String conId) {
		this.conId = conId;
	}

	/**
	 * @return the classId
	 */
	public String getClassId() {
		return classId;
	}

	/**
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(String classId) {
		this.classId = classId;
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
	 * @return the mngName
	 */
	public String getMngName() {
		return mngName;
	}

	/**
	 * @param mngName
	 *            the mngName to set
	 */
	public void setMngName(String mngName) {
		this.mngName = mngName;
	}

	/**
	 * @return the updTime
	 */
	public String getUpdTime() {
		return updTime;
	}

	/**
	 * @param updTime
	 *            the updTime to set
	 */
	public void setUpdTime(String updTime) {
		this.updTime = updTime;
	}
}
