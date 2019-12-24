package com.HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap185_Hashtable {
	/*###18.10_集合框架(HashMap和Hashtable的区别)
	* A:面试题
		* HashMap和Hashtable的区别
			* Hashtable是JDK1.0版本出现的,是线程安全的,效率低,HashMap是JDK1.2版本出现的,是线程不安全的,效率高
			* Hashtable不可以存储null键和null值,HashMap可以存储null键和null值
	* B:案例演示	
		* HashMap和Hashtable的区别*/
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
			hm.put("null", 22);
			hm.put("w", null);
			System.out.println(hm);	//{w=null, null=22}
			
		Hashtable<String, Integer> ht = new Hashtable<>();
			ht.put("null", 11);
			ht.put("ww", null);
			System.out.println(ht);	//报错.java.lang.NullPointerException
	}

}
