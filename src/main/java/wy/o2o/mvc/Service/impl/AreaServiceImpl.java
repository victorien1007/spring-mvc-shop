package wy.o2o.mvc.Service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wy.o2o.mvc.Dao.AreaDao;
import wy.o2o.mvc.Entity.Area;
import wy.o2o.mvc.Service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> getAreaList(){
		return areaDao.queryArea();
	}
}
