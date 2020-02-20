package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Dimission;
import com.accp.pojo.Employee;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentid);
    
    List<Department> select(@Param("bmId") int bmId);
    
    List<Department> selectBm();
    
    Department selectCha(@Param("bh") String bh);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    Employee selectEmpAndDep(@Param("departmentid") Integer departmentid); 
    
    Dimission selectDimAndDep(@Param("departmentid") Integer departmentid); 
}