package com.accp.action.g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.g.GanBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Fuction;
import com.accp.pojo.Tcount;

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
	
	/**
	 * 今日提示
	 * @return
	 */
	@GetMapping("/getnewts")
	public Tcount getnewts() {
		return biz.getnewsts();
	}
	
	/**
	 * 退出
	 * @param se
	 * @return
	 */
	@GetMapping("/tc")
	public  Map<String, Object> tc(HttpSession se){
		Map<String , Object> mp=new HashMap<String, Object>();
		se.invalidate();
		mp.put("code", "200");
		return mp;
	}
	
	/**
	 * 获取菜单
	 * @param session
	 * @return
	 */
	@GetMapping("getFunTree")
	public List getUserFunTree(HttpSession se) {
		// 从session获得用户，以便得到权限
		Employee user = (Employee)se.getAttribute("User");
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Fuction fun : user.getDep().getFlist()) {
			if(fun.getFpid()==0 ) {
				menuNames.add(fun.getFname());
			}
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);//0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Fuction fun : user.getDep().getFlist()) {
				if(fun.getFuc()==null) {
				
				}else {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getFuc().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFno());
					n.put("text", fun.getFname());
					nodeChild.add(n);
				}
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}
}
