/**
 * 
 */
package com.sfteam.wxzysh.model;

import java.util.List;

/**
 * @ClassName: Brand.java
 * @Description: 品牌数据模型
 * @author: knight
 * @date: 2016年6月29日 下午9:16:12
 * @company: sfteam
 */
public class Brand {

	/**
	 * ID
	 */
	private String brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 品牌官网
	 */
	private String officialWebsite;

	/**
	 * 类别ID
	 */
	private String cateId;

	/**
	 * 类别名
	 */
	private String cateName;

	/**
	 * 品牌图片
	 */
	private String wapImg;

	/**
	 * 品牌图片
	 */
	private String pcImg;

	/**
	 * 企业名称
	 */
	private String coName;

	/**
	 * 成立时间
	 */
	private String stdTime;

	/**
	 * 总部地址
	 */
	private String coAddress;

	/**
	 * 经营产品
	 */
	private String bizScope;

	/**
	 * 评分
	 */
	private String score;

	/**
	 * 添加时间
	 */
	private String addTime;

	/**
	 * 更新时间
	 */
	private String updTime;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 品牌信息
	 */
	private String brandInfo;

	/**
	 * 管理ID
	 */
	private String mngId;

	/**
	 * 含有标签
	 */
	private List<String> tags;

	/**
	 * @return the brandInfo
	 */
	public String getBrandInfo() {
		return brandInfo;
	}

	/**
	 * @param brandInfo
	 *            the brandInfo to set
	 */
	public void setBrandInfo(String brandInfo) {
		this.brandInfo = brandInfo;
	}

	/**
	 * @return the wapImg
	 */
	public String getWapImg() {
		return wapImg;
	}

	/**
	 * @param wapImg
	 *            the wapImg to set
	 */
	public void setWapImg(String wapImg) {
		this.wapImg = wapImg;
	}

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
	 * @return the officialWebsite
	 */
	public String getOfficialWebsite() {
		return officialWebsite;
	}

	/**
	 * @param officialWebsite
	 *            the officialWebsite to set
	 */
	public void setOfficialWebsite(String officialWebsite) {
		this.officialWebsite = officialWebsite;
	}

	/**
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * @param brandId
	 *            the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName
	 *            the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	 * @return the pcImg
	 */
	public String getPcImg() {
		return pcImg;
	}

	/**
	 * @param pcImg
	 *            the pcImg to set
	 */
	public void setPcImg(String pcImg) {
		this.pcImg = pcImg;
	}

	/**
	 * @return the coName
	 */
	public String getCoName() {
		return coName;
	}

	/**
	 * @param coName
	 *            the coName to set
	 */
	public void setCoName(String coName) {
		this.coName = coName;
	}

	/**
	 * @return the stdTime
	 */
	public String getStdTime() {
		return stdTime;
	}

	/**
	 * @param stdTime
	 *            the stdTime to set
	 */
	public void setStdTime(String stdTime) {
		this.stdTime = stdTime;
	}

	/**
	 * @return the coAddress
	 */
	public String getCoAddress() {
		return coAddress;
	}

	/**
	 * @param coAddress
	 *            the coAddress to set
	 */
	public void setCoAddress(String coAddress) {
		this.coAddress = coAddress;
	}

	/**
	 * @return the bizScope
	 */
	public String getBizScope() {
		return bizScope;
	}

	/**
	 * @param bizScope
	 *            the bizScope to set
	 */
	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
	}

	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(String score) {
		this.score = score;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
