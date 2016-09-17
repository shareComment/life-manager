/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Tag.java
 * @Description: 标签模型类
 * @author: knight
 * @date: 2016年6月28日 下午4:03:58
 * @company: sfteam
 */
public class Tag {

	/**
	 * 标签ID
	 */
	private String tagId;

	/**
	 * 标签名
	 */
	private String tagName;

	/**
	 * 操作管理员
	 */
	private String mngId;

	/**
	 * 管理员名
	 */
	private String mngName;

	/**
	 * 更新时间
	 */
	private String updTime;

	private String cateId;

	private String brandId;

	private String visable;

	/**
	 * @return the tagId
	 */
	public String getTagId() {
		return tagId;
	}

	/**
	 * @param tagId
	 *            the tagId to set
	 */
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	/**
	 * @return the tagName
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * @param tagName
	 *            the tagName to set
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
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

	/**
	 * @return the cateId
	 */
	public String getCateId() {
		return cateId;
	}

	/**
	 * @param cateId the cateId to set
	 */
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	/**
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	/**
	 * @return the visable
	 */
	public String getVisable() {
		return visable;
	}

	/**
	 * @param visable the visable to set
	 */
	public void setVisable(String visable) {
		this.visable = visable;
	}

}
