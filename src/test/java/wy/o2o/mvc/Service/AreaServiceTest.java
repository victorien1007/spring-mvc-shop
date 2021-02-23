package wy.o2o.mvc.Service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import wy.o2o.mvc.Base.BaseTest;
import wy.o2o.mvc.Entity.Area;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;

	//--------------------------------------
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("北京", areaList.get(0).getAreaName());
		areaList = areaService.getAreaList();
	}
}
