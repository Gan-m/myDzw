package com.accp.dao;

import java.util.List;

import com.accp.pojo.Repair;

public interface RepairMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer rid);
    
    List<Repair> selectzbbyzbid(Integer zid);
    
    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}