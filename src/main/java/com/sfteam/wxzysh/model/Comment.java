/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Comment.java
 * @Description: 评论数据模型
 * @author: knight
 * @date: 2016年7月10日 下午8:52:58
 * @company: sfteam
 */
public class Comment {

	/**
	 * 评论ID
	 */
	private String commentId;

	/**
	 * 品牌ID
	 */
	private String brandId;

	/**
	 * 品牌名
	 */
	private String brandName;

	/**
	 * 会员ID
	 */
	private String userId;

	/**
	 * 会员昵称
	 */
	private String nickname;

	/**
	 * 父级评论ID
	 */
	private String commentPid;

	/**
	 * 评论内容
	 */
	private String comment;

	/**
	 * 评论图片
	 */
	private String commentImg;

	/**
	 * 评论时间
	 */
	private String addTime;

	/**
	 * 评论状态
	 */
	private String status;

	/**
	 * @return the commentId
	 */
	public String getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId
	 *            the commentId to set
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the commentPid
	 */
	public String getCommentPid() {
		return commentPid;
	}

	/**
	 * @param commentPid
	 *            the commentPid to set
	 */
	public void setCommentPid(String commentPid) {
		this.commentPid = commentPid;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the commentImg
	 */
	public String getCommentImg() {
		return commentImg;
	}

	/**
	 * @param commentImg
	 *            the commentImg to set
	 */
	public void setCommentImg(String commentImg) {
		this.commentImg = commentImg;
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

}
