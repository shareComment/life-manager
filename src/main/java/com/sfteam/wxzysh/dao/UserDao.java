/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.User;

/**
 * @ClassName: UserDao.java
 * @Description: 会员管理数据操作类
 * @author: knight
 * @date: 2016年6月27日 下午7:25:59
 * @company: sfteam
 */
public interface UserDao {

	/**
	 * 
	 * @Title: listUser
	 * @Description: 会员列表
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public List<User> listUser();

	/**
	 * 
	 * @Title: getUserById
	 * @Description: 取会员信息
	 * @author: knight
	 * @date: 2016年6月25日 下午5:38:36
	 */
	public User getUserById(String userId);

	/**
	 * 
	 * @Title: updateUserStatus
	 * @Description: 会员状态编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:41:38
	 */
	public void updateUserStatus(User user);

}
