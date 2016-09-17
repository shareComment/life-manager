/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Category;

/**
 * @ClassName: CategoryService.java
 * @Description: 分类管理服务类
 * @author: knight
 * @date: 2016年6月28日 下午8:04:38
 * @company: sfteam
 */
public interface CategoryService {

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 查询分类
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listCategory(HttpServletRequest request, Model model);

	/**
	 * @Title: updateCategory
	 * @Description: 保存分类
	 * @author: knight
	 * @date: 2016年6月28日 下午9:33:38
	 */
	public boolean updateCategory(HttpServletRequest request, Category category);

	/**
	 * @Title: addCategory
	 * @Description: 分类添加
	 * @author: knight
	 * @date: 2016年7月2日 下午10:48:50
	 */
	public boolean addCategory(HttpServletRequest request, Category category);

	/**
	 * 
	 * @Title: getCatePid
	 * @Description: 取一级分类
	 * @author: knight
	 * @date: 2016年7月3日 下午12:24:53
	 */
	public String getCatePid(HttpServletRequest request, Model model);

	/**
	 * @Title: getCate
	 * @Description: 获取分类信息
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月5日 下午4:53:30
	 */
	public String getCate(HttpServletRequest request, Category category);

	/**
	 * @Title: getCateId
	 * @Description: 取二级分类
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月6日 下午12:33:15
	 */
	public String getCateId(HttpServletRequest request, Model model);
}
