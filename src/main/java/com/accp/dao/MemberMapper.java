package com.accp.dao;

import com.accp.pojo.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}