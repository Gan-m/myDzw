package com.accp.dao;

import com.accp.pojo.Cartypes;

public interface CartypesMapper {
    int deleteByPrimaryKey(Integer ctsid);

    int insert(Cartypes record);

    int insertSelective(Cartypes record);

    Cartypes selectByPrimaryKey(Integer ctsid);

    int updateByPrimaryKeySelective(Cartypes record);

    int updateByPrimaryKey(Cartypes record);
}