package com.accp.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.o.starsBiz;
import com.accp.biz.y.VipBiz;
import com.accp.pojo.Stars;
import com.alibaba.fastjson.JSON;
/**
 * 欧阳小粤的数据测试类
 * @author Administrator
 *
 */
@SpringBootTest
public class OuyangXiaoyueText {

	@Autowired
	private VipBiz biz;
	/**
	 * 测试遍历技工星际所有的数据
	 */
	@Test
	public void query() {
//		List<Stars> list=starsbiz.query();
//		for (Stars stars : list) {
//			System.out.println(stars);
//		}
		//新增
//		Stars sta = new Stars(4,"四级技工",(float)500);
//		int count = starsbiz.addStars(sta);
//		System.out.println("新增结果值："+count);
		
		//删除
//		int count = starsbiz.removeByidStars(4);
//		System.out.println("删除的结果值："+count);
		
	}
	
	
}
