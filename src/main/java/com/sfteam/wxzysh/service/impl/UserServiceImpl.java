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

import com.sfteam.wxzysh.dao.UserDao;
import com.sfteam.wxzysh.model.User;
import com.sfteam.wxzysh.service.UserService;
import com.sfteam.wxzysh.utils.JsonUtil;

/**
 * @ClassName: UserServiceImpl.java
 * @Description: 会员管理服务类
 * @author: knight
 * @date: 2016年6月27日 下午7:25:59
 * @company: sfteam
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = Logger
			.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	/**
	 * 
	 * @Title: listUser
	 * @Description: 会员列表
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listUser(HttpServletRequest request, Model model) {
		List<User> userList = userDao.listUser();
		model.addAttribute("user_list", userList);
		return true;
	}

	/**
	 * 
	 * @Title: getUserById
	 * @Description: 取会员信息
	 * @author: knight
	 * @date: 2016年6月25日 下午5:38:36
	 */
	public String getUserById(HttpServletRequest request, Model model) {
		String userId = request.getParameter("userId");
		User user = userDao.getUserById(userId);
		return JsonUtil.getJsonFromModel(user);
	}

	/**
	 * 
	 * @Title: updateUserStatus
	 * @Description: 会员状态编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:41:38
	 */
	public boolean updateUserStatus(HttpServletRequest request, User user) {
		userDao.updateUserStatus(user);
		return true;
	}

}
