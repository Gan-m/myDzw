package com.accp.dao;

import com.accp.pojo.Modeltype;

public interface ModeltypeMapper {
    int deleteByPrimaryKey(String cartypeid);

    int insert(Modeltype record);

    int insertSelective(Modeltype record);

    Modeltype selectByPrimaryKey(String cartypeid);

    int updateByPrimaryKeySelective(Modeltype record);

    int updateByPrimaryKey(Modeltype record);
}