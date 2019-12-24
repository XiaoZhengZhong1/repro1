package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.xzz.bean.person;

public class 泛型 {
/*###16.06_集合框架(泛型概述和基本使用)(掌握)
* A:泛型概述
* B:泛型好处
	* 提高安全性(将运行期的错误转换到编译期) 就是以前没加泛型编译不会报错但是运行会报错,加了之后有问题,编译就会报错.
	* 省去强转的麻烦
* C:泛型基本使用
	* <>中放的必须是引用数据类型 
* D:泛型使用注意事项
	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  
	泛型中最好不用定义成Object,没有意义.因为所有的类都是Object的子类对象.等于定义成所有的类.
E:1:泛型中类class<>中泛型和类中方法public<>中的泛型最后是一致的,如果不一致,方法中的类型需要重新定义,方法中参数也必须和泛型类型一致.
2:泛型中,静态方法必须定义有自己的泛型static<>因为静态是随着类的加载而存在的,就是在没创建对象之前就有static了,而class<>泛型,需要创建
对象进行赋值,所有静态static<>要定义自己的泛型.
*/
	public static void main(String[] args) {
		LinkedList<person> b = new LinkedList<person>();	//表示集合在添加的是person类对象.
						b.add(new person("肖磊",2));
						b.add(new person("xzz",31));
					Iterator<person> I = b.iterator();		//表示迭代器中也是person类对象.
							while(I.hasNext()){
								// 省去强转的麻烦
								person p =I.next();	//用I调用next()方法时,返回值类型显示person,因为迭代器中的泛型
							//表示用p记录每个迭代的集合对象
							System.out.print(p.getName() + "..." + p.getAge() + ",");
							//肖磊...2,xzz...31,
							//注意不能用I next.getName()因为它是一次性用品,用一次,跳一次.它会输出第一行姓名和第二行年龄
							}
/*##16.07_集合框架(ArrayList存储字符串和自定义对象并遍历泛型版)(掌握)
* A:案例演示
	* ArrayList存储字符串并遍历泛型版*/
		System.out.println();   //换行
	ArrayList<String> A = new ArrayList<>();//前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  
						A.add("a");
						A.add("b");
						A.add("c");
					Iterator<String> I2 = A.iterator();
							while(I2.hasNext()){
								System.out.println(I2.next());
							}
	
	
	
	}

}
