package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Employee;
import com.accp.pojo.Tcount;
import com.accp.vo.q.EmpVo;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    /**
     	* 今日推荐
     * @return
     */
    Tcount getnewsts();
    
    List<EmpVo> select(@Param("fid") Integer fid,@Param("tj") String tj);
    
    Employee login (@Param("eid") String eid,@Param("epaw")String epaw);
    
    int updStateidHui(@Param("employeeid") String employeeid);
    
    int updStateidLi(@Param("employeeid") String employeeid);
    
}