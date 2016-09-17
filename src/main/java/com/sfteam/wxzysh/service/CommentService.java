/**
 * 
 */
package com.sfteam.wxzysh.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.sfteam.wxzysh.model.Comment;

/**
 * @ClassName: CommentService.java
 * @Description: 评论处理业务接口
 * @author: knight
 * @date: 2016年6月24日 下午8:47:17
 * @company: sfteam
 */
public interface CommentService {

	/**
	 * 
	 * @Title: listComment
	 * @Description: 评论列表
	 * @return void
	 * @author knight
	 * @date 2016年 6月25日 下午5:26:29
	 */
	boolean listComment(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: showComment
	 * @Description: 评论详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:00
	 */
	boolean listReply(HttpServletRequest request, Model model);

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	boolean updateCommentStatus(HttpServletRequest request, Comment comment);

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	boolean updatePCommentStatus(HttpServletRequest request, Comment comment);

}
