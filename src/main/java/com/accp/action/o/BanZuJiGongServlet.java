package com.accp.action.o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.biz.o.teamBiz;
import com.accp.pojo.Team;
import com.accp.vo.o.Team_artisan;
import com.accp.vo.o.pageinfo;
import com.github.pagehelper.PageInfo;
/**
 * 班组技工的Servlet
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/api/bz") // 命名空间
public class BanZuJiGongServlet {
	@Autowired
	private teamBiz teambiz;// 技工星际的biz
	/**
	 * 进入技工班组数据查询(左侧导航)
	 * @return
	 */
	@PostMapping("BanzuQuery")
	public List<Team> BanzuQuery() { 
		List<Team> list = teambiz.queryTeam();
		return list;
	}
	/**
	 * 进入技工子班组数据查询
	 * @return
	 */
	@PostMapping("Banzushow")
	public List<Team> Banzushow() { 
		List<Team> list = teambiz.queryBanZu();
		return list;
	}
	
	/**
	 * 遍历班组技工中的所有人员数据
	 */
	@PostMapping("BanzuTeam_artisan")
	public PageInfo<Team_artisan> BanzuTeam_artisan(@RequestBody pageinfo pinfo) { 
		System.out.println("进入数据分页操作");
		PageInfo<Team_artisan> list = teambiz.queryTeam_artisan(pinfo.getPageNum(),pinfo.getPageSize());
		return list;
	}
	/**
	 * 进入班组技工人员删除操作
	 * @param sz
	 * @return
	 */
	@PostMapping("BanzuWardel")
	public Map<String, String> dele(@RequestBody String sz[]) {
		Map<String, String> message = new HashMap<String, String>();
		int count = 0;
		for (String string : sz) {
			teambiz.removeTeam_artisan(string);
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
	
}
