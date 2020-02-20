package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Dimission;
import com.accp.vo.q.DimVo;

public interface DimissionMapper {
    int deleteByPrimaryKey(Integer dimissionid);

    int insert(Dimission record);

    int insertSelective(Dimission record);

    Dimission selectByPrimaryKey(Integer dimissionid);

    int updateByPrimaryKeySelective(Dimission record);

    int updateByPrimaryKey(Dimission record);
    
    List<DimVo> select(@Param("depid") String depid);
}