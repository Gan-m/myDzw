package com.accp.biz.o;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CientMapper;
import com.accp.pojo.Cient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class clientBiz {
	@Autowired
	private  CientMapper clientDao;
	
	/**
	 * 遍历所有客户数据
	 * @return
	 */
	public PageInfo<Cient> query(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Cient> info = new PageInfo<Cient>(clientDao.query());
		return info;
	}
	
}
