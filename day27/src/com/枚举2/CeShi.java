package com.枚举2;
/*
 * ###27.15_JDK5新特性(枚举的注意事项)
* A:案例演示
	* 定义枚举类要用关键字enum
	* 所有枚举类都是Enum的子类
	* 枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略
	* 枚举类可以有构造器，但必须是private的，它默认的也是private的。
	* 枚举类也可以有抽象方法，但是枚举项必须重写该方法
	* 枚举在switch语句中的使用
 * */
public class CeShi {

	public static void main(String[] args) {
		//测试enum类枚举方式1
		we MO = we.mo;
		System.out.println(MO);
	

	//测试enum类枚举方式2
			we2 WE2 = we2.mo2;
			System.out.println(WE2.getName());
	//测试enum类枚举方式3
	        we3 WE3 = we3.mo2;
	        	WE3.show();
	
	we2 TU2 = we2.tu2;	//初始表达式,
	switch (TU2) {	//表示值TU2,匹配下面的case
	case tu2:		//表示tu2拿到初始表达式上匹配,是否符合TU2
		System.out.println("星期二");
		break;
	case we2:
		System.out.println("星期一");
		break;
	default:
		break;
	}
	
	
	
	}
}
