package wy.o2o.mvc.Dao;
import java.util.List;

import wy.o2o.mvc.Entity.Area;
public interface AreaDao {
	/*
	 * @return areaList
	 */
	List<Area> queryArea();
	int updateArea(Area area);

	int deleteArea(long areaId);

	int batchDeleteArea(List<Long> areaIdList);
}
