package com.accp.dao;

import com.accp.pojo.Jyjc;

public interface JyjcMapper {
    int deleteByPrimaryKey(Integer jyid);

    int insert(Jyjc record);

    int insertSelective(Jyjc record);

    Jyjc selectByPrimaryKey(Integer jyid);

    int updateByPrimaryKeySelective(Jyjc record);

    int updateByPrimaryKey(Jyjc record);
}