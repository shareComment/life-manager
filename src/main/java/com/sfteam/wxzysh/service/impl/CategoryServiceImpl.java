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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.sfteam.wxzysh.dao.CategoryDao;
import com.sfteam.wxzysh.dao.TagDao;
import com.sfteam.wxzysh.model.Category;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.model.Tag;
import com.sfteam.wxzysh.service.CategoryService;
import com.sfteam.wxzysh.utils.BizUtil;
import com.sfteam.wxzysh.utils.ConstantUtil;
import com.sfteam.wxzysh.utils.JsonUtil;

/**
 * @ClassName: CategoryServiceImpl.java
 * @Description: 分类管理服务类
 * @author: knight
 * @date: 2016年6月28日 下午8:09:36
 * @company: sfteam
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	private static final Logger logger = Logger
			.getLogger(CategoryServiceImpl.class);

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private TagDao tagDao;

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 查询分类
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listCategory(HttpServletRequest request, Model model) {
		List<Category> categoryList = categoryDao.listCategory();
		model.addAttribute("category_list", categoryList);
		// 取所包含标签
		for(Category category : categoryList){
			List<String> iTags = tagDao.getiTags(category.getCateId());
			category.setContainTag(iTags);
			List<String> showTags = tagDao.getShowTags(category.getCateId());
			category.setShowTag(showTags);
		}
		return true;
	}

	/**
	 * @Title: updateCategory
	 * @Description: 保存分类
	 * @author: knight
	 * @date: 2016年6月28日 下午9:33:38
	 */
	@Transactional
	public boolean updateCategory(HttpServletRequest request, Category category) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		category.setMngId(manager.getMngId());
		categoryDao.updateCategory(category);// 更新分类信息表
		List<String> tags = BizUtil.getTags(request.getParameter("tagName"));// 包含标签
		List<String> tags1 = BizUtil.getTags(request.getParameter("tagName1"));// 导航显示标签
		tagDao.deleteTags(category.getCateId());// 删除关联关系，重新添加关系
		List<String> result = BizUtil.duplicate(tags, tags1);
		List<String> tagIds = tagDao.getTagIds(result);
		for(String id : tagIds){
			Tag tag = new Tag();
			tag.setMngId(manager.getMngId());
			tag.setCateId(category.getCateId());
			tag.setTagId(id);
			tag.setVisable("1");
			tagDao.addTagCate(tag);
		}
		List<String> tagIds1 = tagDao.getTagIds(tags1);
		for(String id : tagIds1){
			Tag tag = new Tag();
			tag.setMngId(manager.getMngId());
			tag.setCateId(category.getCateId());
			tag.setTagId(id);
			tag.setVisable("0");
			tagDao.addTagCate(tag);
		}
		return true;
	}

	/**
	 * @Title: addCategory
	 * @Description: 分类添加
	 * @author: knight
	 * @date: 2016年7月2日 下午10:48:50
	 */
	public boolean addCategory(HttpServletRequest request, Category category) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		category.setMngId(manager.getMngId());
		categoryDao.addCategory(category);
		return true;
	}

	/**
	 * 
	 * @Title: getCatePid
	 * @Description: 取一级分类
	 * @author: knight
	 * @date: 2016年7月3日 下午12:24:53
	 */
	public String getCatePid(HttpServletRequest request, Model model) {
		List<Map<Object, Object>> supCateList = categoryDao.getCatePid();
		return JsonUtil.getJsonFromModel(supCateList);
	}

	/**
	 * @Title: getCate
	 * @Description: 获取分类信息
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月5日 下午4:53:30
	 */
	public String getCate(HttpServletRequest request, Category category) {
		Category categoryInfo = categoryDao.getCategory(category);
		// 取所有标签
		
		return JsonUtil.getJsonFromModel(categoryInfo);
	}

	/**
	 * 
	 * @Title: getCateId
	 * @Description: 取二级分类
	 * @author: knight
	 * @date: 2016年7月3日 下午12:24:53
	 */
	public String getCateId(HttpServletRequest request, Model model) {
		List<Map<Object, Object>> subCateList = categoryDao.getCateId();
		return JsonUtil.getJsonFromModel(subCateList);
	}

}
