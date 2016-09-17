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
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfteam.wxzysh.model.Comment;
import com.sfteam.wxzysh.service.CommentService;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: CommentController.java
 * @Description: 评论管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午4:55:48
 * @company: sfteam
 */
@Controller
@RequestMapping("/comment")
public class CommentController {

	private static final Logger logger = Logger
			.getLogger(CommentController.class);

	@Autowired
	private CommentService commentService;

	/**
	 * 
	 * @Title: listComment
	 * @Description: 评论列表
	 * @return void
	 * @author knight
	 * @date 2016年 6月25日 下午5:26:29
	 */
	@RequestMapping("")
	public String listComment(HttpServletRequest request, Model model) {
		if (commentService.listComment(request, model)) {
			return "comment/list";
		}
		return "comment/list";
	}

	/**
	 * 
	 * @Title: searchComment
	 * @Description: 评论查询
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:27:44
	 */
	public String searchComment() {
		return "";
	}

	/**
	 * 
	 * @Title: showComment
	 * @Description: 评论详情
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:00
	 */
	@RequestMapping("/reply")
	public String showComment(HttpServletRequest request, Model model) {
		if (commentService.listReply(request, model)) {
			return "comment/reply";
		}
		return "comment/reply";
	}

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String editComment(HttpServletRequest request, Comment comment) {
		if (commentService.updateCommentStatus(request, comment)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: editComment
	 * @Description: 评论编辑
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:29:25
	 */
	@RequestMapping("/updateP")
	@ResponseBody
	public String updateComment(HttpServletRequest request, Comment comment) {
		if (commentService.updatePCommentStatus(request, comment)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}
}
