/**
 * 
 */
package com.sfteam.wxzysh.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sfteam.wxzysh.dao.GradeDao;
import com.sfteam.wxzysh.dao.UserDao;
import com.sfteam.wxzysh.model.Grade;
import com.sfteam.wxzysh.model.User;
import com.sfteam.wxzysh.service.GradeService;

/**
 * @ClassName: GradeServiceImpl.java
 * @Description: 会员等级管理服务类
 * @author: knight
 * @date: 2016年6月26日 下午8:38:36
 * @company: sfteam
 */
@Service
public class GradeServiceImpl implements GradeService {

	private static final Logger logger = Logger
			.getLogger(GradeServiceImpl.class);

	@Autowired
	private GradeDao gradeDao;

	/**
	 * 
	 * @Title: listGrade
	 * @Description: 会员等级列表
	 * @return String
	 * @author knight
	 * @date 2016年6月26日 下午8:38:36
	 */
	public boolean listGrade(HttpServletRequest request, Model model) {
		List<Grade> gradeList = gradeDao.listGrade();
		model.addAttribute("grade_list", gradeList);
		return true;
	}

	/**
	 * 
	 * @Title: updateGrade
	 * @Description: 会员等级更新
	 * @return String
	 * @author knight
	 * @date 2016年6月26日 下午8:38:36
	 */
	public boolean updateGrade(HttpServletRequest request, Grade grade) {
		gradeDao.updateGrade(grade);
		return true;
	}

}
