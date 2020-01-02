package com.accp.dao;

import com.accp.pojo.Wxxqd;

public interface WxxqdMapper {
    int deleteByPrimaryKey(Integer wxqid);

    int insert(Wxxqd record);

    int insertSelective(Wxxqd record);

    Wxxqd selectByPrimaryKey(Integer wxqid);

    int updateByPrimaryKeySelective(Wxxqd record);

    int updateByPrimaryKey(Wxxqd record);
}