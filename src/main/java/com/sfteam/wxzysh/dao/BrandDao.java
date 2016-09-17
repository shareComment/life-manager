/**
 * 
 */
package com.sfteam.wxzysh.dao;

import java.util.List;

import com.sfteam.wxzysh.model.Brand;

/**
 * @ClassName: BrandDao.java
 * @Description: 品牌数据操作类
 * @author: knight
 * @date: 2016年6月29日 下午9:15:14
 * @company: sfteam
 */
public interface BrandDao {

	/**
	 * 
	 * @Title: listBrand
	 * @Description: 查询品牌
	 * @return: List<Brand>
	 * @author: knight
	 * @date: 2016年6月27日 下午8:06:08
	 */
	public List<Brand> listBrand();

	/**
	 * @Title: addBrand
	 * @Description: 添加品牌
	 * @author: knight
	 * @date: 2016年7月8日 下午11:34:07
	 */
	public String addBrand(Brand brand);

	/**
	 * @Title: updateBrand
	 * @Description: 更新品牌
	 * @author: knight
	 * @date: 2016年7月8日 下午11:34:10
	 */
	public void updateBrand(Brand brand);

	/**
	 * @Title: getBrand
	 * @Description: 获取品牌信息
	 * @author: knight
	 * @date: 2016年7月9日 上午12:08:07
	 */
	public Brand getBrand(Brand brand);

	/**
	 * @Title: getTags
	 * @Description: 取标签
	 * @return: List<String>
	 * @author: knight
	 * @date: 2016年7月30日 上午9:10:38
	 */
	public List<String> getTags(String brandId);

	/**
	 * @Title: getAllTags
	 * @Description: 取标签
	 * @return: List<String>
	 * @author: knight
	 * @date: 2016年7月30日 上午9:39:00
	 */
	public List<String> getAllTags(String cateId);
}
