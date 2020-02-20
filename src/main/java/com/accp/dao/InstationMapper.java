package com.accp.dao;

import java.util.List;

import com.accp.pojo.Instation;

public interface InstationMapper {
    int deleteByPrimaryKey(Integer insid);

    int insert(Instation record);

    int insertSelective(Instation record);

    Instation selectByPrimaryKey(Integer insid);
    
    List<Instation> selectBysfj(Integer sfjs);
    
    int updateById(Integer id);
    
    int updateByPrimaryKeySelective(Instation record);

    int updateByPrimaryKey(Instation record);
    
}