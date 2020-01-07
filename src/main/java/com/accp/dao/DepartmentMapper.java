package com.accp.dao;

import java.util.List;

import com.accp.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentid);
    
    List<Department> select();
    
    List<Department> selectBm();

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}