package wy.o2o.mvc.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import wy.o2o.mvc.Base.BaseTest;
import wy.o2o.mvc.entity.Area;

public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea(){
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2, areaList.size());
	}
}
