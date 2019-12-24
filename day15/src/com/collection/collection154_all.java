package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection154_all {
/*##15.05_集合框架(Collection集合的带All功能测试)
* A:案例演示
* 
		带All的功能演示
		
		boolean addAll(Collection c)-----添加一个集合的意思.
		boolean removeAll(Collection c)----删除调用集合中包含被调用集合里面的元素相同的元素.
		boolean retainAll(Collection c)----和上面相反,是保留调用集合中包含被调用集合里面的相同元素值,包括重复的.
		boolean containsAll(Collection c)-----判断调用集合中是否包含被调用集合,是包含被调用集合的所有元素.
*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//1:addAll(Collection c)-----添加一个集合的意思		
		Collection c1 = new ArrayList();
				c1.add("a");
				c1.add("b");
				c1.add("c");
		Collection c2 = new ArrayList();
				c2.add("d");
				c2.add("e");
				c2.add("f");
	c1.addAll(c2);	//表示添加一个集合c2,把c2中的每一个元素添加进来.c1.add(c2);表示把c2当作对象添加进来,包含括号[d e f]
		System.out.println(c1);//[a, b, c, d, e, f]
	
//2:boolean removeAll(Collection c)------表示删除一个集合.意思是a.removeALL(b),删除a集合中所有和b集合相同的元素.	
		Collection c3 = new ArrayList();
		c3.add("a");
		c3.add("b");
		c3.add("c");
		Collection c4 = new ArrayList();
		c4.add("d");
		c4.add("a");
		boolean a1 = c3.removeAll(c4);	//判断c3中是否有c4中相同的元素值,并删除.叫删除交集.
		System.out.println(a1);	//输出结果是:true.因为c3中有c4中的a,删除在看有交集的,只要有交集结果就是true.
		System.out.println(c3);	//[b, c]

//3:boolean retainAll(Collection c)----和上面相反,是保留调用集合中包含被调用集合里面的相同元素值,包括重复的
	Collection c5 = new ArrayList();
		c5.add("a");
		c5.add("b");
		c5.add("c");
	Collection c6 = new ArrayList();
		c6.add("a");
		c6.add("e");
		c6.add("f");
/*注意保留交集,看最终调用者比喻c5.retainAll(c6)调用c5的结果会不会改变,改变就是true,不变就是false.如果判断没有交集,会返回一个[]
给c5,c5输出也将是一个空窜,所有即使没有交集,c5的结果还是改变了,结果还是true*/
	boolean a2 = c5.retainAll(c6);//判断c5中是否包含c6中相同的元素值,并保留相同,删除不同.叫保留交集
	System.out.println(a2);//true
	System.out.println(c5);//[a]
	
//4:boolean containsAll(Collection c)-----判断调用集合中是否包含被调用集合,是包含被调用集合的所有元素	
	Collection c7 = new ArrayList();
	c7.add("a");
	c7.add("b");
	c7.add("c");
	Collection c8 = new ArrayList();
	c8.add("a");
	c8.add("b");
	c8.add("c");
	boolean a3 = c7.containsAll(c8);	//判断c7中是否包含c8的全部元素
	System.out.println(a3);	//true
	}

}
