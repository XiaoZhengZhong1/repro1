package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap181 {
	/*###18.01_集合框架(Map集合概述和特点)
	* A:Map接口概述
		* 查看API可以知道：
			* 将键映射到值的对象
			* 一个映射不能包含重复的键
			* 每个键最多只能映射到一个值
	* B:Map接口和Collection接口的不同
		* Map是双列的,Collection是单列的
		* Map的键唯一,Collection的子体系Set是唯一的
		* Map集合的数据结构值针对键有效，跟值无关;Collection集合的数据结构是针对元素有效
		
	###18.02_集合框架(Map集合的功能概述)
	* A:Map集合的功能概述
		* a:添加功能
			* V put(K key,V value):添加元素。
				* 如果键是第一次存储，就直接存储元素，返回null
				* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		* b:删除功能
			* void clear():移除所有的键值对元素
			* V remove(Object key)：根据键删除键值对元素，并把值返回
		* c:判断功能
			* boolean containsKey(Object key)：判断集合是否包含指定的键
			* boolean containsValue(Object value):判断集合是否包含指定的值
			* boolean isEmpty()：判断集合是否为空
			*collcetion<> Map.values();		//获取所有的值.
		* e:长度功能
			* int size()：返回集合中的键值对的个数
		
*/
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();	/*泛型里有两个引用数据类型,代表Map是双列集合.第一个泛型引用类型是键
第二个引用数据类型是值,键的值.	 put(K key,V value):添加元素。k代表键,v代表值.一次添加两个用put添加,	*/		
		
		Integer I1 = mp.put("肖磊",3);	//put添加方法显示返回结果是Integer类型的.
		Integer I2 = mp.put("肖磊",2);
		Integer I3 = mp.put("肖磊",4);

//1:put();添加,返回的是被覆盖的值,如果没有键和值,返回的都是null,如果有相同的键和或者值,键是唯一,值会被覆盖.		
		mp.put("肖振中",31);
		mp.put("李霞",24);
		System.out.println(I1);	//null	证明当mp集合中没有添加值时,第一次输出的是初始化值.
		System.out.println(I2);	//3		//虽然I2添加的是2,但是输出的确是上次的I1的值3,说明输出的是被覆盖的值.
		System.out.println(I3);	//2		
		System.out.println(mp);	/*{肖振中=31, 李霞=24, 肖磊=4}	说明键是唯一的不可重复,值会被后添加的覆盖.输出结果
		 							显示 肖磊=4 .等于号是自动生成的. 每个键最多只能映射到一个值				*/
//2:size();显示键的个数,如值无关.
		System.out.println(mp.size());	//3		虽然一次添加的是两个元素,但是系统把它看成一个整体,

//3:remove()根据键,删除键和值.
		Integer I4 = mp.remove("肖振中");	//remove方法显示,返回结果是Integer类型.表示根据键删除键值对元素
		System.out.println(I4);	//31
		System.out.println(mp);	//{李霞=24, 肖磊=4}	输出证明虽然只删除的是值,键也没被输出.

//4:判断是否包含键.containsKey();
		
		boolean b = mp.containsKey("肖振中");		//表示判断集合中是否包含 键
			System.out.println(b);		//false  因为被删除了,没有没有,就不包含.

//5:values获取所有的值.
			System.out.println(mp.values());
	}
//本节内容一共提到 put()添加方法, remove()删除方法, containsKey()是否包含判断方法.values()获取所有值方法,
}
