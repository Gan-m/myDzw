package com.accp.biz.g;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;
import com.accp.pojo.Tcount;

@Service
public class GanBiz {
	
	@Autowired
	private EmployeeMapper ebiz;
	
	/**
	 * 登录
	 * @param eid
	 * @param epaw
	 * @return
	 */
	public Employee login(String eid,String epaw) {
		return ebiz.login(eid, epaw);
	}
	
	/**
	 * 今日提示
	 * @return
	 */
	public Tcount getnewsts() {
		return ebiz.getnewsts();
	}
}
