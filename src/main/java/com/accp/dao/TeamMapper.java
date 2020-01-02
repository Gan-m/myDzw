package com.accp.dao;

import com.accp.pojo.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer teamid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}