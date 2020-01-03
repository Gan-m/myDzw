package com.accp.biz.m;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EngineMapper;
import com.accp.pojo.Engine;

@Service("mjBiz")
public class MjBiz {
	@Autowired
	private EngineMapper fdjDao;
	
	public List<Engine> getEngineList(String engineName){
		return fdjDao.selectByPrimaryKey(engineName);
	}
	
	public int addEngine(String engineName) {
		return fdjDao.insert(engineName);
	}
	
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
