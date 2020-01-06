package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.accp.MyDzwApplication;
import com.accp.biz.m.MjBiz;


@SpringBootTest(classes = {MyDzwApplication.class })
class MyDzwApplicationTests {
	@Autowired
	private MjBiz biz;
	
	
	@Test
	void getEngineList() {
		biz.getEngineList(null).forEach(item->{
			System.out.println(item);
		});
	}

	void login() {
		
	}
}
