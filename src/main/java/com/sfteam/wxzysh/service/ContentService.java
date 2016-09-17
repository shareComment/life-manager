/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Content;
import com.sfteam.wxzysh.model.SysMsg;

/**
 * @ClassName: ContentService.java
 * @Description: 内容管理服务类
 * @author: knight
 * @date: 2016年6月29日 下午10:39:58
 * @company: sfteam
 */
public interface ContentService {

	/**
	 * 
	 * @Title: listFeed
	 * @Description: 用户反馈列表
	 * @author: knight
	 * @date: 2016年6月29日 下午10:45:50
	 */
	public boolean listFeed(HttpServletRequest request, Model model);

	/**
	 * @Title: getAboutContent
	 * @Description: 关于我们
	 * @author: knight
	 * @param model 
	 * @param request 
	 * @date: 2016年7月3日 下午10:00:51
	 */
	public boolean getAboutContent(HttpServletRequest request, Model model);

	/**
	 * @Title: updateContent
	 * @Description: 更新关于我们、网站公告
	 * @author: knight
	 * @param content 
	 * @date: 2016年7月3日 下午10:24:11
	 */
	public boolean updateContent(HttpServletRequest request, Model model, Content content);

	/**
	 * 
	 * @Title: showNotice
	 * @Description: 网站公告
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean getNoticeContent(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: listMsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean listMsg(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: addSysmsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean addSysmsg(HttpServletRequest request, SysMsg sysMsg);
}
