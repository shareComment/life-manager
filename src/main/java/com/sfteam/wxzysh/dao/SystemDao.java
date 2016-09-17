/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.SystemInfo;

/**
 * @ClassName: SystemDao.java
 * @Description: 系统参数数据操作接口
 * @author: knight
 * @date: 2016年7月9日 下午8:30:58
 * @company: sfteam
 */
public interface SystemDao {

	/**
	 * @Title: getCarousels
	 * @Description: 获取轮播信息
	 * @author: knight
	 * @date: 2016年7月9日 下午8:28:12
	 */
	public List<SystemInfo> getCarousels();

	/**
	 * @Title: getParams
	 * @Description: 获取系统参数
	 * @author: knight
	 * @date: 2016年7月10日 上午12:30:29
	 */
	public List<SystemInfo> getParams();

	/**
	 * 
	 * @Title: updateParam
	 * @Description: 系统参数更新
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:13:49
	 */
	public void updateParam(SystemInfo param);

	/**
	 * @Title: updateCarousels
	 * @Description: 更新轮播图
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月25日 下午4:52:52
	 */
	public void updateCarousel(SystemInfo param);
}
