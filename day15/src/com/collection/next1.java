package com.collection;

import java.util.ArrayList;
import java.util.List;

public class next1 {
	/*###15.10_集合框架(List集合存储学生对象并遍历)
	* A:案例演示
		* 通过size()和get()方法结合使用遍历。*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List L = new ArrayList();
			L.add(new xt2("磊哥",2));
			L.add(new xt2("lx",24));
			L.add(new xt2("xzz",31));
			for (int i = 0; i < L.size(); i++) {
				System.out.println(L.get(i));
				xt2 x = (xt2)L.get(i);		//向下转型获取getName,getAge
				System.out.println(x.getName() + "----" + x.getAge());
			}
	
	
	
	
	}

}
