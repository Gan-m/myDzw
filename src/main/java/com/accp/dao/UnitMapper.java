package com.accp.dao;

import com.accp.pojo.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer unitid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer unitid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}