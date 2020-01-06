package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.accp.MyDzwApplication;
import com.accp.biz.m.CarTypeBiz;
import com.accp.biz.m.EngineBiz;


@SpringBootTest(classes = {MyDzwApplication.class })
class MyDzwApplicationTests {
	@Autowired
	private EngineBiz biz;
	@Autowired
	private CarTypeBiz typeBiz;
	@Test
	void getEngineList() {
		biz.getEngineList(null).forEach(item->{
			System.out.println(item);
		});
	}

	@Test
	void getCarTypeList() {
		typeBiz.getCarTypeList("null").forEach(item->{
			System.out.println(item);
		});
	}
}
