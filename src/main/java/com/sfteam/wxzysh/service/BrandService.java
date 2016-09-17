/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Brand;

/**
 * @ClassName: BrandService.java
 * @Description: 品牌管理服务类
 * @author: knight
 * @date: 2016年6月29日 下午9:10:59
 * @company: sfteam
 */
public interface BrandService {

	/**
	 * 
	 * @Title: listBrand
	 * @Description: 查询品牌
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listBrand(HttpServletRequest request, Model model);

	/**
	 * @Title: addBrand
	 * @Description: 品牌添加
	 * @author: knight
	 * @date: 2016年7月8日 下午11:26:42
	 */
	public boolean addBrand(HttpServletRequest request, Brand brand);

	/**
	 * @Title: updateBrand
	 * @Description: 品牌编辑
	 * @author: knight
	 * @date: 2016年7月8日 下午11:27:32
	 */
	public boolean updateBrand(HttpServletRequest request, Brand brand);

	/**
	 * @Title: getBrand
	 * @Description: 品牌信息
	 * @author: knight
	 * @date: 2016年7月9日 上午12:06:44
	 */
	public String getBrand(HttpServletRequest request, Brand brand);

	/**
	 * @Title: getTags
	 * @Description: 取标签
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月30日 上午9:34:25
	 */
	public String getAllTags(HttpServletRequest request, Model model);

	/**
	 * @Title: getTags
	 * @Description: 取标签
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月30日 上午9:40:15
	 */
	public String getTags(HttpServletRequest request, Model model);
}
