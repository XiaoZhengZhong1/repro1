package com.HashMap;

import java.util.HashMap;

public class next2 {
	/*##18.08_集合框架(统计字符串中每个字符出现的次数)
	* A:案例演示
		* 需求：统计字符串中每个字符出现的次数
		* 1:先定义一个字符串.
		* 2:把字符从转换成字符数组,遍历数组.
		* 3:创建一个HashMap集合,因为如果没有要求,怎么存怎么取,或者排序.用hashMap效率更快.
		* 4:做判断用if,也可以优化用三元运算符.判断集合中键是否包含遍历字符.如果不包含,就添加到集合键中,集合值为1.如果包含键不变,值
		* 要用之前是键的值+1.
		* 5:遍历集合.遍历的是键,输出的时候通过键获取值.
		 */
	public static void main(String[] args) {
		String S = "aaabbbsssabss";
		char[] c = S.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char d : c) {		//注意要在遍历的同时进行判断是否包含,并且添加.d代表所有字符.
			/*if(!hm.containsKey(d)){	//表示集合中键不包含字符d吗.系统会自动装箱,把d封装成对象.
				hm.put(d, 1);			//不包含就把添加进键.值为1
			}else{
				hm.put(d, hm.get(d) + 1);	//包含的话,键不变.值用原理的值加1.
			}
		*/
		//下面用三元运算来优化if.
		hm.put(d, hm.containsKey(d) ? hm.get(d) + 1 :1 );	//键是不变的.因为包含就不加,不包含就添加.值会在重复是增加.
		}
		for (Character d : hm.keySet()) {	/*注意因为遍历的是集合中所有的键,类型当然是字符对象.键名称就是键对象,keySet()
		代表的就是键值对对象,在输出里面还要通过键获取值,*/
			System.out.println(d + "=" + hm.get(d));
		}
				
	
	}

}
