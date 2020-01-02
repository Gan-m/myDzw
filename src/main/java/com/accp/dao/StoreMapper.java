package com.accp.dao;

import com.accp.pojo.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(String storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(String storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}