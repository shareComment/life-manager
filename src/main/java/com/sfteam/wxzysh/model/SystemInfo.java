/**
 * 
 */
package com.sfteam.wxzysh.model;

/**
 * @ClassName: SystemInfo.java
 * @Description: 系统参数数据模型
 * @author: knight
 * @date: 2016年7月9日 下午8:32:07
 * @company: sfteam
 */
public class SystemInfo {

	/**
	 * ID
	 */
	private String paramId;

	/**
	 * 参数备注
	 */
	private String remark;

	/**
	 * 参数名
	 */
	private String paramKey;

	/**
	 * 参数值
	 */
	private String paramValue;

	/**
	 * 管理员ID
	 */
	private String mngId;

	/**
	 * 更新时间
	 */
	private String updTime;

	/**
	 * @return the paramId
	 */
	public String getParamId() {
		return paramId;
	}

	/**
	 * @param paramId
	 *            the paramId to set
	 */
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the paramKey
	 */
	public String getParamKey() {
		return paramKey;
	}

	/**
	 * @param paramKey
	 *            the paramKey to set
	 */
	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	/**
	 * @return the paramValue
	 */
	public String getParamValue() {
		return paramValue;
	}

	/**
	 * @param paramValue
	 *            the paramValue to set
	 */
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
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

}
