/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.Grade;


/**
 * @ClassName: GradeDao.java
 * @Description: 会员等级管理数据类
 * @author: knight
 * @date: 2016年6月26日 下午8:17:40
 * @company: sfteam
 */
public interface GradeDao {

	/**
	 * @Title: listGrade
	 * @Description: 查询会员等级列表
	 * @author: knight
	 * @date: 2016年6月26日 下午8:17:40
	 */
	public List<Grade> listGrade();

	/**
	 * @Title: updateGrade
	 * @Description: 会员等级更新
	 * @author: knight
	 * @date: 2016年6月26日 下午8:17:40
	 */
	public void updateGrade(Grade grade);

}
