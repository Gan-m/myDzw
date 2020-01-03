package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Engine;

public interface EngineMapper {
    int deleteByPrimaryKey(@Param("engineid") String engineid);

    int insert(@Param("engineName")String engineName);

    int insertSelective(Engine record);

    List<Engine> selectByPrimaryKey(@Param("engineName") String engineName);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}