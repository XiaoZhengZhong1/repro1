package com.HashSet;

import java.util.HashSet;

import com.xzz.bean_1.person;

public class HashSet172 {
/*###17.02_集合框架(HashSet存储自定义对象保证元素唯一性)
* A:案例演示
	* 存储自定义对象，并保证元素唯一性。*/

	public static void main(String[] args) {
		HashSet<person> hs = new HashSet<>();
					hs.add(new person("肖磊",2));
					hs.add(new person("肖磊",2));
					hs.add(new person("肖振中",31));
					hs.add(new person("肖振中",31));
					hs.add(new person("李霞",24));
					System.out.println(hs);
	//[person [name=肖磊, age=2], person [name=李霞, age=24], person [name=肖振中, age=31]]
/*因为person类中重写了hashCode()方法,和equals()方法.创建有参构造对象会自动调用里面的方法,进行 赋址 和 比值 .注意hashCode是给创建
对象赋址的是存储地址的,API中对赋址进行了复杂的算法,尽量保证姓名和年龄不同的地址也不同,不用调用equals()方法比较.只有姓名和年龄相同地址
才会一样,才需要调用equals()方法.API中重写的equaks()方法.也做了详细的判断.直接Ait+shift+s+h,就能在自定义类中生成方法.*/	

					
/* 重写hashCode()和equals()方法
 ###17.03_集合框架(HashSet存储自定义对象保证元素唯一性图解及代码优化)
 * A:画图演示
 	* 画图说明比较过程
 * B:代码优化
 	* 为了减少比较，优化hashCode()代码写法。
 	* 最终版就是自动生成即可。

 ###17.04_集合框架(HashSet如何保证元素唯一性的原理)
 * 1.HashSet原理
 	* 我们使用Set集合都是需要去掉重复元素的, 如果在存储的时候逐个equals()比较, 效率较低,哈希算法提高了去重复的效率, 降低了使用equals()方法的次数
 	* 当HashSet调用add()方法存储对象的时候, 先调用对象的hashCode()方法得到一个哈希值, 然后在集合中查找是否有哈希值相同的对象
 		* 如果没有哈希值相同的对象就直接存入集合
 		* 如果有哈希值相同的对象, 就和哈希值相同的对象逐个进行equals()比较,比较结果为false就存入, true则不存
 
 * 
 * 
 * 2.将自定义类的对象存入HashSet去重复
 	* 自定义类中必须重写hashCode()和equals()方法
 	* hashCode(): 属性相同的对象返回值必须相同, 属性不同的返回值尽量不同(提高效率)
 	* equals(): 属性相同返回true, 属性不同返回false,返回false的时候存储*/	
					
					
					
					
	}

}
