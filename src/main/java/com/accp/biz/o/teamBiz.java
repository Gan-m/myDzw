package com.accp.biz.o;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ArtisanMapper;
import com.accp.dao.StarsMapper;
import com.accp.dao.TeamMapper;
import com.accp.dao.WorkcarsMapper;
import com.accp.pojo.Artisan;
import com.accp.pojo.Stars;
import com.accp.pojo.Team;
import com.accp.pojo.Workcars;
import com.accp.vo.o.Team_artisan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class teamBiz {
	@Autowired
	private  TeamMapper teamDao;//班组
	@Autowired
	private WorkcarsMapper workcarsDao;//外勤车辆
	@Autowired
	private ArtisanMapper artisanDao;//班组技工人员
	
	/**
	 * 遍历所有技工班组数据
	 */
	public List<Team> queryTeam() {
		return teamDao.query();
	}
	
	/**
	 * 遍历所有班组的技工信息
	 * @return
	 */
	public PageInfo<Team_artisan> queryTeam_artisan(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Team_artisan> info = new PageInfo<Team_artisan>(teamDao.queryTeam_artisan());
		return info;
	}
	/**
	 * 删除
	 * @param stars
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeTeam_artisan(String id) {
		return artisanDao.deleteByPrimaryKey(id);
	}
	
	/**
	 * 新增班组技工人员
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addArtisan(Artisan art) {
		return artisanDao.insertSelective(art);
	}
	
	/**************************外勤**************************************/
	/**
	 * 遍历所有外勤车辆
	 * @return
	 */
	public PageInfo<Workcars> queryWorkcars(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Workcars> info = new PageInfo<Workcars>(workcarsDao.queryWorkcars());
		return info;
	}
	/**
	 * 通过编号查询
	 * @param id
	 * @return
	 */
	public Workcars queryByid(Integer id) {
		return workcarsDao.selectByPrimaryKey(id);
	}
	/**
	 * 删除
	 * @param stars
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeWorkcars(Integer id) {
		return workcarsDao.deleteByPrimaryKey(id);
	}
	/**
	 * 修改
	 * @param sta
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Workcars wor) {
		return workcarsDao.updateByPrimaryKey(wor);
	}
	/**
	 * 新增
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addWorkCar(Workcars work) {
		return workcarsDao.insertSelective(work);
	}
	/**
	 * 查询所有子班组
	 * @param id
	 * @return
	 */
	public List<Team> queryBanZu() {
		return teamDao.queryBanZu();
	}
	
}
