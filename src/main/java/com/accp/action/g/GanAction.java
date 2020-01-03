package com.accp.action.g;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.g.GanBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/employee")
public class GanAction {
	
	@Autowired
	private GanBiz biz;
	
	/**
	 * 登录
	 * @param eid
	 * @param epaw
	 * @return
	 */
	@GetMapping
	public Map<String, Object> login(HttpSession se,String eid,String epaw) {
		Map<String , Object> mp=new HashMap<String, Object>();
		Employee em=biz.login(eid, epaw);
		if(em!=null) {
			 mp.put("code", "200");
			 se.setAttribute("User", em);
		}else {
			mp.put("code", "500");
		}
		return mp;
	}
	
	/**
	 * 获取session
	 * @param se
	 * @return
	 */
	@GetMapping("/getsession")
	public Employee getsession(HttpSession se) {
		return (Employee)se.getAttribute("User");
	}
}
