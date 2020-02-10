package com.accp.biz.m;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CartypesMapper;
import com.accp.pojo.Cartypes;

@Service("cartypeBiz")
public class CarTypeBiz {
	@Autowired
	private CartypesMapper typeDao;
	
	public List<Cartypes> getCarTypeList(String option){
		return typeDao.selectByPrimaryKey(option);
	}
	
	public Cartypes getCarType(String option){
		return typeDao.getType(option);
	}
	
	public int addCarType(Cartypes type) {
		return typeDao.insert(type);
	}
	public int modifyCarType(Cartypes type) {
		return typeDao.updateByPrimaryKey(type);
	}
	public int removeEngine(String[] nos) {
		int i=0;
		for (String id : nos) {
			if(typeDao.deleteByPrimaryKey(id)>=1) {
				i++;
			}
		}
		return i;
	}
}
