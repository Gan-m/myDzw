package com.accp.dao;

import com.accp.pojo.Wxstate;

public interface WxstateMapper {
    int deleteByPrimaryKey(Integer wxstateid);

    int insert(Wxstate record);

    int insertSelective(Wxstate record);

    Wxstate selectByPrimaryKey(Integer wxstateid);

    int updateByPrimaryKeySelective(Wxstate record);

    int updateByPrimaryKey(Wxstate record);
}