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

import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.service.ManagerService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: ManagerController.java
 * @Description: 管理员控制器
 * @author: knight
 * @date: 2016年6月25日 下午12:47:37
 * @company: sfteam
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

	private static final Logger logger = Logger
			.getLogger(ManagerController.class);

	@Autowired
	private ManagerService managerService;

	/**
	 * 
	 * @Title: index
	 * @Description: 后台首页
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月25日 下午12:47:37
	 */
	@RequestMapping("index")
	public String index(HttpServletRequest request, Model model) {
		model.addAttribute("name", "knight");
		return "index";
	}

	/**
	 * 
	 * @Title: listManager
	 * @Description: 管理员列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping("")
	public String listManager(HttpServletRequest request, Model model) {
		if (managerService.listManager(request, model)) {
			return "manager/list";
		}
		return "manager/list";
	}

	/**
	 * 
	 * @Title: addManager
	 * @Description: 添加管理员
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 上午10:47:06
	 */
	@RequestMapping("/add")
	@ResponseBody
	public String addManager(HttpServletRequest request, Manager manager){
		if (managerService.addManager(request, manager)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: resetPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	@RequestMapping("/reset")
	@ResponseBody
	public String resetPass(HttpServletRequest request, Manager manager) {
		if (managerService.resetPass(request, manager)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: chgPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	@RequestMapping(value = "/chgPass", method = RequestMethod.POST)
	@ResponseBody
	public String chgPass(HttpServletRequest request, Model model) {
		if (managerService.chgPass(request, model)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
