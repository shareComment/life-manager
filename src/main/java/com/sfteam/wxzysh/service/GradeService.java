/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Grade;

/**
 * @ClassName: GradeService.java
 * @Description: 会员等级管理服务接口
 * @author: knight
 * @date: 2016年6月26日 下午8:14:11
 * @company: sfteam
 */
public interface GradeService {

	/**
	 * @Title: listGrade
	 * @Description: 会员等级列表
	 * @author: knight
	 * @date: 2016年6月26日 下午8:14:11
	 */
	public boolean listGrade(HttpServletRequest request, Model model);

	/**
	 * @Title: updateGrade
	 * @Description: 会员等级更新
	 * @author: knight
	 * @date: 2016年6月26日 下午8:14:11
	 */
	public boolean updateGrade(HttpServletRequest request, Grade grade);

}
