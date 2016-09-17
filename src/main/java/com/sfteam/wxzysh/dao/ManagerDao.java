/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.Manager;

/**
 * @ClassName: ManagerDao.java
 * @Description: 管理员数据操作类
 * @author: knight
 * @date: 2016年6月27日 下午12:04:50
 * @company: sfteam
 */
public interface ManagerDao {

	/**
	 * 
	 * @Title: findManagerByTel
	 * @Description: 根据管理员手机号查询
	 * @return: Manager
	 * @author: knight
	 * @date: 2016年6月27日 下午12:06:08
	 */
	public Manager findManagerByTel(String telephone);

	/**
	 * @Title: listManager
	 * @Description: 管理员列表
	 * @return: List<Manager>
	 * @author: knight
	 * @date: 2016年7月9日 上午9:43:23
	 */
	public List<Manager> listManager();

	/**
	 * @Title: addManager
	 * @Description: 添加管理员
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年7月9日 上午10:49:50
	 */
	public void addManager(Manager manager);

	/**
	 * 
	 * @Title: resetPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	public void resetPass(Manager manager);

	/**
	 * @Title: getManagerById
	 * @Description: 根据管理员ID取信息
	 * @author: knight
	 * @date: 2016年7月9日 下午7:34:18
	 */
	public Manager getManagerById(Manager manager);
}
