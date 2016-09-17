/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;
import java.util.Map;

import com.sfteam.wxzysh.model.Tag;

/**
 * @ClassName: TagDao.java
 * @Description: 标签数据操作类
 * @author: knight
 * @date: 2016年6月28日 下午4:08:28
 * @company: sfteam
 */
public interface TagDao {

	/**
	 * @Title: listTag
	 * @Description: 查询标签
	 * @return: List<Tag>
	 * @author: knight
	 * @date: 2016年6月28日 下午4:09:46
	 */
	public List<Tag> listTag();

	/**
	 * @Title: addTag
	 * @Description: 添加标签
	 * @return: void
	 * @author: knight
	 * @date: 2016年6月28日 下午1:06:08
	 */
	public void addTag(Tag tag);

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @return 
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public List<String> getTags();

	/**
	 * 
	 * @Title: getTags
	 * @Description: 取标签
	 * @author: knight
	 * @return 
	 * @date: 2016年7月10日 上午10:23:10
	 */
	public List<String> getiTags(String cateId);

	/**
	 * @Title: getTagIds
	 * @Description: 取标签ID
	 * @author: knight
	 * @date: 2016年7月10日 下午4:23:55
	 */
	public List<String> getTagIds(List<String> tags);

	/**
	 * 
	 * @Title: listCategory
	 * @Description: 分类列表
	 * @return String
	 * @author knight
	 * @date 2016年6月25日 下午5:21:44
	 */
	public void updateTag(Tag tag);

	/**
	 * @Title: deleteTags
	 * @Description: 删除关系
	 * @author: knight
	 * @date: 2016年6月25日 下午5:21:44
	 */
	public void deleteTags(String cateId);

	/**
	 * @Title: addTagCate
	 * @Description: 添加关系
	 * @author: knight
	 * @date: 2016年6月25日 下午5:21:44
	 */
	public void addTagCate(Tag tag);

	/**
	 * @Title: getShowTags
	 * @Description: 取标签
	 * @return: List<String>
	 * @author: knight
	 * @date: 2016年6月30日 上午8:54:23
	 */
	public List<String> getShowTags(String cateId);

	/**
	 * @Title: addTagBrand
	 * @Description: 添加关系
	 * @return: void
	 * @author: knight
	 * @date: 2016年7月30日 上午9:59:14
	 */
	public void addTagBrand(Tag tag);

}
