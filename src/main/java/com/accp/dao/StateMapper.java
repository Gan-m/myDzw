package com.accp.dao;

import com.accp.pojo.State;

public interface StateMapper {
    int deleteByPrimaryKey(Integer stateid);

    int insert(State record);

    int insertSelective(State record);

    State selectByPrimaryKey(Integer stateid);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}