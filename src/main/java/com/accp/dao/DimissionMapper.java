package com.accp.dao;

import com.accp.pojo.Dimission;

public interface DimissionMapper {
    int deleteByPrimaryKey(Integer dimissionid);

    int insert(Dimission record);

    int insertSelective(Dimission record);

    Dimission selectByPrimaryKey(Integer dimissionid);

    int updateByPrimaryKeySelective(Dimission record);

    int updateByPrimaryKey(Dimission record);
}