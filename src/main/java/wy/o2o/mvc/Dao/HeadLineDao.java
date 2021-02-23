package wy.o2o.mvc.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import wy.o2o.mvc.Entity.HeadLine;

public interface HeadLineDao {
	List<HeadLine> queryHeadLine(@Param("headLineCondition") HeadLine headLineCondition);

	HeadLine queryHeadLineById(long lineId);

	int insertHeadLine(HeadLine headLine);

	int updateHeadLine(HeadLine headLine);

	int deleteHeadLine(long headLineId);

	int batchDeleteHeadLine(List<Long> lineIdList);
	

	/**
	 * 根据传入的Id列表查询头条信息(供超级管理员选定删除头条的时候用，主要是处理图片)
	 * 
	 * @param lineIdList
	 * @return
	 */
	List<HeadLine> queryHeadLineByIds(List<Long> lineIdList);
}
