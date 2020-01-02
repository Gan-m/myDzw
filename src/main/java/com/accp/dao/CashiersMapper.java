package com.accp.dao;

import com.accp.pojo.Cashiers;

public interface CashiersMapper {
    int deleteByPrimaryKey(Integer casid);

    int insert(Cashiers record);

    int insertSelective(Cashiers record);

    Cashiers selectByPrimaryKey(Integer casid);

    int updateByPrimaryKeySelective(Cashiers record);

    int updateByPrimaryKey(Cashiers record);
}