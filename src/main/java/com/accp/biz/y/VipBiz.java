package com.accp.biz.y;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.InstationMapper;
import com.accp.dao.RepairMapper;
import com.accp.dao.ViplistMapper;
import com.accp.pojo.Instation;
import com.accp.pojo.Repair;
import com.accp.pojo.Viplist;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class VipBiz {
	@Autowired
	private ViplistMapper VIPdao;
	@Autowired
	private InstationMapper wxdao;
	@Autowired
	private RepairMapper wxzdao;
	
	
	public PageInfo<Viplist> findPersonListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Viplist>(VIPdao.selectAll());
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addVip(String khbh) {
		return VIPdao.insertSelective(new Viplist(null,1,khbh,(float)0,new Date(),(float)0));
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delVip(Integer id) {
		return VIPdao.deleteByPrimaryKey(id);
	}
	public List<Instation> getwxjslist(Integer sfjs) {
		return wxdao.selectBysfj(sfjs);
	}
	public Instation selectByPrimaryKey(Integer id) {
		return wxdao.selectByPrimaryKey(id);
	}
	
	public List<Repair> getwxjslistbyzid(Integer zid) {
		return wxzdao.selectzbbyzbid(zid);
	}
	public int updateById(Integer id) {
		return wxdao.updateById(id);
	}
}
