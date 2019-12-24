package com.ArrayList;

import java.util.ArrayList;

import com.xzz.bean.person;

public class ArrayList164_ArrayList {
/*###16.19_集合框架(集合嵌套之ArrayList嵌套ArrayList)(掌握)
* A:案例演示
	* 集合嵌套之ArrayList嵌套ArrayList*/
	public static void main(String[] args) {
		ArrayList<ArrayList<person>> L = new ArrayList<>();	//集合中嵌套集合,相当于集合里还有个ArrayList<person> L2 = new ArrayList<>();
				ArrayList<person> L2 = new ArrayList<>();
						L2.add(new person("肖磊",2));
				
						L2.add(new person("肖磊",2));
						
						L.add(L2);
						
					for (ArrayList<person> a : L) {	//集合嵌套,遍历当然也需要嵌套.
						for (person b : a) {	//注意上行的变量 a 代表的就是上行泛型里的每个person,相当于定义了对象.
					System.out.print(b + ",");	//person [name=肖磊, age=2],person [name=肖磊, age=2],
						}
					}
	}

}
