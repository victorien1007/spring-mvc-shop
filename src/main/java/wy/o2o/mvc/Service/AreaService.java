package wy.o2o.mvc.service;
import java.util.List;

import wy.o2o.mvc.dto.AreaExecution;
import wy.o2o.mvc.entity.Area;

public interface AreaService {
	public static final String AREALISTKEY = "arealist";

	/**
	 * 获取区域列表，优先从缓存获取
	 *
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * 增加区域信息
	 *
	 * @param area
	 * @return
	 */
	AreaExecution addArea(Area area);

	/**
	 * 修改区域信息
	 *
	 * @param area
	 * @return
	 */
	AreaExecution modifyArea(Area area);

}
