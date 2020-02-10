package com.accp.action.m;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.m.CarTypeBiz;
import com.accp.pojo.Cartypes;

@RestController
@RequestMapping("/api/cars")
public class CarTypeAction {

	@Autowired
	private CarTypeBiz biz;
	
	@GetMapping("/types/{option}")
	public List<Cartypes> getTypeList(@PathVariable String option){
		return biz.getCarTypeList(option);
	}
	@GetMapping("/types/type/{option}")
	public Cartypes getType(@PathVariable String option){
		return biz.getCarType(option);
	}
	@PostMapping("/type")
	public Map<String, Object> addCarType(@RequestBody Cartypes type){
		Map<String, Object> map=new HashMap<String, Object>();
		if(biz.addCarType(type)>=1) {
			map.put("code", "200");
			map.put("msg", "新增成功");
		}else {
			map.put("code", "400");
			map.put("msg", "新增失败");
		}
		return map;
	}
	@PostMapping("/type/modify")
	public Map<String, Object> modifyCarType(@RequestBody Cartypes type){
		Map<String, Object> map=new HashMap<String, Object>();
		if(biz.modifyCarType(type)>=1) {
			map.put("code", "200");
			map.put("msg", "新增成功");
		}else {
			map.put("code", "400");
			map.put("msg", "新增失败");
		}
		return map;
	}
	
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
