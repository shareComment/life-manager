/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.Comment;

/**
 * @ClassName: CommentDao.java
 * @Description: 评论数据处理接口
 * @author: knight
 * @date: 2016年7月10日 下午8:51:38
 * @company: sfteam
 */
public interface CommentDao {

	/**
	 * 
	 * @Title: listComment
	 * @Description: 评论列表
	 * @return void
	 * @author knight
	 * @date 2016年 6月25日 下午5:26:29
	 */
	public List<Comment> listComment();

	/**
	 * 
	 * @Title: showComment
	 * @Description: 评论详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:00
	 */
	public List<Comment> listReply(String commentId);

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	public void updateCommentStatus(Comment comment);

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	public void updatePCommentStatus(Comment comment);

}
