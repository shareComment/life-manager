/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: Grade.java
 * @Description: 会员等级数据模型
 * @author: knight
 * @date: 2016年6月26日 下午8:19:14
 * @company: sfteam
 */
public class Grade {

	/**
	 * 等级ID
	 */
	private String gradeId;

	/**
	 * 等级名称
	 */
	private String gradeName;

	/**
	 * 该等级最低分数
	 */
	private String minPoint;

	/**
	 * 该等级最高分数
	 */
	private String maxPoint;

	/**
	 * 该等级显示字体颜色
	 */
	private String gradeColor;

	/**
	 * 更新时间
	 */
	private String updTime;

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
