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
import com.accp.pojo.Stars;

@RestController
@RequestMapping("/api/xj") // 命名空间
public class Servlet {

	@Autowired
	private starsBiz starsbiz;// 技工星际的biz
	
	/**
	 * 查询所有星级
	 * @return
	 */
	@PostMapping("query")
	public List<Stars> query() {
		List<Stars> list = starsbiz.query();
		return list;
	}
	
	@PostMapping("queryByid")
	public Stars query(@RequestBody String id) {
		Integer id2=Integer.parseInt(id);
		Stars stars = starsbiz.queryByid(id2);
		return stars;
	}
	@PostMapping("add")
	public Map<String, String> querykc(@RequestBody Stars sta) {
		Map<String, String> message = new HashMap<String, String>();
		Stars stars = starsbiz.queryByid(sta.getStarsid());
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
