package wy.o2o.mvc.service;

import wy.o2o.mvc.dto.ImageHolder;

import wy.o2o.mvc.dto.ShopExecution;
import wy.o2o.mvc.entity.Shop;
import wy.o2o.mvc.exceptions.ShopOperationException;

public interface ShopService {
	
	Shop getByShopId(long shopId);
	
	ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
	
	ShopExecution addShop(Shop shop,ImageHolder thumbnail) throws ShopOperationException;
	
	/**
	 * 根据shopCondition分页返回相应店铺列表
	 * 
	 * @param shopCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

}
