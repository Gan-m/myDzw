package com.accp.action.o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.o.starsBiz;
import com.accp.biz.o.teamBiz;
import com.accp.pojo.Stars;
import com.accp.pojo.Workcars;
import com.accp.vo.o.Team_artisan;
import com.accp.vo.o.pageinfo;
import com.github.pagehelper.PageInfo;

/**
 * 外勤的Servlet
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/api/wq") // 命名空间
public class WaiCarServlert {
	@Autowired
	private teamBiz teambiz;// 外勤的biz
	
	/**
	 * 进入外勤车辆数据查询
	 * @return
	 */
	@PostMapping("query")
	public PageInfo<Workcars> query(@RequestBody pageinfo pinfo) { 
		PageInfo<Workcars> list = teambiz.queryWorkcars(pinfo.getPageNum(),pinfo.getPageSize());
		return list;
	}
	/**
	 * 进入技工星级数据根据id查询
	 * @param id
	 * @return
	 */
	@PostMapping("queryByid")
	public Workcars query(@RequestBody String id) {
		Integer id2=Integer.parseInt(id);
		Workcars stars = teambiz.queryByid(id2);
		return stars;
	}
	/**
	 * 进入外勤车辆删除操作
	 * @param sz
	 * @return
	 */
	@PostMapping("del")
	public Map<String, String> dele(@RequestBody String sz[]) {
		Map<String, String> message = new HashMap<String, String>();
		int count = 0;
		for (String string : sz) {
			Integer zhi = Integer.parseInt(string);
			teambiz.removeWorkcars(zhi);
			count++;
		}
		if (count > 0) {
			System.out.println("结果值" + count);
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
		} else {
			message.put("code", "500");
			message.put("msg", "no");
			return message;
		}

	}
	/**
	 * 进入外勤车辆新增操作
	 * @param sta
	 * @return
	 */
	@PostMapping("add")
	public Map<String, String> add(@RequestBody Workcars sta) {
		System.out.println("进入新增："+sta);
		Map<String, String> message = new HashMap<String, String>();
			int count = teambiz.addWorkCar(sta);
			if(count>0) {
				message.put("code", "200");
				message.put("msg", "ok");
				return message;
			}else{
				message.put("code", "500");
				message.put("msg", "no");
				return message;
			}

	}
	/**
	 * 进入技工数据星级修改操作
	 * @param sta
	 * @return
	 */
	@PostMapping("upd")
	public Map<String, String> update(@RequestBody Workcars wor) {
		System.out.println("进入修改");
		Map<String, String> message = new HashMap<String, String>();
		int count = teambiz.update(wor);
		if (count > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
		} else {
			message.put("code", "500");
			message.put("msg", "no");
			return message;
		}

	}
}
