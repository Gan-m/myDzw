package com.accp.dao;

import com.accp.pojo.Engine;

public interface EngineMapper {
    int deleteByPrimaryKey(Integer engineid);

    int insert(Engine record);

    int insertSelective(Engine record);

    Engine selectByPrimaryKey(Integer engineid);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}