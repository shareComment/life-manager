/**
 * 
 */
package com.sfteam.wxzysh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfteam.wxzysh.model.Grade;
import com.sfteam.wxzysh.service.GradeService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: GradeController.java
 * @Description: 会员等级管理控制器
 * @author: knight
 * @date: 2016年6月26日 下午8:12:30
 * @company: sfteam
 */
@Controller
@RequestMapping("/grade")
public class GradeController {

	private static final Logger logger = Logger.getLogger(GradeController.class);

	@Autowired
	private GradeService gradeService;

	/**
	 * 
	 * @Title: listGrade
	 * @Description: 会员等级列表
	 * @return String
	 * @author knight
	 * @date 2016年6月26日 下午8:38:36
	 */
	@RequestMapping("")
	public String listGrade(HttpServletRequest request, Model model){
		if (gradeService.listGrade(request, model)) {
			return "grade/list";
		}
		return "grade/list";
	}

	/**
	 * 
	 * @Title: updateGrade
	 * @Description: 会员等级更新
	 * @return String
	 * @author knight
	 * @date 2016年6月26日 下午8:38:36
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateGrade(HttpServletRequest request, Grade grade){
		if (gradeService.updateGrade(request, grade)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
