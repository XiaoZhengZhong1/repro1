package com.jdk1_7;

public class JDK1_7 {
/*
 * ##27.17_JDK7新特性(JDK7的六个新特性回顾和讲解)
* A:二进制字面量
* B:数字字面量可以出现下划线
* C:switch 语句可以用字符串
* D:泛型简化,菱形泛型
* E:异常的多个catch合并,每个异常用或|
* F:try-with-resources 语句	1.7版本标准的异常处理代码.
 * 
 * */
	public static void main(String[] args) {
		//A:二进制字面量	(表示jdk1.7版本能输出二进制字面值,比如0b11就是二进制字面值,jdk1.7版本能显示输出,之前不能.)
		System.out.println(0b11);	//表示二进制,3
		System.out.println(0x11);	//表示八进制,17
	
	  // B:数字字面量可以出现下划线
		System.out.println(100_00);//Run As 10000.
	}

}
/*
 * ###27.18_JDK8新特性(JDK8的新特性)
* 接口中可以定义有方法体的方法,如果是非静态,必须用default修饰	
* 如果是静态的就不用了

		class Test {
			public void run() {
				final int x = 10;
				class Inner {
					public void method() {
						System.out.println(x);
					}
				}
		
				Inner i = new Inner();
				i.method();
			}
			
		}

		局部内部类在访问他所在方法中的局部变量必须用final修饰,为什么?
		因为当调用这个方法时,局部变量如果没有用final修饰,他的生命周期和方法的生命周期是一样的,当方法弹栈,这个局部变量也会消失,
		那么如果局部内部类对象还没有马上消失想用这个局部变量,就没有了,如果用final修饰会在类加载的时候进入常量池,即使方法弹栈,
		f量池的常量还在,也可以继续使用
###27.19_day27总结
 * */
