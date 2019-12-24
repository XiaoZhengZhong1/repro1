package com.HashMap;

import java.util.HashMap;

import com.student.student2;

public class next3 {
/*###18.09_集合框架(集合嵌套之HashMap嵌套HashMap)
* A:案例演示
	* 集合嵌套之HashMap嵌套HashMap
	* 0:先得定义两个集合,添加键student2,和值String(键的归属地);
	* 1:外集合键是年级,值的年级给个数.
	* 2:内集合就是student,值是具体的年级.
	* */
	
	public static void main(String[] args){
		HashMap<student2, String> hm1 = new HashMap<>();	//定义内集合student集合
			hm1.put(new student2("李霞", 24), "韩田村");
		HashMap<student2, String> hm2 = new HashMap<>();
			hm2.put(new student2("肖振中",31 ), "施畈村");
		
//下面把学生嵌套进年级里面去.下面定义的是年级对象hm,里面的键是嵌套上面的学生对象.	
		HashMap<HashMap<student2,String>,String> hm = new HashMap<>();	/*定义外集合年级集合.年级集合的键是所有的
		student2,值是年级的个数.所以上面定义的student集合,就是年级的类型.*/
		hm.put(hm1, "二年级");
		hm.put(hm2, "三年级");
//用for循环嵌套,输出上面的集合嵌套.	
			int index = 0;
		for (HashMap<student2,String> h : hm.keySet() ) {/* 表示类型就是所以的学生对象,变量是h,类型名称就是所有键.
	hm.keySet()代表年级中所有的键,外循环外面是要找出所有学生对应的年级*/
			String value = hm.get(h);	//h代表所有的学生.用hm年级调用获取方法.表示获取所有学生对应的年级.
				index++;
			for (student2 key :h.keySet()) {	/*内循环是循环学生,获取的是学生的值,学生姓名和年龄的被封装在student2里面了,值
		就是学生归属地了,类型当然也是学生类,变量就是所有学生,名称就是学生中的键,内循环我们要找的是值,归属地*/
					String value2 = h.get(key);	//获取所有学生的归属地.
			
					System.out.print(key + "=" + value2 + "=" + value + ",");//注意一定要在循环里面输出,循环结束就没有了
			//student [name=肖振中, age=31]=施畈村=三年级,student [name=李霞, age=24]=韩田村=二年级,
			index++;
			System.out.println(index);
			}
		
	}
	
	}
}
