package com.accp.biz.m;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EngineMapper;
import com.accp.pojo.Engine;

@Service("engineBiz")
public class EngineBiz {
	@Autowired
	private EngineMapper fdjDao;
	/**
	 * 获得所有的发动机品牌，根据名称查询
	 * @param engineName 品牌名称
	 * @return
	 */
	public List<Engine> getEngineList(String engineName){
		return fdjDao.selectByPrimaryKey(engineName);
	}
	/**
	 * 添加发动机品牌
	 * @param engineName
	 * @return
	 */
	public int addEngine(String engineName) {
		return fdjDao.insert(engineName);
	}
	/**
	 * 根据选中的id删除发动机品牌
	 * @param nos 发动机品牌id数组
	 * @return
	 */
	public int removeEngine(String[] nos) {
		int i=0;
		for (String id : nos) {
			if(fdjDao.deleteByPrimaryKey(id)>=1) {
				i++;
			}
		}
		return i;
	}
}
