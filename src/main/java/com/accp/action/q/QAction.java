package com.accp.action.q;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.q.DepartmentBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Property;
import com.accp.pojo.Store;
import com.accp.vo.q.EmpVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api")
public class QAction {
	
	@Autowired
	private DepartmentBiz depBiz;
	/**
	 * 查询部门的子类
	 */
	@GetMapping("dep/deps")
	public List<Department> queryDepAll(){
		return depBiz.queryDepartment();
	}
	/**
	 * 查询部门的父类
	 * @return
	 */
	@GetMapping("dep/dep")
	public List<Department> queryDep(){
		return depBiz.queryDepartmentBM();
	}
	/**
	 * 查询所有计薪
	 * @return
	 */
	@GetMapping("pro/pros")
	public List<Property> queryProAll(){
		return depBiz.queryProperty();
	}
	/**
	 * 店面
	 * @param storeid
	 * @return
	 */
	@GetMapping("sto/stos")
	public Store queryStore(String storeid){
		return depBiz.queryStore(storeid);
	}
	/**
	 * 分页查询员工
	 * @param p
	 * @param s
	 * @param fid
	 * @param tj
	 * @return
	 */
	@GetMapping("emp/emps")
	public PageInfo<EmpVo> query(int p,int s,Integer fid,String tj){
		return depBiz.page(p, s, fid,tj);
	}
	/**
	 * 查询单个员工，修改
	 * @param employeeid
	 * @return
	 */
	@GetMapping("emp/emp")
	public Employee selectByPrimaryKey(String employeeid) {
		return depBiz.selectByPrimaryKey(employeeid);
	}
	/**
	 * 新增员工
	 * @param emp
	 * @return
	 */
	@PostMapping("emp/add")
	public Map<Object, String> addEmp(@RequestBody Employee emp){
		Map<Object, String> map=new HashMap<Object, String>();
		emp.setStateid(1);
		int i=depBiz.addEmp(emp);
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	/**
	 * 修改员工
	 * @param emp
	 * @return
	 */
	@PutMapping("emp/upd")
	public Map<Object, String> updEmp(@RequestBody Employee emp){
		Map<Object, String> map=new HashMap<Object, String>();
		int i=depBiz.updEmp(emp);
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	/**
	 * 删除员工
	 * @param j
	 * @return
	 */
	@PostMapping("emp/del")
	public Map<Object, String> delEmp(@RequestBody String[] j) {
		Map<Object, String> map=new HashMap<Object, String>();
		int i=0;
		for (String eid : j) {
			i=depBiz.delEmp(eid);
		}
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	

}
