package wy.o2o.mvc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wy.o2o.mvc.entity.PersonInfo;

public interface PersonInfoDao {
	/**
	 * 根据查询条件分页返回用户信息列表
	 * 
	 * @param personInfoCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<PersonInfo> queryPersonInfoList(@Param("personInfoCondition")PersonInfo personInfoCondition, @Param("rowIndex")int rowIndex, @Param("pageSize")int pageSize);

	int queryPersonInfoCount(@Param("personInfoCondition")PersonInfo personInfoCondition);

	PersonInfo queryPersonInfoById(long userId);

	int insertPersonInfo(PersonInfo personInfo);

	int updatePersonInfo(PersonInfo personInfo);
}
