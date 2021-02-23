package wy.o2o.mvc.Service;

import java.io.File;
import java.io.InputStream;

import wy.o2o.mvc.Dto.ImageHolder;

import wy.o2o.mvc.Dto.ShopExecution;
import wy.o2o.mvc.Entity.Shop;
import wy.o2o.mvc.Exceptions.ShopOperationException;

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
