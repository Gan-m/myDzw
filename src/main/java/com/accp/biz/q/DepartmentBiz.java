package com.accp.biz.q;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DepartmentMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.dao.PropertyMapper;
import com.accp.dao.StoreMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Employee;
import com.accp.pojo.Property;
import com.accp.pojo.Store;
import com.accp.vo.q.EmpVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DepartmentBiz {

	//部门Dao
	@Autowired
	private DepartmentMapper dep;
	//员工Dao
	@Autowired
	private EmployeeMapper empDao;
	//计薪Dao
	@Autowired
	private PropertyMapper proDao;
	//店面Dao
	@Autowired
	private StoreMapper storeDao;

	public DepartmentMapper getDep() {
		return dep;
	}

	public void setDep(DepartmentMapper dep) {
		this.dep = dep;
	}
	/**
	 * 查询部门的父类
	 * @return
	 */
	public List<Department> queryDepartmentBM(){
		return dep.selectBm();
	}
	/**
	 * 查询部门的子类
	 */
	public List<Department> queryDepartment(){
		return dep.select();
	}
	/**
	 * 分页查询员工
	 * @param p
	 * @param s
	 * @param fid
	 * @param tj
	 * @return
	 */
	public PageInfo<EmpVo> page(int p,int s,Integer fid,String tj){
		PageHelper.startPage(p,s);
		PageInfo<EmpVo> info=new PageInfo<EmpVo>(empDao.select(fid,tj));
		return info;
	}
	/**
	 * 查询所有计薪
	 * @return
	 */
	public List<Property> queryProperty(){
		return proDao.select();
	}
	/**
	 * 店面
	 * @param storeid
	 * @return
	 */
	public Store queryStore(String storeid){
		return storeDao.selectByPrimaryKey(storeid);
	}
	/**
	 * 新增员工
	 * @param emp
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addEmp(Employee emp) {
		return empDao.insert(emp);
	}
	/**
	 * 查询单个员工，修改
	 * @param employeeid
	 * @return
	 */
	public Employee selectByPrimaryKey(String employeeid) {
		return empDao.selectByPrimaryKey(employeeid);
	}
	/**
	 * 修改员工
	 * @param emp
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updEmp(Employee emp) {
		return empDao.updateByPrimaryKey(emp);
	}
	/**
	 * 删除员工
	 * @param j
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delEmp(String eid) {
		return empDao.deleteByPrimaryKey(eid);
	}
}
