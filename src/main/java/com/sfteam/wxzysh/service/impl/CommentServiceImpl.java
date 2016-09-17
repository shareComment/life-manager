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

import com.sfteam.wxzysh.dao.CommentDao;
import com.sfteam.wxzysh.model.Comment;
import com.sfteam.wxzysh.service.CommentService;

/**
 * @ClassName: CommentServiceImpl.java
 * @Description: 评论处理业务实现类
 * @author: knight
 * @date: 2016年7月10日 下午8:49:42
 * @company: sfteam
 */
@Service
public class CommentServiceImpl implements CommentService {

	private static final Logger logger = Logger.getLogger(CommentServiceImpl.class);

	@Autowired
	private CommentDao commentDao;

	/**
	 * 
	 * @Title: listComment
	 * @Description: 评论列表
	 * @return void
	 * @author knight
	 * @date 2016年 6月25日 下午5:26:29
	 */
	public boolean listComment(HttpServletRequest request, Model model) {
		List<Comment> commentList = commentDao.listComment();
		model.addAttribute("comment_list", commentList);
		return true;
	}

	/**
	 * 
	 * @Title: showComment
	 * @Description: 评论详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:00
	 */
	public boolean listReply(HttpServletRequest request, Model model) {
		String commentId = request.getParameter("commentId");
		List<Comment> replyList = commentDao.listReply(commentId);
		model.addAttribute("reply_list", replyList);
		return true;
	}

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	public boolean updateCommentStatus(HttpServletRequest request,
			Comment comment) {
		commentDao.updateCommentStatus(comment);
		return true;
	}

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	public boolean updatePCommentStatus(HttpServletRequest request,
			Comment comment) {
		commentDao.updatePCommentStatus(comment);
		return true;
	}

}
