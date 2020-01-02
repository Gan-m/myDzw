package com.accp.dao;

import com.accp.pojo.Workcars;

public interface WorkcarsMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Workcars record);

    int insertSelective(Workcars record);

    Workcars selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Workcars record);

    int updateByPrimaryKey(Workcars record);
}