package com.accp.dao;

import java.util.List;

import com.accp.pojo.Stars;

public interface StarsMapper {
    int deleteByPrimaryKey(Integer starsid);

    int insert(Stars record);

    int insertSelective(Stars record);

    Stars selectByPrimaryKey(Integer starsid);

    int updateByPrimaryKeySelective(Stars record);

    int updateByPrimaryKey(Stars record);
    
    List<Stars> query();
}