/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.SystemInfo;

/**
 * @ClassName: SystemService.java
 * @Description: 系统参数服务接口
 * @author: knight
 * @date: 2016年7月9日 下午8:27:13
 * @company: sfteam
 */
public interface SystemService {

	/**
	 * @Title: getCarousels
	 * @Description: 获取轮播信息
	 * @author: knight
	 * @param model 
	 * @param request 
	 * @date: 2016年7月9日 下午8:28:12
	 */
	public boolean getCarousels(HttpServletRequest request, Model model);

	/**
	 * @Title: getParams
	 * @Description: 获取参数信息
	 * @author: knight
	 * @date: 2016年7月10日 上午12:29:29
	 */
	public boolean getParams(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: updateParam
	 * @Description: 系统参数更新
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:13:49
	 */
	public boolean updateParam(HttpServletRequest request, SystemInfo param);

	/**
	 * @Title: updateCarousels
	 * @Description: 更新轮播图
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月25日 下午4:52:52
	 */
	public boolean updateCarousels(HttpServletRequest request, SystemInfo param);

}
