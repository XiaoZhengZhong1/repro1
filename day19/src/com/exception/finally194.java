package com.exception;
/*###19.09_异常(finally关键字的特点及作用)
* A:finally的特点
	* 被finally控制的语句体一定会执行
	* 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
* B:finally的作用
	* 用于释放资源，在IO流操作和数据库操作中会见到
* C:案例演示
	* finally关键字的特点及作用*/
public class finally194 {
	public static void main(String[] args){
	try{
		System.out.println(10/0);
	}catch (Exception e) {
		System.out.println("除数为0了");
		return;
	}finally{	//用于释放资源,是必须一定会执行的.除非关闭jvm虚拟机Syetem.exit(0);
		System.out.println("我是一定会执行的");
	}
	}
}
/*###19.10_异常(finally关键字的面试题)
* A:面试题1final finally finalize的区别.
	* final,能修饰类,类不能被继承.能修饰成员变量,成员变量变成常量,只能赋值一次.能修饰成员方法,方法不能被重写.
	* finally不能单独使用,只能和try配合使用,用来释放资源,IO流,数据库.
	* finalize垃圾回收器,
* B:面试题2
	* 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。*/
		//答:会执行.在return后执行.注意finally里面是不能加return语句的,





