package com.accp.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.o.starsBiz;
<<<<<<< HEAD
import com.accp.biz.o.teamBiz;
=======
import com.accp.biz.y.VipBiz;
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
import com.accp.pojo.Stars;
<<<<<<< HEAD
import com.accp.pojo.Team;
import com.accp.pojo.Workcars;
import com.accp.vo.o.Team_artisan;
=======
import com.alibaba.fastjson.JSON;
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
/**
 * 欧阳小粤的数据测试类
 * @author Administrator
 *
 */
@SpringBootTest
public class OuyangXiaoyueText {

	@Autowired
<<<<<<< HEAD
	private starsBiz starsbiz;
	@Autowired
	private teamBiz teambiz;
=======
	private VipBiz biz;
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
	/**
	 * 测试遍历技工星际所有的数据
	 */
	@Test
	public void StarsShow() {
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
<<<<<<< HEAD
		//通过名称查询一条数据
		Stars stars=starsbiz.queryByName("一级技工");
		System.out.println(stars);
=======
		
>>>>>>> branch 'master' of https://github.com/Gan-m/myDzw.git
	}
	
	/**
	 * 测试技工班组数据
	 */
	@Test
	public void TeamShow() {
		
//		List<Team>list=teambiz.queryTeam();//左边导航栏数据
//		for (Team team : list) {
//			System.out.println(team);
//		}
		
//		List<Team_artisan> list = teambiz.queryTeam_artisan();
//		for (Team_artisan team_artisan : list) {
//			System.out.println(team_artisan);
//		}
		
		//遍历所有外勤车辆
//		List<Workcars> list = teambiz.queryWorkcars();
//		for (Workcars workcars : list) {
//			System.out.println(workcars);
//		}
//		int count = teambiz.removeWorkcars(2);
//		System.out.println(count+"....1111111111111");
		List<Team> list=teambiz.queryBanZu();
		for (Team team : list) {
			System.out.println(team);
		}
		
	}
	
	
}
