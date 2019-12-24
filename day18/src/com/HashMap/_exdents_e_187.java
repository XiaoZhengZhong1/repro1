package com.HashMap;


import java.util.ArrayList;

import com.student.BaseStudent;
import com.student.student2;

/*###18.15_集合框架(泛型固定下边界)(了解内容)
* 1:泛型固定下边界.
* ? super E  它是来自TreeSet(Comparator<? super E> comparator) ,还有很多其它类也重写了这个方法.表达的意思是,父类获取的
* 比较器,集合泛型中有继承关系的其它子类,也可以调用这个比较器进行比较,不用单独创建比较器.


* 2:泛型固定上边界.
* ? extends E  意思是上面new集合里的泛型是父类.下面new的集合里的泛型是上面泛型的子类,叫上泛型是固定的,下泛型继承上泛型.下和上要有继承
* 是出现在addAll(Collection<? extends E> c) 方法中的,ArrayList类中.
	总结:泛型固定上边界,主要想表达的是,两个集合中,泛型类型是继承关系的,可以把集合添加到另一个集合.
* 
* 
* 
* */
public class _exdents_e_187 {
	public static void main(String[] args){
		ArrayList<student2> a = new ArrayList<>();
				a.add(new student2("肖磊",2));
		ArrayList<BaseStudent> a2 =new ArrayList<>();
				a2.add(new BaseStudent("李霞",24));	
					a.addAll(a2);
					
	}
}
