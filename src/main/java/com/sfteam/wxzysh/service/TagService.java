/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Tag;

/**
 * @ClassName: TagService.java
 * @Description: 标签管理服务类
 * @author: knight
 * @date: 2016年6月28日 下午12:54:06
 * @company: sfteam
 */
public interface TagService {

	/**
	 * 
	 * @Title: listTag
	 * @Description: 查询标签
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 下午1:06:08
	 */
	public boolean listTag(HttpServletRequest request, Model model);

	/**
	 * @Title: addTag
	 * @Description: 添加标签
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 下午1:06:08
	 */
	public boolean addTag(HttpServletRequest request, Tag tag);

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getTags(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getiTags(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	public boolean updateTag(HttpServletRequest request, Tag tag);

	/**
	 * 
	 * @Title: getShowTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getShowTags(HttpServletRequest request, Model model);
}
