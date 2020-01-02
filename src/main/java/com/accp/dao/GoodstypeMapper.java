package com.accp.dao;

import com.accp.pojo.Goodstype;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}