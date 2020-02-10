package com.accp.action.y;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.y.VipBiz;
import com.accp.pojo.Viplist;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/vips") // 命名空间
public class Y {
	@Autowired
	private VipBiz biz;
	@GetMapping("getlist/{pageNum}/{pageSize}")
	public PageInfo<Viplist> queryVip(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return biz.findPersonListByPage(pageNum, pageSize);
	}
	@PostMapping("add/{khbh}")
	public Map<String, String> addVip(@PathVariable String khbh){
		System.out.println(khbh);
		Map<String, String> map = new HashMap<>();
		if(biz.addVip(khbh)>0) {
			map.put("code", "200");
			map.put("msg", "新增成功");
		}else {
			map.put("code", "300");
			map.put("msg", "新增失败");
		}
		return map;
	}
	@PostMapping("del/{id}")
	public Map<String, String> delVip(@PathVariable Integer id){
		System.out.println(id);
		Map<String, String> map = new HashMap<>();
		if(biz.delVip(id)>0) {
			map.put("code", "200");
			map.put("msg", "删除成功");
		}else {
			map.put("code", "300");
			map.put("msg", "删除失败");
		}
		return map;
	}
}
