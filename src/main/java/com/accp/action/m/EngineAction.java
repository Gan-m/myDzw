package com.accp.action.m;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.m.MjBiz;
import com.accp.pojo.Engine;

@RestController
@RequestMapping("/api/engines")
public class EngineAction {
	@Autowired
	private MjBiz biz;
	/**
	 * 根据名称查询或者查询全部
	 * @param engineName 发动机名称
	 * @return
	 */
	@GetMapping("/{engineName}")
	public List<Engine> getEngineList(@PathVariable String engineName){
		return biz.getEngineList(engineName);
	}
	/**
	 * 新增发动机品牌
	 * @param engineName 发动机品牌名称
	 * @return
	 */
	@PostMapping("engine/{engineName}")
	public Map<String, Object> addEngine(@PathVariable String engineName){
		Map<String, Object> map=new HashMap<String, Object>();
		if(biz.addEngine(engineName)>=1) {
			map.put("code", "200");
			map.put("msg", "新增成功");
		}else {
			map.put("code", "400");
			map.put("msg", "新增失败");
		}
		return map;
	}
	/**
	 * 根据发动机品牌id删除
	 * @param nos 选择品牌id数组
	 * @return
	 */
	@PostMapping("/delete")
	public Map<String, Object> deleteEngine(@RequestBody String[] nos){
		Map<String, Object> map=new HashMap<String, Object>();
		if(biz.removeEngine(nos)>=1) {
			map.put("code", "200");
			map.put("msg", "删除成功");
		}else {
			map.put("code", "400");
			map.put("msg", "删除失败");
		}
		return map;
	}
}
