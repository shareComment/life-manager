/**
 * 
 */
package com.sfteam.wxzysh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: BonusController.java
 * @Description: 积分管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午4:57:02
 * @company: sfteam
 */
@Controller
@RequestMapping("/bonus")
public class BonusController {

	private static final Logger logger = Logger
			.getLogger(BonusController.class);

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping("")
	public String listCategory(HttpServletRequest request, Model model) {
		return "bonus/bonus";
	}
}
