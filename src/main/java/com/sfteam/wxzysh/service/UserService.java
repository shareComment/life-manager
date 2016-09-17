/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.User;

/**
 * @ClassName: UserService.java
 * @Description: 会员管理服务类
 * @author: knight
 * @date: 2016年6月27日 下午7:25:59
 * @company: sfteam
 */
public interface UserService {

	/**
	 * 
	 * @Title: listUser
	 * @Description: 会员列表
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listUser(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: getUserById
	 * @Description: 取会员信息
	 * @author: knight
	 * @date: 2016年6月25日 下午5:38:36
	 */
	public String getUserById(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: updateUserStatus
	 * @Description: 会员状态编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:41:38
	 */
	public boolean updateUserStatus(HttpServletRequest request, User user);
}
