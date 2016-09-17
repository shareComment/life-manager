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

import com.sfteam.wxzysh.model.Brand;
import com.sfteam.wxzysh.model.Category;
import com.sfteam.wxzysh.service.BrandService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: BrandController.java
 * @Description: 品牌管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午4:57:30
 * @company: sfteam
 */
@Controller
@RequestMapping("/brand")
public class BrandController {

	private static final Logger logger = Logger.getLogger(BrandController.class);

	@Autowired
	private BrandService brandService;

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	@RequestMapping(value = "/getTags", method = RequestMethod.GET)
	@ResponseBody
	public String getTags(HttpServletRequest request, Model model){
		return brandService.getTags(request,model);
	}

	/**
	 * 
	 * @Title: getAllTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	@RequestMapping(value = "/getAllTags", method = RequestMethod.GET)
	@ResponseBody
	public String getAllTags(HttpServletRequest request, Model model){
		return brandService.getAllTags(request,model);
	}

	/**
	 * 
	 * @Title: listBrand
	 * @Description: 品牌列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping("")
	public String listBrand(HttpServletRequest request, Model model){
		if (brandService.listBrand(request, model)) {
			return "brand/list";
		}
		return "brand/list";
	}

	/**
	 * 
	 * @Title: searchBrand
	 * @Description: 品牌查询
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:22:36
	 */
	public String searchBrand(){
		return "";
	}

	/**
	 * 
	 * @Title: showBrand
	 * @Description: 品牌详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:23:43
	 */
	@RequestMapping(value = "/getBrand", method = RequestMethod.GET)
	@ResponseBody
	public String showBrand(HttpServletRequest request, Brand brand){
		return brandService.getBrand(request, brand);
	}

	/**
	 * 
	 * @Title: editBrand
	 * @Description: 品牌编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:24:41
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String editBrand(HttpServletRequest request, Brand brand){
		if(brandService.updateBrand(request, brand)){
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: addBrand
	 * @Description: 品牌添加
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:24:41
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addBrand(HttpServletRequest request, Brand brand){
		if (brandService.addBrand(request, brand)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
