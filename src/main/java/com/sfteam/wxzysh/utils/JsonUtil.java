/**
 * 
 */
package com.sfteam.wxzysh.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

/**
 * @ClassName: JsonUtil.java
 * @Description: json工具
 * @author: knight
 * @date: 2016年6月30日 下午9:45:07
 * @company: sfteam
 */
public class JsonUtil {

	public final static Gson gson = new Gson();

	/**
	 * 
	 * @Title: getModelFromjson
	 * @Description: 配合前端jeditable更新使用
	 * @author: knight
	 * @date: 2016年6月30日 下午10:02:32
	 */
	public final static Object getModelFromjson(HttpServletRequest request,
			Class<?> cls) {
		String value = request.getParameter("value");
		String key = request.getParameter("id");
		String json = "{\"" + key + "\":\"" + value + "\"}";
		return gson.fromJson(json, cls);
	}

	/**
	 * 
	 * @Title: getJsonFromModel
	 * @Description: 把数据模型转化成json
	 * @author: knight
	 * @date: 2016年6月30日 下午10:02:32
	 */
	public final static String getJsonFromModel(Object object) {
		return gson.toJson(object);
	}
}
