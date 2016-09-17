/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: User.java
 * @Description: 会员数据模型
 * @author: knight
 * @date: 2016年6月27日 下午7:25:59
 * @company: sfteam
 */
public class User {

	/**
	 * 会员ID
	 */
	private String userId;

	/**
	 * 会员昵称
	 */
	private String nickname;

	/**
	 * 会员真名
	 */
	private String username;

	/**
	 * 会员手机号
	 */
	private String telephone;

	/**
	 * 会员密码
	 */
	private String password;

	/**
	 * 盐值
	 */
	private String salt;

	/**
	 * 会员邮箱
	 */
	private String email;

	/**
	 * 会员头像
	 */
	private String avatar;

	/**
	 * 会员积分
	 */
	private String bonusPoint;

	/**
	 * 会员等级
	 */
	private String gradeId;

	/**
	 * 会员地址
	 */
	private String address;

	/**
	 * 身份证号码
	 */
	private String idcard;

	/**
	 * 会员状态
	 */
	private String status;

	/**
	 * 加入时间
	 */
	private String addTime;

	/**
	 * 最后登录时间
	 */
	private String lastTime;

	/**
	 * 等级名称
	 */
	private String gradeName;

	/**
	 * 该等级最低分
	 */
	private String minPoint;

	/**
	 * 该等级最高分
	 */
	private String maxPoint;

	/**
	 * 等级颜色标记
	 */
	private String gradeColor;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 学历
	 */
	private String education;

	/**
	 * 年龄
	 */
	private String age;

	/**
	 * 毕业院校
	 */
	private String collage;

	/**
	 * 身份证照正面
	 */
	private String imgA;

	/**
	 * 身份证照反面
	 */
	private String imgB;

	/**
	 * 审核状态
	 */
	private String verified;

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education
	 *            the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the collage
	 */
	public String getCollage() {
		return collage;
	}

	/**
	 * @param collage
	 *            the collage to set
	 */
	public void setCollage(String collage) {
		this.collage = collage;
	}

	/**
	 * @return the imgA
	 */
	public String getImgA() {
		return imgA;
	}

	/**
	 * @param imgA
	 *            the imgA to set
	 */
	public void setImgA(String imgA) {
		this.imgA = imgA;
	}

	/**
	 * @return the imgB
	 */
	public String getImgB() {
		return imgB;
	}

	/**
	 * @param imgB
	 *            the imgB to set
	 */
	public void setImgB(String imgB) {
		this.imgB = imgB;
	}

	/**
	 * @return the verified
	 */
	public String getVerified() {
		return verified;
	}

	/**
	 * @param verified
	 *            the verified to set
	 */
	public void setVerified(String verified) {
		this.verified = verified;
	}

	/**
	 * @return the gradeName
	 */
	public String getGradeName() {
		return gradeName;
	}

	/**
	 * @param gradeName
	 *            the gradeName to set
	 */
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	/**
	 * @return the minPoint
	 */
	public String getMinPoint() {
		return minPoint;
	}

	/**
	 * @param minPoint
	 *            the minPoint to set
	 */
	public void setMinPoint(String minPoint) {
		this.minPoint = minPoint;
	}

	/**
	 * @return the maxPoint
	 */
	public String getMaxPoint() {
		return maxPoint;
	}

	/**
	 * @param maxPoint
	 *            the maxPoint to set
	 */
	public void setMaxPoint(String maxPoint) {
		this.maxPoint = maxPoint;
	}

	/**
	 * @return the gradeColor
	 */
	public String getGradeColor() {
		return gradeColor;
	}

	/**
	 * @param gradeColor
	 *            the gradeColor to set
	 */
	public void setGradeColor(String gradeColor) {
		this.gradeColor = gradeColor;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the bonusPoint
	 */
	public String getBonusPoint() {
		return bonusPoint;
	}

	/**
	 * @param bonusPoint
	 *            the bonusPoint to set
	 */
	public void setBonusPoint(String bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	/**
	 * @return the gradeId
	 */
	public String getGradeId() {
		return gradeId;
	}

	/**
	 * @param gradeId
	 *            the gradeId to set
	 */
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}

	/**
	 * @param idcard
	 *            the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
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
