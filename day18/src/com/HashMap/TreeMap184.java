package com.HashMap;

import java.util.Comparator;
import java.util.TreeMap;

import com.student.student2;

public class TreeMap184 {
	/*###18.07_集合框架(TreeMap集合键是Student值是String的案例)
	* A:案例演示
		* TreeMap集合键是Student值是String的案例*/
	public static void main(String[] args) {

//排方法1:new Comparator<student2>()//注意Comparator是一个比较器接口,是不能被实例化的,但是可以当作参数传递进来,多态.重写方法.
		TreeMap<student2, String> tm = new TreeMap<>(new Comparator<student2>() {

			@Override
			public int compare(student2 s1, student2 s2) {	//s1和s2代表下面添加的匿名对象变量
				int num = s1.getAge() - s2.getAge();//注意比较年龄用-.
				return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
			}
		});
			tm.put(new student2("李霞",24), "韩田");
			tm.put(new student2("肖磊",2), "肖冲");
			tm.put(new student2("肖振中",31), "肖家冲");
			System.out.println(tm);
	//{student [name=肖磊, age=2]=肖冲, student [name=李霞, age=24]=韩田, student [name=肖振中, age=31]=肖家冲}

			
/*TreeMap是可以排序的,根据姓名,或者年龄排序,年龄是根据码表值进行比较排序的,有两种方法.1:TreeMap类中是有比较器的方法的,可以new一个
 * 匿名对象,在上面创建TreeMap对象时,把比较器的匿名对象也传给对象tm,重写比较器的比较方法,自定义比较内容.    2:让自定义类student2
 * 实现comparable可比性接口,并重新里面的compareto比较方法,自定义以年龄还是以姓名为主要比较方法.*/

/*方法2:在自定义student类中,实现可比性接口,重新比较方法:public class student2 implements Comparable<student2>*/	
	}

}
