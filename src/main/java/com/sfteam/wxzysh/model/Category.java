/**
 * 
 */
package com.sfteam.wxzysh.model;

import java.util.List;

/**
 * @ClassName: Category.java
 * @Description: 分类数据模型
 * @author: knight
 * @date: 2016年6月28日 下午7:48:59
 * @company: sfteam
 */
public class Category {

	/**
	 * 分类ID
	 */
	private String cateId;

	/**
	 * 父分类ID
	 */
	private String catePid;

	/**
	 * 父分类名
	 */
	private String catePname;

	/**
	 * 分类名
	 */
	private String cateName;

	/**
	 * 管理者ID
	 */
	private String mngId;

	/**
	 * 管理者昵称
	 */
	private String mngName;

	/**
	 * 更新时间
	 */
	private String updTime;

	/**
	 * 包含标签
	 */
	private List<String> containTag;

	/**
	 * 显示标签
	 */
	private List<String> showTag;

	/**
	 * @return the cateId
	 */
	public String getCateId() {
		return cateId;
	}

	/**
	 * @param cateId
	 *            the cateId to set
	 */
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	/**
	 * @return the catePid
	 */
	public String getCatePid() {
		return catePid;
	}

	/**
	 * @param catePid
	 *            the catePid to set
	 */
	public void setCatePid(String catePid) {
		this.catePid = catePid;
	}

	/**
	 * @return the catePname
	 */
	public String getCatePname() {
		return catePname;
	}

	/**
	 * @param catePname
	 *            the catePname to set
	 */
	public void setCatePname(String catePname) {
		this.catePname = catePname;
	}

	/**
	 * @return the cateName
	 */
	public String getCateName() {
		return cateName;
	}

	/**
	 * @param cateName
	 *            the cateName to set
	 */
	public void setCateName(String cateName) {
		this.cateName = cateName;
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
	 * @return the containTag
	 */
	public List<String> getContainTag() {
		return containTag;
	}

	/**
	 * @param containTag
	 *            the containTag to set
	 */
	public void setContainTag(List<String> containTag) {
		this.containTag = containTag;
	}

	/**
	 * @return the showTag
	 */
	public List<String> getShowTag() {
		return showTag;
	}

	/**
	 * @param showTag
	 *            the showTag to set
	 */
	public void setShowTag(List<String> showTag) {
		this.showTag = showTag;
	}

}
