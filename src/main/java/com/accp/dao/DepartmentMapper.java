package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentid);
    
    List<Department> select();
    
    List<Department> selectBm();
    
    Department selectCha(@Param("bh") String bh);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}