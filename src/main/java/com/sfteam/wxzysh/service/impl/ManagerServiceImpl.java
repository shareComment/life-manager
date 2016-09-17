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
import org.springframework.util.StringUtils;

import com.sfteam.wxzysh.dao.ManagerDao;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.service.ManagerService;
import com.sfteam.wxzysh.utils.BizUtil;
import com.sfteam.wxzysh.utils.CommUtil;
import com.sfteam.wxzysh.utils.ConstantUtil;
import com.sfteam.wxzysh.utils.MD5Util;
import com.sfteam.wxzysh.utils.MessageCode;

/**
 * @ClassName: ManagerServiceImpl.java
 * @Description: 管理员服务类
 * @author: knight
 * @date: 2016年6月27日 下午12:07:26
 * @company: sfteam
 */
@Service
public class ManagerServiceImpl implements ManagerService {

	private static final Logger logger = Logger
			.getLogger(ManagerServiceImpl.class);

	@Autowired
	private ManagerDao managerDao;

	/**
	 * 
	 * @Title: login
	 * @Description: 管理员登录
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午12:11:05
	 */
	public boolean login(HttpServletRequest request, Model model) {
		String telephone = request.getParameter("telephone");
		String password = request.getParameter("password");
		Manager manager = managerDao.findManagerByTel(telephone);
		// 查询账号是否存在
		if (!StringUtils.isEmpty(manager)) {
			// 验证密码是否正确
			if (manager.getPassword().equals(
					MD5Util.getMD5String(password + manager.getSalt()))) {
				logger.info("管理员：" + telephone + "  成功登录系统！");
				request.getSession().setAttribute(
						ConstantUtil.MANAGER_RESOURCE, manager);
				return true;
			}
		}
		model.addAttribute(ConstantUtil.PAGE_MESSAGE, MessageCode.E0000001);
		logger.warn("IP:" + CommUtil.getIpAddr(request) + "  尝试以账号："
				+ telephone + "  登录系统！");
		return false;
	}

	/**
	 * 
	 * @Title: isLogin
	 * @Description: 判断用户是否已登录
	 * @return boolean
	 * @author knight
	 * @date 2016年6月27日 下午4:30:41
	 */
	public boolean isLogin(HttpServletRequest request) {
		if (StringUtils.isEmpty(request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE))) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @Title: logout
	 * @Description: 账户登出
	 * @return boolean
	 * @author knight
	 * @date 2016年6月27日 下午4:36:27
	 */
	public boolean logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return true;
	}

	/**
	 * @Title: listManager
	 * @Description: 管理员列表
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年7月9日 上午9:39:59
	 */
	public boolean listManager(HttpServletRequest request, Model model) {
		List<Manager> managerList = managerDao.listManager();
		model.addAttribute("manager_list", managerList);
		return true;
	}

	/**
	 * @Title: addManager
	 * @Description: 添加管理员
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年7月9日 上午10:49:50
	 */
	public boolean addManager(HttpServletRequest request, Manager manager) {
		String salt = BizUtil.getSalt();
		manager.setMngId(BizUtil.getUUID());
		manager.setSalt(salt);
		manager.setPassword(MD5Util.getMD5String(ConstantUtil.INIT_PASS + salt));
		managerDao.addManager(manager);
		return true;
	}

	/**
	 * 
	 * @Title: resetPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	public boolean resetPass(HttpServletRequest request, Manager manager) {
		Manager origin_manager = managerDao.getManagerById(manager);
		manager.setPassword(MD5Util.getMD5String(ConstantUtil.INIT_PASS + origin_manager.getSalt()));
		managerDao.resetPass(manager);
		return true;
	}

	/**
	 * 
	 * @Title: chgPass
	 * @Description: 重置密码
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 下午4:52:19
	 */
	public boolean chgPass(HttpServletRequest request, Model model) {
		String oldPass = request.getParameter("oldPass");
		String newPass = request.getParameter("newPass");
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		String vaildPass = MD5Util.getMD5String(oldPass + manager.getSalt());
		if(vaildPass.equals(manager.getPassword())){
			manager.setPassword(MD5Util.getMD5String(newPass + manager.getSalt()));
			managerDao.resetPass(manager);
			request.getSession().invalidate();
			return true;
		}
		return false;
	}
}
