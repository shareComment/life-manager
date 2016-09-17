/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Manager;

/**
 * @ClassName: ManagerService.java
 * @Description: 管理员服务类
 * @author: knight
 * @date: 2016年6月27日 下午12:07:26
 * @company: sfteam
 */
public interface ManagerService {

	/**
	 * 
	 * @Title: login
	 * @Description: 管理员登录
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午12:11:05
	 */
	public boolean login(HttpServletRequest request, Model model);

	/**
	 * @Title: isLogin
	 * @Description: 判断用户是否已登录
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 上午8:27:54
	 */
	public boolean isLogin(HttpServletRequest request);

	/**
	 * @Title: logout
	 * @Description: 管理员登出
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 上午8:29:21
	 */
	public boolean logout(HttpServletRequest request);

	/**
	 * @Title: listManager
	 * @Description: 管理员列表
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年7月9日 上午9:39:59
	 */
	public boolean listManager(HttpServletRequest request, Model model);

	/**
	 * @Title: addManager
	 * @Description: 添加管理员
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年7月9日 上午10:49:50
	 */
	public boolean addManager(HttpServletRequest request, Manager manager);

	/**
	 * 
	 * @Title: resetPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	public boolean resetPass(HttpServletRequest request, Manager manager);

	/**
	 * 
	 * @Title: chgPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	public boolean chgPass(HttpServletRequest request, Model model);
}
