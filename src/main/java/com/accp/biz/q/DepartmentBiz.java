package com.accp.biz.q;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ArtisanMapper;
import com.accp.dao.DepartmentMapper;
import com.accp.dao.DimissionMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.dao.PropertyMapper;
import com.accp.dao.StoreMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Dimission;
import com.accp.pojo.Employee;
import com.accp.pojo.Property;
import com.accp.pojo.Store;
import com.accp.vo.q.ArtisanVo;
import com.accp.vo.q.DimVo;
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
	//技工Dao
	@Autowired
	private ArtisanMapper artDao;
	
	//离职Dao
	@Autowired
	private DimissionMapper dimDao;

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
	public List<Department> queryDepartment(int bmId){
		return dep.select(bmId);
	}
	/**
	 * 查询部门的子类分页
	 */
	public PageInfo<Department> queryDepartmentPage(int p,int s,int bmId){
		PageHelper.startPage(p,s);
		return new PageInfo<Department>(dep.select(bmId));
	}
	/**
	 * 查询单个修改
	 * @param bh
	 * @return
	 */
	public Department queryCha(String bh) {
		return dep.selectCha(bh);
	}
	/**
	 * 判断是否重复
	 * @param departmentid
	 * @return
	 */
	public Department selectByPrimaryKey(Integer departmentid) {
		return dep.selectByPrimaryKey(departmentid);
	}
	/**
	 * 修改岗位
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updDep(Department record) {
		return dep.updateByPrimaryKeySelective(record);
	}
	/**
	 * 新增岗位
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addDep(Department record) {
		return dep.insert(record);
	}
	/**
	 * 删除岗位
	 * @param departmentid
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delDep(Integer departmentid) {
		return dep.deleteByPrimaryKey(departmentid);
	}
	/**
	 * 判断该职位是否被使用
	 * @param departmentid
	 * @return
	 */
	public Employee selectEmpAndDep(Integer departmentid) {
		return dep.selectEmpAndDep(departmentid);
	}
	public Dimission selectDimAndDep(Integer departmentid) {
		return dep.selectDimAndDep(departmentid);
	}
	/**
	 * 分页查询员工
	 * @param p
	 * @param s
	 * @param fid
	 * @param tj
	 * @return
	 */
	public PageInfo<EmpVo> pageEmp(int p,int s,Integer fid,String tj){
		PageHelper.startPage(p,s);
		PageInfo<EmpVo> info=new PageInfo<EmpVo>(empDao.select(fid,tj));
		return info;
	}
	/**
	 * 查所有员工
	 */
	public List<EmpVo> queryEmpName(Integer fid,String tj){
		return empDao.select(fid,tj);
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
	/**
	 * 离职分页
	 * @param p
	 * @param s
	 * @return
	 */
	public PageInfo<DimVo> pageDim(int p,int s,String depid){
		PageHelper.startPage(p,s);
		return new PageInfo<DimVo>(dimDao.select(depid));
	}
	/**
	 * 新增离职
	 * @param dim
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addDim(Dimission dim) {
		empDao.updStateidLi(dim.getEmployeeid());
		Employee e=empDao.selectByPrimaryKey(dim.getEmployeeid());
		dim.setDepartmentid(e.getDepartmentid());
		return dimDao.insert(dim);
	}
	/**
	 * 回滚
	 * @param eid
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int HuiGunDim(Dimission dim) {
		empDao.updStateidHui(dim.getEmployeeid());
		return dimDao.deleteByPrimaryKey(dim.getDimissionid());
	}
	/**
	 * 删除
	 * @param eid
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delDim(Dimission dim) {
		return dimDao.deleteByPrimaryKey(dim.getDimissionid());
	}
	/**
	 * 查询记工表，通讯名录
	 * @return
	 */
	public PageInfo<ArtisanVo> selectTx(int p,int s,String aid){
		PageHelper.startPage(p,s);
		return new PageInfo<ArtisanVo>(artDao.selectTX(aid));
	}
}
