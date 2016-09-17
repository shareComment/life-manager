/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;
import java.util.Map;

import com.sfteam.wxzysh.model.Category;

/**
 * @ClassName: CategoryDao.java
 * @Description: 分类数据操作类
 * @author: knight
 * @date: 2016年6月27日 下午7:47:46
 * @company: sfteam
 */
public interface CategoryDao {

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 查询分类
	 * @return: List<Category>
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public List<Category> listCategory();

	/**
	 * @Title: updateCategory
	 * @Description: 分类保存
	 * @author: knight
	 * @date: 2016年6月28日 下午9:37:31
	 */
	public void updateCategory(Category category);

	/**
	 * @Title: getCategoryById
	 * @Description: 根据ID取分类信息
	 * @author: knight
	 * @return Category
	 * @date: 2016年6月30日 下午9:31:57
	 */
	public Category getCategoryById(String id);

	/**
	 * @Title: addCategory
	 * @Description: 分类添加
	 * @author: knight
	 * @date: 2016年7月2日 下午10:51:00
	 */
	public void addCategory(Category category);

	/**
	 * @Title: getCatePid
	 * @Description: 取一级分类
	 * @author: knight
	 * @date: 2016年7月3日 下午12:28:50
	 */
	public List<Map<Object, Object>> getCatePid();

	/**
	 * @Title: getCategory
	 * @Description: 获取分类信息
	 * @return: Category
	 * @author: knight
	 * @date: 2016年7月5日 下午4:55:47
	 */
	public Category getCategory(Category category);

	/**
	 * @Title: getCateId
	 * @Description: 取二级分类
	 * @return: List<Map<Object,Object>>
	 * @author: knight
	 * @date: 2016年7月6日 下午12:34:26
	 */
	public List<Map<Object, Object>> getCateId();
}
