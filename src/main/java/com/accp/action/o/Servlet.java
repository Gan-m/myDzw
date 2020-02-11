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
 * 星级的Servlet
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/api/xj") // 命名空间
public class Servlet {

	@Autowired
	private starsBiz starsbiz;// 技工星际的biz

	
	/**
	 * 查询所有星级

	/**
	 * 进入技工星级数据查询
	 * @return
	 *///@PostMapping("query")

	/*
	 * public PageInfo<Stars> query(@RequestBody pageinfo pinfo) { PageInfo<Stars>
	 * list = starsbiz.query(pinfo.getPageNum(),pinfo.getPageSize());
	 * 
	 * }
	 */
//	public List<Stars> query() { 
//		List<Stars> list = starsbiz.query();
//		return list;
//	}

	

	/**
	 * 进入技工星级数据根据id查询
	 * @param id
	 * @return
	 */
	@PostMapping("queryByid")
	public Stars query(@RequestBody String id) {
		Integer id2=Integer.parseInt(id);
		Stars stars = starsbiz.queryByid(id2);
		return stars;
	}
	/**
	 * 进入技工数据星级新增操作
	 * @param sta
	 * @return
	 */
	@PostMapping("add")
	public Map<String, String> querykc(@RequestBody Stars sta) {
		Map<String, String> message = new HashMap<String, String>();
		Stars stars = starsbiz.queryByName(sta.getStarsname());
		if (stars == null) {
			int count = starsbiz.addStars(sta);
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
	 * 进入技工数据星级修改操作
	 * @param sta
	 * @return
	 */
	@PostMapping("upd")
	public Map<String, String> update(@RequestBody Stars sta) {
		Map<String, String> message = new HashMap<String, String>();
		int count = starsbiz.update(sta);
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
	/**
	 * 进入技工数据星级删除操作
	 * @param sz
	 * @return
	 */
	@PostMapping("del")
	public Map<String, String> dele(@RequestBody String sz[]) {
		Map<String, String> message = new HashMap<String, String>();
		int count = 0;
		for (String string : sz) {
			Integer zhi = Integer.parseInt(string);
			starsbiz.removeByidStars(zhi);
			count++;
		}
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
