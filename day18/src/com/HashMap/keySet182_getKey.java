package com.HashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class keySet182_getKey {
	/*###18.03_集合框架(Map集合的遍历之键找值)
	* A:键找值思路：
		* 获取所有键的集合
		* 遍历键的集合，获取到每一个键
		* 根据键找值
	* B:案例演示
		* Map集合的遍历之键找值	Map双列集合接口中是没有Iterator迭代方法的.
		*
		* * d:获取功能
			* Set<Map.Entry<K,V>> entrySet():
			* V get(Object key):根据键获取值
			* Set<K> keySet():获取集合中所有键的集合
			* Collection<V> values():获取集合中所有值的集合
		* */
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();
				mp.put("肖磊", 2);
				mp.put("李霞", 24);
				mp.put("肖振中",31);
/*现在想要迭代,但是Map接口集合中没有迭代方法,HashMap类实现了Map接口,但是也没有迭代方法.所以要找HashMap类中keySet():获取集合中
	所有键的键,API中显示返回的是Set<K>接口的对象,Set接口中有Iterator迭代方法.可以用方法对象获取调用迭代*/
	
//:Map双列集合遍历-----keySet()方法-----Iterator迭代器遍历.	
				//以下讲到的方法有:keyget(); get(Key)
				Set<String> S = mp.keySet();	//调用方法,获取集合中所有键的集合,并赋值给S集合.
				Iterator<String> I = S.iterator();	//用S集合获取迭代器.并把集合赋值到迭代器I中.
					while(I.hasNext()){				//迭代器中集合是否有元素.
						String key = I.next();		//获取迭代器中的每一个键. 赋值给key,因为里面存储的只有键.
						Integer V = mp.get(key);	//获取所有的键映射的值,并赋值给V.
					System.out.print(key + "=" + V + " ");	//输出所有的键和值.
					//肖振中=31 李霞=24 肖磊=2 
					}
					System.out.println();//表示换行
//方式1:keySet()增强for循环遍历.					
					for (String k : mp.keySet()) {//mp.keySet();是获取所有键,没有赋值算是匿名集合名了,k表示所有的键
						System.out.print(k + "=" + mp.get(k) + ",");
					//肖振中=31,李霞=24,肖磊=2,
					}
			System.out.println();		
/*###18.04_集合框架(Map集合的遍历之键值对对象找键和值)
* A:键值对对象找键和值思路：
	* 获取所有键值对对象的集合
	* 遍历键值对对象的集合，获取到每一个键值对对象
	* 根据键值对对象找键和值
* B:案例演示
	* Map集合的遍历之键值对对象找键和值*/

/*Map双列集合遍历之键值对对象找键和值-----所谓键值对是一个接口方法,把集合中的所有键和值当作对象返回,返回的值类型中的泛型是这个接口方法
 * Set<Entry<String,Integer>>,因为所有的键和值都被当作一个对象了,那就引用整个接口方法,把整个接口方法当作引用数据类型,这个接口方法
 * EntrySet()是Map接口中的接口Map.EntrySet().----因为是Map接口中的接口,相当于是外接口中的内接口,访问时要通过Map.外部接口
 * 访问里面的内接口entry,所有格式才是Map.Entry(),Map中是有entry()方法的,mp可以调用,调用返回的的键值对对象写全Map.Entry()
 * 导包后可以省去Map.导的是import java.util.Map.Entry;*/
				
		
			Set<Map.Entry<String,Integer>>	mn = mp.entrySet();	//调用键值对方法,返回一个键值对对象mn.
			//因为Set<>类中是重写了Iterator迭代方法的,所有其对象 mn 可以调用迭代.			
//Map双列集合遍历------Entry()方法.-------Iterator迭代器遍历
		Iterator<Map.Entry<String, Integer>> I1 = mn.iterator();	//用键值的对象,获取迭代器.把对象赋值迭代器I1
					while (I1.hasNext()) {	//迭代器中对象是否为空.
						Map.Entry<String, Integer> me = I1.next();	//把所有迭代对象,赋值给me.
						String S1 = me.getKey();	//获取me中的键.
						Integer IT = me.getValue();	//获取me中的值.
					System.out.print(S1 + "=" + IT + ",");
					//肖振中=31,李霞=24,肖磊=2,
					}

					System.out.println();

					
					
					
					
//2:entry();方法.增强for循环.
			for (Map.Entry<String, Integer> me2 : mp.entrySet()) {/*表示类型是整个键值对,变量名me代表所有键和值.
			键值对方法的返回值名称,只是名称,只有引用类型里的变量me2才能代表所有键和值.注意Map.Entry<>是接口,接口的方法必须都是
			抽象的,抽象的方法是不能被实例化的,而下面输出中能被调用,说明entry实现了该接口.才能实例化调用*/
				System.out.print(me2.getKey() + "=" + me2.getValue() + ",");  /*表示获取变量中的键和值getKey()
				getValue()都是entry中的方法.me2是其变量,可以调用其方法.*/
			}
			//肖振中=31,李霞=24,肖磊=2,
//次中知识点:Map.Entry接口Map接口中的接口. entry()键值对方法,把键和值变成对象.接口中 getKey()获取键方法. getValue()获取值方法
			
	}

}
