package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Cartypes;

public interface CartypesMapper {
    int deleteByPrimaryKey(@Param("ctsid")String ctsid);

    int insert(@Param("type") Cartypes type);

    int insertSelective(Cartypes record);

    List<Cartypes> selectByPrimaryKey(@Param("option") String option);
    
    Cartypes getType(@Param("option") String option);

    int updateByPrimaryKeySelective(Cartypes record);

    int updateByPrimaryKey(@Param("type") Cartypes record);
}