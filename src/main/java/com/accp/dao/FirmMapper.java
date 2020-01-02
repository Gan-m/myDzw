package com.accp.dao;

import com.accp.pojo.Firm;

public interface FirmMapper {
    int deleteByPrimaryKey(String firmno);

    int insert(Firm record);

    int insertSelective(Firm record);

    Firm selectByPrimaryKey(String firmno);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
}