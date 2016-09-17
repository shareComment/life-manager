/**
 * 
 */
package com.sfteam.wxzysh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfteam.wxzysh.model.Category;
import com.sfteam.wxzysh.service.CategoryService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: CategoryController.java
 * @Description: 分类管理控制器
 * @author knight
 * @date 2016年6月25日 下午5:20:44
 * @company sfteam
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

	private static final Logger logger = Logger
			.getLogger(CategoryController.class);

	@Autowired
	private CategoryService categoryService;

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping("")
	public String listCategory(HttpServletRequest request, Model model) {
		if (categoryService.listCategory(request, model)) {
			return "category/list";
		}
		return "category/list";
	}

	/**
	 * 
	 * @Title: searchBrand
	 * @Description: 分类查询
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:22:36
	 */
	public String searchCategory() {
		return "";
	}

	/**
	 * 
	 * @Title: showCategory
	 * @Description: 分类详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:23:43
	 */
	public String showCategory() {
		return "";
	}

	/**
	 * 
	 * @Title: editCategory
	 * @Description: 分类编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:24:41
	 */
	public String editCategory() {
		return "";
	}

	/**
	 * 
	 * @Title: addCategory
	 * @Description: 分类添加
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:24:41
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addCategory(HttpServletRequest request, Category category) {
		if (categoryService.addCategory(request, category)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: saveCategory
	 * @Description: 分类保存
	 * @author: knight
	 * @date: 2016年6月28日 下午9:08:58
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateCategory(HttpServletRequest request, Category category) {
		if(categoryService.updateCategory(request, category)){
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: getCatePid
	 * @Description: 获取一类ID
	 * @author: knight
	 * @date: 2016年6月28日 下午9:08:58
	 */
	@RequestMapping(value = "/getCatePid", method = RequestMethod.GET)
	@ResponseBody
	public String getCatePid(HttpServletRequest request, Model model){
		return categoryService.getCatePid(request, model);
	}

	/**
	 * 
	 * @Title: getCate
	 * @Description: 获取分类信息
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月5日 下午4:53:01
	 */
	@RequestMapping(value = "/getCate", method = RequestMethod.GET)
	@ResponseBody
	public String getCate(HttpServletRequest request, Category category){
		return categoryService.getCate(request, category);
	}

	/**
	 * 
	 * @Title: getCateId
	 * @Description: 获取二类ID
	 * @author: knight
	 * @date: 2016年6月28日 下午9:08:58
	 */
	@RequestMapping(value = "/getCateId", method = RequestMethod.GET)
	@ResponseBody
	public String getCateId(HttpServletRequest request, Model model){
		return categoryService.getCateId(request, model);
	}
}