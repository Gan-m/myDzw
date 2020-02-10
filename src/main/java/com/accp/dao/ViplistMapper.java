package com.accp.dao;

import java.util.List;

import com.accp.pojo.Viplist;

public interface ViplistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Viplist record);

    int insertSelective(Viplist record);

    Viplist selectByPrimaryKey(Integer id);
    
    List<Viplist> selectAll();

    int updateByPrimaryKeySelective(Viplist record);

    int updateByPrimaryKey(Viplist record);
}