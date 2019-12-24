package com.stringBuffer;

public class demo9_zidongzhuanxiang {

	public static void main(String[] args) {
/*
###13.22_常见对象(JDK5的新特性自动装箱和拆箱)
* A:JDK5的新特性
	* 自动装箱：把基本类型转换为包装类类型
	* 自动拆箱：把包装类类型转换为基本类型
* B:案例演示
	* JDK5的新特性自动装箱和拆箱
	
	* Integer ii = 100;
	* ii += 200;
* C:注意事项
	* 在使用时，Integer  x = null;代码就会出现NullPointerException。
	* 建议先判断是否为null，然后再使用。
*/
//jdk 1.5版本的新特性.自动拆,装,箱.面试可能会问.
//先演示以下以前是怎么手动装箱的,就是怎么把基本数据类型转换成对象的.	
	int x = 100;
	Integer x1 = new Integer(x);//手动装箱,将基本数据类型转换成对象.
	int x2 = x1.intValue();		//手动拆箱,将对象转换成基本数据类型.
	System.out.println(x2);
	
	Integer y = 200;	//自动装箱y就成了包装对象
	int x3 = y ;		//自动拆箱y又成了基本数据类型        计算机底层还是进行了上面的手动操作,只是不需要我们自己动手了
	System.out.println(x3);
	}

}
