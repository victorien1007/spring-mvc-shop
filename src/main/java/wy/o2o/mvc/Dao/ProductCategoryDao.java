package wy.o2o.mvc.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wy.o2o.mvc.Entity.ProductCategory;

public interface ProductCategoryDao {
	/**
	 * 通过shop id 查询店铺商品类别
	 * 
	 * @param long
	 *            shopId
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> queryProductCategoryList(long shopId);

	/**
	 * 批量新增商品类别
	 * 
	 * @param productCategoryList
	 * @return
	 */
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);

	/**
	 * 删除指定商品类别
	 * 
	 * @param productCategoryId
	 * @param shopId
	 * @return effectedNum
	 */
	int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);

}