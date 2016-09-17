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
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfteam.wxzysh.model.User;
import com.sfteam.wxzysh.service.UserService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: UserController.java
 * @Description: 会员管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午5:00:26
 * @company: sfteam
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * 
	 * @Title: listUser
	 * @Description: 会员列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:38:36
	 */
	@RequestMapping("")
	public String listUser(HttpServletRequest request, Model model){
		if (userService.listUser(request, model)) {
			return "user/list";
		}
		return "user/list";
	}

	/**
	 * 
	 * @Title: getUserById
	 * @Description: 取会员信息
	 * @author: knight
	 * @date: 2016年6月25日 下午5:38:36
	 */
	@RequestMapping("/userInfo")
	@ResponseBody
	public String getUserById(HttpServletRequest request, Model model){
		return userService.getUserById(request, model);
	}

	/**
	 * 
	 * @Title: searchUser
	 * @Description: 会员查询
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:40:17
	 */
	public String searchUser(){
		return "";
	}

	/**
	 * 
	 * @Title: showUser
	 * @Description: 会员详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:41:03
	 */
	public String showUser(){
		return "";
	}

	/**
	 * 
	 * @Title: updateUserStatus
	 * @Description: 会员编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:41:38
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String updateUserStatus(HttpServletRequest request, User user){
		if (userService.updateUserStatus(request, user)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
