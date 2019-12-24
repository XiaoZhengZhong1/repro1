package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class next3 {
	/*###17.08_集合框架(练习)
	* 将集合中的重复元素去掉*/
	
	public static void main(String[] args) {
/*1;先创建一个ArrayList对象,里面添加重复值.
 * 2:获取一个删除重复元素的方法,getxxx(),生成方法.
 * 3:在方法里面创建一个HashSet对象,把ArrayList对象addall()添加进来,就去除了重复
 * 4:把Arraylist对象clera()清空,再把去除重复的HastSet对象addall()添加进来.
 * 5:输出ArrayList对象
 * */
			List<String> A = new ArrayList<>();
				A.add("a");
				A.add("a");
				A.add("b");
				A.add("b");
				A.add("c");
				A.add("c");
				A.add("c");
				getX(A);	//因为方法中会把重复删除,把A清空,再把删除重复后的,添加到A中,所以获取的还是A.
	System.out.println(A);	//[b, c, a]
	
	}

	public static void getX(List<String> A) {
		HashSet<String> hs = new HashSet<>();
			hs.addAll(A);
			A.clear();
			A.addAll(hs);
	
	}

}
