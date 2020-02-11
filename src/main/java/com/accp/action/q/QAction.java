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
import com.accp.pojo.Dimission;
import com.accp.pojo.Employee;
import com.accp.pojo.Property;
import com.accp.pojo.Store;
import com.accp.vo.q.DimVo;
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
	 * 查询部门的子类
	 */
	@GetMapping("dep/depPage")
	public PageInfo<Department> queryDepAllPage(int p,int s){
		return depBiz.queryDepartmentPage(p,s);
	}
	/**
	 * 修改岗位的查询
	 * @param bh
	 * @return
	 */
	@GetMapping("dep/depCha")
	public Department queryCha(String bh) {
		if(depBiz.queryCha(bh)!=null) {
			return depBiz.queryCha(bh);
		}
		return null;
	}
	/**
	 * 删除岗位
	 * @param depid
	 * @return
	 */
	@PostMapping("dep/del")
	public Map<Object, String> addDep(@RequestBody Integer[] depid){
		Map<Object, String> map=new HashMap<Object, String>();
		for (Integer departmentid : depid) {
			int i=depBiz.delDep(departmentid);
			if(i>0) {
				map.put("code", "200");
			}else {
				map.put("code", "300");
			}
		}
		return map;
	}
	/**
	 * 新增岗位
	 * @param dep
	 * @return
	 */
	@PostMapping("dep/add")
	public Map<Object, String> addDep(@RequestBody Department dep){
		Map<Object, String> map=new HashMap<Object, String>();
		int i=depBiz.addDep(dep);
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	/**
	 * 修改岗位
	 * @param dep
	 * @return
	 */
	@PutMapping("dep/upd")
	public Map<Object, String> updDep(@RequestBody Department dep){
		Map<Object, String> map=new HashMap<Object, String>();
		int i=depBiz.updDep(dep);
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
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
	public PageInfo<EmpVo> queryEmp(int p,int s,Integer fid,String tj){
		return depBiz.pageEmp(p, s, fid,tj);
	}
	@GetMapping("emp/empName")
	public List<EmpVo> queryEmpName(){
		return depBiz.queryEmpName(0,"");
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
	/**
	 * 分页查询离职表
	 * @param p
	 * @param s
	 * @return
	 */
	@GetMapping("dim/pageDim")
	public PageInfo<DimVo> pageDim(int p,int s){
		return depBiz.pageDim(p, s);
	}
	/**
	 * 新增离职员工
	 * @param dim
	 * @return
	 */
	@PostMapping("dim/add")
	public Map<Object, String> addDim(@RequestBody Dimission dim){
		Map<Object, String> map=new HashMap<Object, String>();
		int i= depBiz.addDim(dim);
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	/**
	 * 回滚
	 * @param j
	 * @return
	 */
	@PostMapping("dim/huigun")
	public Map<Object, String> HuiGunDim(@RequestBody Dimission[] j) {
		Map<Object, String> map=new HashMap<Object, String>();
		int i=0;
		for (Dimission dim : j) {
			i=depBiz.HuiGunDim(dim);
		}
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	/**
	 * 回滚
	 * @param j
	 * @return
	 */
	@PostMapping("dim/del")
	public Map<Object, String> delDim(@RequestBody Dimission[] j) {
		Map<Object, String> map=new HashMap<Object, String>();
		int i=0;
		for (Dimission dim : j) {
			i=depBiz.delDim(dim);
			i=depBiz.delEmp(dim.getEmployeeid());
		}
		if(i>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}

}
