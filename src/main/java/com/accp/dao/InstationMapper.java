package com.accp.dao;

import com.accp.pojo.Instation;

public interface InstationMapper {
    int deleteByPrimaryKey(Integer insid);

    int insert(Instation record);

    int insertSelective(Instation record);

    Instation selectByPrimaryKey(Integer insid);

    int updateByPrimaryKeySelective(Instation record);

    int updateByPrimaryKey(Instation record);
}