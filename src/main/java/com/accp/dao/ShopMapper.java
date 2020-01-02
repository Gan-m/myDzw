package com.accp.dao;

import com.accp.pojo.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(String shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String shopid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}