package com.jshop.service;

import java.util.List;

import com.jshop.entity.ProductSpecificationsT;

public interface ProductSpecificationsTService {

	
	/**
	 *增加商品规格
	 * @param pst
	 */
	public  void addProductSpecification(ProductSpecificationsT pst);

	/**
	 * 更新商品规格
	 * @param pst
	 */
	public  int updateProductSpecification(ProductSpecificationsT pst);

	/**
	 * 更具规格id获取规格值
	 * @param specificationsid
	 * @return
	 */
	public  ProductSpecificationsT findProductSpecificationsTByspecificationsid(String specificationsid);
	/**
	 * 查询所有商品规格
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public  List<ProductSpecificationsT>findAllProductSpecificationsT(final int currentPage,final int lineSize);
	/**
	 * 统计查询所有商品规格
	 * @return
	 */
	public  int countfindAllProductSpecificationsT();
	/**
	 * 删除商品规格
	 * @param list
	 * @return
	 */
	public  int delProductSpecification(String []list);

	/**
	 * 根据状态获取规格值
	 * @param state
	 * @return
	 */
	public List<ProductSpecificationsT> findAllProductSpecificationsT(String state);

	/**
	 * 根据排序方式进行排序
	 * @param currentPage
	 * @param lineSize
	 * @param queryString
	 * @return
	 */
	public  List<ProductSpecificationsT>sortAllProductSpecificationsT(final int currentPage,final int lineSize,String queryString);
	
	
	
	
	
	
}