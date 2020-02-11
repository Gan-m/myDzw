package com.accp.biz.o;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StarsMapper;
import com.accp.pojo.Stars;
import com.accp.vo.o.Team_artisan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class starsBiz {

	@Autowired
	private  StarsMapper starsDao;
	
	/**
	 * 遍历技工星级数据
	 * @return
	 */
	public PageInfo<Stars> query(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Stars> info = new PageInfo<Stars>(starsDao.query());
		return info;
	}
	/**
	 * 通过编号查询
	 * @param id
	 * @return
	 */
	public Stars queryByid(Integer id) {
		return starsDao.selectByPrimaryKey(id);
	}
	
	public Stars queryByName(String name) {
		return starsDao.selectByName(name);
	} 
	/**
	 * 新增一条星级数据
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addStars(Stars stars) {
		return starsDao.insertSelective(stars);
	}
	/**
	 * 删除
	 * @param stars
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeByidStars(Integer id) {
		return starsDao.deleteByPrimaryKey(id);
	}
	/**
	 * 修改
	 * @param sta
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Stars sta) {
		return starsDao.updateByPrimaryKeySelective(sta);
	}
}
