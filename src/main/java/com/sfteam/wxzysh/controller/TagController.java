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

import com.sfteam.wxzysh.model.Tag;
import com.sfteam.wxzysh.service.TagService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: TagController.java
 * @Description: 标签管理控制器
 * @author: knight
 * @date: 2016年6月28日 下午12:50:57
 * @company: sfteam
 */
@Controller
@RequestMapping("/tag")
public class TagController {

	private static final Logger logger = Logger.getLogger(TagController.class);

	@Autowired
	private TagService tagService;

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping("")
	public String listTag(HttpServletRequest request, Model model) {
		if (tagService.listTag(request, model)) {
			return "tag/list";
		}
		return "tag/list";
	}

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addTag(HttpServletRequest request, Tag tag) {
		if (tagService.addTag(request, tag)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateTag(HttpServletRequest request, Tag tag) {
		if (tagService.updateTag(request, tag)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

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
		return tagService.getTags(request,model);
	}

	/**
	 * 
	 * @Title: getiTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	@RequestMapping(value = "/getiTags", method = RequestMethod.GET)
	@ResponseBody
	public String getiTags(HttpServletRequest request, Model model){
		return tagService.getiTags(request,model);
	}

	/**
	 * 
	 * @Title: getShowTags
	 * @Description: 取标签
	 * @author: knight
	 * @date: 2016年7月10日 上午10:23:10
	 */
	@RequestMapping(value = "/getShowTags", method = RequestMethod.GET)
	@ResponseBody
	public String getShowTags(HttpServletRequest request, Model model){
		return tagService.getShowTags(request,model);
	}
}
