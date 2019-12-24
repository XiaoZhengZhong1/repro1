package com.HashMap;

import java.util.HashMap;

import com.student.student2;

public class next {

	public static void main(String[] args) {
/*###18.05_集合框架(HashMap集合键是Student值是String的案例)
* A:案例演示
	* HashMap集合键是Student值是String的案例*/
	HashMap<student2, String> hm = new HashMap<>();
		hm.put(new student2("肖磊",2), "肖冲");//注意student类里面是封装了姓名和年龄的.所有想要把姓名和年龄当作一个整体泛型
		hm.put(new student2("肖振中",31), "肖冲");
		hm.put(new student2("李霞",24), "韩田");
		hm.put(new student2("李霞",24), "韩田");
	System.out.println(hm);
	
	
	
	}

}
