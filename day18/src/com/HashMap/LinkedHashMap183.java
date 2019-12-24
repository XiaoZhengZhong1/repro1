package com.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap183 {
/*###18.06_集合框架(LinkedHashMap的概述和使用)
* A:案例演示
	* LinkedHashMap的特点
		* 底层是链表实现的可以保证怎么存就怎么取*/

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> LHp = new LinkedHashMap<>();	//创建链表双列集合对象,
			LHp.put("李霞", 24);
			LHp.put("肖磊", 2);	
			LHp.put("肖振中", 24);
	System.out.println(LHp);	//{李霞=24, 肖磊=2, 肖振中=24} 能保证怎么存怎么取.
	
	}

}
