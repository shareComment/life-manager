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

import com.sfteam.wxzysh.dao.SystemDao;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.model.SystemInfo;
import com.sfteam.wxzysh.service.SystemService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: SystemServiceImpl.java
 * @Description: 系统参数服务实现类
 * @author: knight
 * @date: 2016年7月9日 下午8:29:06
 * @company: sfteam
 */
@Service
public class SystemServiceImpl implements SystemService {

	private Logger logger = Logger.getLogger(SystemServiceImpl.class);

	@Autowired
	private SystemDao systemDao;

	/**
	 * @Title: getCarousels
	 * @Description: 获取轮播信息
	 * @author: knight
	 * @date: 2016年7月9日 下午8:28:12
	 */
	public boolean getCarousels(HttpServletRequest request, Model model) {
		List<SystemInfo> carousels = systemDao.getCarousels();
		for(SystemInfo carousel : carousels){
			carousel.setParamValue(ConstantUtil.INTERFACE_URL+carousel.getParamValue());
		}
		model.addAttribute("carousel_list", carousels);
		return true;
	}

	/**
	 * @Title: getParams
	 * @Description: 获取参数信息
	 * @author: knight
	 * @date: 2016年7月10日 上午12:29:29
	 */
	public boolean getParams(HttpServletRequest request, Model model) {
		List<SystemInfo> params = systemDao.getParams();
		model.addAttribute("param_list", params);
		return true;
	}

	/**
	 * 
	 * @Title: updateParam
	 * @Description: 系统参数更新
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:13:49
	 */
	public boolean updateParam(HttpServletRequest request, SystemInfo param) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		param.setMngId(manager.getMngId());
		systemDao.updateParam(param);
		return true;
	}

	/**
	 * @Title: updateCarousels
	 * @Description: 更新轮播图
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月25日 下午4:52:52
	 */
	public boolean updateCarousels(HttpServletRequest request, SystemInfo param) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		param.setMngId(manager.getMngId());
		systemDao.updateCarousel(param);
		return true;
	}

}
