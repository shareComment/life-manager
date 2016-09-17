/**
 * 
 */
package com.sfteam.wxzysh.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sfteam.wxzysh.model.SystemInfo;
import com.sfteam.wxzysh.service.SystemService;
import com.sfteam.wxzysh.utils.BizUtil;
import com.sfteam.wxzysh.utils.ConstantUtil;

/**
 * @ClassName: SystemController.java
 * @Description: 系统管理控制器
 * @author: knight
 * @date: 2016年6月25日 下午4:59:39
 * @company: sfteam
 */
@Controller
@RequestMapping("/sysset")
public class SystemController {

	private static final Logger logger = Logger
			.getLogger(SystemController.class);

	@Autowired
	private SystemService systemService;

	/**
	 * 
	 * @Title: updateCarousel
	 * @Description: 更新轮播
	 * @return: String
	 * @author: knight
	 * @date: 2016年6月25日 下午4:49:32
	 */
	@RequestMapping(value="/updateCarousel",method = RequestMethod.POST)
	@ResponseBody
	public String updateCarousel(HttpServletRequest request,
			HttpServletResponse response, @RequestParam MultipartFile file)
			throws Exception {

		if (file.isEmpty()) {
			return "";
		}
		String paramId = request.getParameter("id");
		String uploadPath = request.getRealPath("/") + "/tmp";
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}
		String filename = BizUtil.getUUID() + ".jpg";
		String filePath = uploadPath + "/" + filename;
		File uploadFile = new File(filePath);
		file.transferTo(uploadFile);
		List<String> list = new ArrayList<String>();
		list.add(filePath);
		String result = BizUtil.upload(ConstantUtil.INTERFACE_URL+"/syscontro/upload/1.do", list);
		SystemInfo param = new SystemInfo();
		param.setParamId(paramId);
		param.setParamValue(result);
		if (systemService.updateCarousels(request, param)) {
			return result;
		}else{
			return ConstantUtil.FAILURE;
		}
	}

	/**
	 * 
	 * @Title: carousel
	 * @Description: 首页轮播控制
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:09:40
	 */
	@RequestMapping("/carousel")
	public String carousel(HttpServletRequest request, Model model) {
		if (systemService.getCarousels(request, model)) {
			return "/sysset/carousel";
		}
		return "/sysset/carousel";
	}

	/**
	 * 
	 * @Title: setting
	 * @Description: 系统参数
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:13:49
	 */
	@RequestMapping("/param")
	public String setting(HttpServletRequest request, Model model) {
		if (systemService.getParams(request, model)) {
			return "/sysset/param";
		}
		return "/sysset/param";
	}

	/**
	 * 
	 * @Title: updateParam
	 * @Description: 系统参数更新
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:13:49
	 */
	@RequestMapping("/param/update")
	@ResponseBody
	public String updateParam(HttpServletRequest request, SystemInfo param) {
		if (systemService.updateParam(request, param)) {
			return ConstantUtil.SUCCESS;
		}
		return ConstantUtil.FAILURE;
	}

	/**
	 * 
	 * @Title: logging
	 * @Description: 日志
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:16:09
	 */
	@RequestMapping("/log")
	public String logging() {
		return "/sysset/log";
	}

	/**
	 * 
	 * @Title: bakRecv
	 * @Description: 备份
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:16:55
	 */
	@RequestMapping("/backup")
	public String bakRecv() {
		return "/sysset/backup";
	}
}
