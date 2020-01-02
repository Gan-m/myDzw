package com.accp.dao;

import com.accp.pojo.Viplist;

public interface ViplistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Viplist record);

    int insertSelective(Viplist record);

    Viplist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Viplist record);

    int updateByPrimaryKey(Viplist record);
}