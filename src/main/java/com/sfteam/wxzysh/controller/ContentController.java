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

import com.sfteam.wxzysh.model.Content;
import com.sfteam.wxzysh.model.SysMsg;
import com.sfteam.wxzysh.service.ContentService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: ContentController.java
 * @Description: 内容管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午4:58:45
 * @company: sfteam
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	private static final Logger logger = Logger.getLogger(ContentController.class);

	@Autowired
	private ContentService contentService;

	/**
	 * 
	 * @Title: showAbout
	 * @Description: 关于我们
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	@RequestMapping("/about")
	public String showAbout(HttpServletRequest request, Model model){
		if(contentService.getAboutContent(request, model)){
			return "content/about";
		}
		return "content/about";
	}

	/**
	 * 
	 * @Title: updateContent
	 * @Description: 更新关于我们、网站公告
	 * @author: knight
	 * @date: 2016年7月3日 下午10:21:11
	 */
	@RequestMapping("/about/update")
	public String updateAbout(HttpServletRequest request, Model model, Content content){
		if(contentService.updateContent(request, model, content)){
			return "content/about";
		}
		return "content/about";
	}

	/**
	 * 
	 * @Title: updateContent
	 * @Description: 更新关于我们、网站公告
	 * @author: knight
	 * @date: 2016年7月3日 下午10:21:11
	 */
	@RequestMapping("/notice/update")
	public String updateNotice(HttpServletRequest request, Model model, Content content){
		if(contentService.updateContent(request, model, content)){
			return "content/notice";
		}
		return "content/notice";
	}

	/**
	 * 
	 * @Title: showNotice
	 * @Description: 网站公告
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	@RequestMapping("/notice")
	public String showNotice(HttpServletRequest request, Model model){
		if(contentService.getNoticeContent(request, model)){
			return "content/notice";
		}
		return "content/notice";
	}

	/**
	 * 
	 * @Title: showFeed
	 * @Description: 用户反馈
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	@RequestMapping("/feed")
	public String showFeed(HttpServletRequest request, Model model){
		if (contentService.listFeed(request, model)) {
			return "content/feed";
		}
		return "content/feed";
	}

	/**
	 * 
	 * @Title: sysmsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	@RequestMapping("/sysmsg")
	public String sysmsg(HttpServletRequest request, Model model){
		if (contentService.listMsg(request, model)) {
			return "content/sysmsg";
		}
		return "content/sysmsg";
	}

	/**
	 * 
	 * @Title: addSysmsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	@RequestMapping(value = "/sysmsg/add", method = RequestMethod.POST)
	@ResponseBody
	public String addSysmsg(HttpServletRequest request, SysMsg sysMsg){
		if (contentService.addSysmsg(request, sysMsg)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
