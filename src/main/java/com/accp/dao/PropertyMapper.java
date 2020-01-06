package com.accp.dao;

import java.util.List;

import com.accp.pojo.Property;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer propertyid);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer propertyid);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
    
    List<Property> select();
}