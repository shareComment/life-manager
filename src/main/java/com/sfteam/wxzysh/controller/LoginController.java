/**
 * 
 */
package com.sfteam.wxzysh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfteam.wxzysh.service.ManagerService;
import com.sfteam.wxzysh.utils.ConstantUtil;
import com.sfteam.wxzysh.utils.MessageCode;

/**
 * @ClassName: LoginController.java
 * @Description: 登录管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午8:25:19
 * @company: sfteam
 */
@Controller
@RequestMapping("/")
public class LoginController {

	private static final Logger logger = Logger
			.getLogger(LoginController.class);

	@Autowired
	private ManagerService managerService;

	/**
	 * 
	 * @Title: login
	 * @Description: 管理员登录
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午9:14:58
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		if (managerService.isLogin(request)) {
			return "index";
		} else {
			if (request.getMethod().equalsIgnoreCase("post")) {
				if (StringUtils.isEmpty(request.getSession().getAttribute(
						ConstantUtil.MANAGER_RESOURCE))) {
					if (managerService.login(request, model)) {
						return "index";
					} else {
						return "signin";
					}
				} else {
					return "index";
				}
			} else {
				return "signin";
			}
		}
	}

	/**
	 * 
	 * @Title: login
	 * @Description: 管理员登录
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午8:49:53
	 */
	@RequestMapping("")
	public String login(HttpServletRequest request) {
		if (managerService.isLogin(request)) {
			return "index";
		} else {
			return "signin";
		}
	}

	/**
	 * 
	 * @Title: index
	 * @Description: 登录首页
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午9:15:35
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		if (managerService.isLogin(request)) {
			return "index";
		} else {
			return "signin";
		}
	}

	/**
	 * 
	 * @Title: timeout
	 * @Description: 登录超时
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午9:48:24
	 */
	@RequestMapping("/timeout")
	public String timeout() {
		return "timeout";
	}

	/**
	 * 
	 * @Title: logout
	 * @Description: 管理员登出
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午9:54:34
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		if (managerService.logout(request)) {
			return "signin";
		}
		return "signin";
	}
}
