package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.xzz.bean.person;


@SuppressWarnings({ "rawtypes", "unchecked" })

public class ArrayList162_contains {
/*###16.02_集合框架(去除ArrayList中重复自定义对象元素)(掌握)
* A:案例演示
	* 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
* B:注意事项
	* 重写equals()方法的,因为contains和remove做判断是底层都是用equals*/
	
	public static void main(String[] args) {
		ArrayList A = new ArrayList();	//创建集合
			A.add(new person("肖磊",2));	//添加自定义类型对象.
			A.add(new person("肖磊",2));
			A.add(new person("xzz",31));
			A.add(new person("xzz",31));
			ArrayList A1 = get(A);	/*表示获取一个方法,方法中的参数是A集合,获取的结果就是新集合A1,方法中A1中是否有和A相同的
自定义对象,有就不添加.这样新集合中就不会出现重复了,鼠标放置在get上,ctrl+1可自动生成get方法*/			
			System.out.print(A1);	//直接输出:[person [name=肖磊, age=2], person [name=xzz, age=31]]
			Iterator I2 = A1.iterator();
			while(I2.hasNext()){
				Object obj1 = I2.next();
				person p1= (person)obj1;
			System.out.print(p1.getName() + "," + p1.getAge() + ",");	//调用get方法输出:肖磊,2,xzz,31,
			}
			
			
	}

	public static ArrayList get(ArrayList A) {
		ArrayList A1 = new ArrayList();	//先新键一个新集合,就是上面的A1
		Iterator I = A.iterator();	//获取迭代器.
		while(I.hasNext()){			//表示如果有元素就继续.
			Object obj = I.next();	//迭代每个元素按顺序.
			if(!A1.contains(obj)){	/*注意contains判断是否包含,底层是用equals方法实现的,当判断自定义对象时,自定义类中
必须重写equals方法,才能有contains判断结果,如果没有重写判断无效.无法除去重复自定义对象.因为自定义是引用数据类型,判断的是值		*/		
				A1.add(obj);
		
				}
		}
		
		return A1;
	}
	
}
