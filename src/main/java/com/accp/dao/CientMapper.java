package com.accp.dao;

import com.accp.pojo.Cient;

public interface CientMapper {
    int deleteByPrimaryKey(String clientno);

    int insert(Cient record);

    int insertSelective(Cient record);

    Cient selectByPrimaryKey(String clientno);

    int updateByPrimaryKeySelective(Cient record);

    int updateByPrimaryKey(Cient record);
}