/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.Content;
import com.sfteam.wxzysh.model.Feed;
import com.sfteam.wxzysh.model.SysMsg;

/**
 * @ClassName: ContentDao.java
 * @Description: 内容数据操作类
 * @author: knight
 * @date: 2016年6月29日 下午10:47:49
 * @company: sfteam
 */
public interface ContentDao {

	/**
	 * @Title: listFeed
	 * @Description: 用户反馈列表
	 * @author: knight
	 * @date: 2016年6月29日 下午10:50:21
	 */
	public List<Feed> listFeed();

	/**
	 * @Title: getContent
	 * @Description: 关于我们、网站公告
	 * @author: knight
	 * @date: 2016年7月3日 下午10:03:05
	 */
	public Content getContent(int classId);

	/**
	 * @Title: updateContent
	 * @Description: 更新关于我们、网站公告
	 * @author: knight
	 * @date: 2016年7月3日 下午10:28:02
	 */
	public void updateContent(Content content);

	/**
	 * 
	 * @Title: listMsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public List<SysMsg> listMsg();

	/**
	 * 
	 * @Title: addSysmsg
	 * @Description: 系统消息
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月29日 上午11:25:29
	 */
	public void addSysmsg(SysMsg sysMsg);

}
