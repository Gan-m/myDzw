package com.accp.dao;

import com.accp.pojo.Clientcar;

public interface ClientcarMapper {
    int deleteByPrimaryKey(String cno);

    int insert(Clientcar record);

    int insertSelective(Clientcar record);

    Clientcar selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(Clientcar record);

    int updateByPrimaryKey(Clientcar record);
}