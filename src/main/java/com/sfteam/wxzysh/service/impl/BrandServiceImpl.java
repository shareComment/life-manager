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

import com.sfteam.wxzysh.dao.BrandDao;
import com.sfteam.wxzysh.dao.TagDao;
import com.sfteam.wxzysh.model.Brand;
import com.sfteam.wxzysh.model.Category;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.model.Tag;
import com.sfteam.wxzysh.service.BrandService;
import com.sfteam.wxzysh.utils.BizUtil;
import com.sfteam.wxzysh.utils.ConstantUtil;
import com.sfteam.wxzysh.utils.JsonUtil;

/**
 * @ClassName: BrandServiceImpl.java
 * @Description: 品牌管理服务类
 * @author: knight
 * @date: 2016年6月29日 下午9:12:37
 * @company: sfteam
 */
@Service
public class BrandServiceImpl implements BrandService {

	private static final Logger logger = Logger.getLogger(BrandServiceImpl.class);

	@Autowired
	private BrandDao brandDao;

	@Autowired
	private TagDao tagDao;

	/**
	 * 
	 * @Title: listBrand
	 * @Description: 查询分类
	 * @return: boolean
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public boolean listBrand(HttpServletRequest request, Model model) {
		List<Brand> brandList = brandDao.listBrand();
		model.addAttribute("brand_list", brandList);
		// 取所包含标签
		for(Brand brand : brandList){
			List<String> tags = brandDao.getTags(brand.getBrandId());
			brand.setTags(tags);
		}
		return true;
	}

	/**
	 * @Title: addBrand
	 * @Description: 品牌添加
	 * @author: knight
	 * @date: 2016年7月8日 下午11:26:42
	 */
	public boolean addBrand(HttpServletRequest request, Brand brand) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		brand.setMngId(manager.getMngId());
		String brand_id = brandDao.addBrand(brand);
		List<String> tags = BizUtil.getTags(request.getParameter("tagName"));
		List<String> tagIds = tagDao.getTagIds(tags);
		for(String id : tagIds){
			Tag tag = new Tag();
			tag.setMngId(manager.getMngId());
			tag.setBrandId(brand_id);
			tag.setTagId(id);
			tagDao.addTagBrand(tag);
		}
		return true;
	}

	/**
	 * @Title: updateBrand
	 * @Description: 品牌编辑
	 * @author: knight
	 * @date: 2016年7月8日 下午11:27:32
	 */
	public boolean updateBrand(HttpServletRequest request, Brand brand) {
		Manager manager = (Manager) request.getSession().getAttribute(
				ConstantUtil.MANAGER_RESOURCE);
		brand.setMngId(manager.getMngId());
		brandDao.updateBrand(brand);
		List<String> tags = BizUtil.getTags(request.getParameter("tagName"));
		List<String> tagIds = tagDao.getTagIds(tags);
		for(String id : tagIds){
			Tag tag = new Tag();
			tag.setMngId(manager.getMngId());
			tag.setBrandId(brand.getBrandId());
			tag.setTagId(id);
			tagDao.addTagBrand(tag);
		}
		return true;
	}

	/**
	 * @Title: getBrand
	 * @Description: 品牌信息
	 * @author: knight
	 * @date: 2016年7月9日 上午12:06:44
	 */
	public String getBrand(HttpServletRequest request, Brand brand) {
		Brand brandInfo = brandDao.getBrand(brand);
		return JsonUtil.getJsonFromModel(brandInfo);
	}

	/**
	 * 
	 * @Title: getAllTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getAllTags(HttpServletRequest request, Model model) {
		String cateId = request.getParameter("cateId");
		List<String> tagList = brandDao.getAllTags(cateId);
		return BizUtil.getTags(tagList);
	}

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public String getTags(HttpServletRequest request, Model model) {
		String brandId = request.getParameter("brandId");
		List<String> tags = brandDao.getTags(brandId);
		return BizUtil.getTags(tags);
	}

}
