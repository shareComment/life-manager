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

import com.sfteam.wxzysh.dao.ContentDao;
import com.sfteam.wxzysh.model.Content;
import com.sfteam.wxzysh.model.Feed;
import com.sfteam.wxzysh.model.Manager;
import com.sfteam.wxzysh.model.SysMsg;
import com.sfteam.wxzysh.service.ContentService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: ContentServiceImpl.java
 * @Description: 内容管理服务类
 * @author: knight
 * @date: 2016年6月29日 下午10:45:24
 * @company: sfteam
 */
@Service
public class ContentServiceImpl implements ContentService {

	private static final Logger logger = Logger
			.getLogger(ContentServiceImpl.class);

	@Autowired
	private ContentDao contentDao;

	/**
	 * 
	 * @Title: listFeed
	 * @Description: 用户反馈列表
	 * @author: knight
	 * @date: 2016年6月29日 下午10:45:50
	 */
	public boolean listFeed(HttpServletRequest request, Model model) {
		List<Feed> feedList = contentDao.listFeed();
		model.addAttribute("feed_list", feedList);
		return true;
	}

	/**
	 * @Title: getAboutContent
	 * @Description: 关于我们
	 * @author: knight
	 * @param model
	 * @param request
	 * @date: 2016年7月3日 下午10:00:51
	 */
	public boolean getAboutContent(HttpServletRequest request, Model model) {
		Content content = contentDao.getContent(1);
		model.addAttribute("content", content);
		return true;
	}

	/**
	 * @Title: updateContent
	 * @Description: 更新关于我们、网站公告
	 * @author: knight
	 * @date: 2016年7月3日 下午10:24:11
	 */
	public boolean updateContent(HttpServletRequest request, Model model, Content content) {
		Manager manager = (Manager) request.getSession().getAttribute(ConstantUtil.MANAGER_RESOURCE);
		content.setMngId(manager.getMngId());
		contentDao.updateContent(content);
		return true;
	}

	/**
	 * 
	 * @Title: showNotice
	 * @Description: 网站公告
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean getNoticeContent(HttpServletRequest request, Model model) {
		Content content = contentDao.getContent(0);
		model.addAttribute("content", content);
		return true;
	}

	/**
	 * 
	 * @Title: listMsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean listMsg(HttpServletRequest request, Model model) {
		List<SysMsg> msgList = contentDao.listMsg();
		model.addAttribute("sysmsg_list", msgList);
		return true;
	}

	/**
	 * 
	 * @Title: addSysmsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public boolean addSysmsg(HttpServletRequest request, SysMsg sysMsg) {
		contentDao.addSysmsg(sysMsg);
		return true;
	}

}
