/**
 * 
 */
package com.sfteam.wxzysh.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sfteam.wxzysh.dao.TagDao;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.model.Tag;
import com.sfteam.wxzysh.service.TagService;
import com.sfteam.wxzysh.utils.BizUtil;
import com.sfteam.wxzysh.utils.ConstantUtil;
import com.sfteam.wxzysh.utils.JsonUtil;

/**
 * @ClassName: TagServiceImpl.java
 * @Description: 标签管理服务类
 * @author: knight
 * @date: 2016年6月28日 下午12:55:37
 * @company: sfteam
 */
@Service
public class TagServiceImpl implements TagService {

	private static final Logger logger = Logger.getLogger(TagServiceImpl.class);

	@Autowired
	private TagDao tagDao;

	/**
	 * 
	 * @Title: listTag
	 * @Description: 查询标签
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 下午1:06:08
	 */
	public boolean listTag(HttpServletRequest request, Model model) {
		List<Tag> tagList = tagDao.listTag();
		model.addAttribute("tag_list", tagList);
		return true;
	}

	/**
	 * @Title: addTag
	 * @Description: 添加标签
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月28日 下午1:06:08
	 */
	public boolean addTag(HttpServletRequest request, Tag tag) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		tag.setMngId(manager.getMngId());
		tagDao.addTag(tag);
		return true;
	}

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getTags(HttpServletRequest request, Model model) {
		List<String> tagList = tagDao.getTags();
		return BizUtil.getTags(tagList);
	}

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getiTags(HttpServletRequest request, Model model) {
		String cateId = request.getParameter("cateId");
		List<String> tagList = tagDao.getiTags(cateId);
		return BizUtil.getTags(tagList);
	}

	/**
	 * 
	 * @Title: getShowTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getShowTags(HttpServletRequest request, Model model) {
		String cateId = request.getParameter("cateId");
		List<String> tagList = tagDao.getShowTags(cateId);
		return BizUtil.getTags(tagList);
	}

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	public boolean updateTag(HttpServletRequest request, Tag tag) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		tag.setMngId(manager.getMngId());
		tagDao.updateTag(tag);
		return true;
	}

}
