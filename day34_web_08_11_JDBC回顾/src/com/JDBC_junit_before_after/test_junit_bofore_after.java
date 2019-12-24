package com.JDBC_junit_before_after;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test_junit_bofore_after {
//本类演示一个类中有多个测试方法可用
	public static void main(String[] args) {

	}

/*1:注意加载测试方法格式:@Test   ctrl+1 导包	import org.junit.Test;(一般开发工具都带有junit包).导包后再运行就会多出
 * 一个运行方法Junit Test,可以运行执行junit方法中的输出语句*/
	
	@Test
	public void junit(){
		System.out.println("junit:测试驱动");
	}
	
	
	
/*2:@Before导包import org.junit.Before;表示     在Test之前执行   用Junit Test执行*/
	@Before
	public void before(){
		System.out.println("before:在.....之前");
	}
	
	
	//3:@After  import org.junit.After;  after:表示  在Text之后执行.用Junit Test执行
	@After
	public void after(){
		System.out.println("after:在....之后");
	}
	
	
}
