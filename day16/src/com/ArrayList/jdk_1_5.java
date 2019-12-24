package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.xzz.bean.person;


public class jdk_1_5 {
	/*###16.13_集合框架(增强for的概述和使用)(掌握)
	* A:增强for概述
		* 简化数组和Collection集合的遍历
	* B:格式：
	* 
			for(元素数据类型 变量 : 数组或者Collection集合) {
				使用变量即可，该变量就是元素
			}
	* C:案例演示
		* 数组，集合存储元素用增强for遍历
	* D:好处
		* 简化遍历
		* 增强for循环底层依赖的是Iterator迭代器.
		* 
		* */
	public static void main(String[] args) {
		int[] a = {11,22,33,44,55};
			for(int i:a){		//fore----Alt+/----能自动生成增强for循环格式.----i 表示是每个元素.
				System.out.println(i + ",");	//11,22,33,44,55,
			}
			ArrayList<person> A2 = new ArrayList<>(); 
			A2.add(new person("肖磊",2));
			A2.add(new person("肖磊",2));
			A2.add(new person("肖磊",2));
			for (person person : A2) {		//表示person里面记录的是每个自定义对象.
				System.out.println(person);
			}
		
				ArrayList<String> A = new ArrayList<>();
					A.add("a");
					A.add("b");
					A.add("c");
					A.add("d");
					for (String string : A) {		//string表示是每个字符串.
					System.out.println(string);
				}
/*###16.15_集合框架(三种迭代的能否删除)(掌握)
*1:普通for循环,可以删除,但是索引要--
*2:迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
*3:增强for循环不能删除			}*/
//1:先用上面是a集合演示,普通for循环,删除元素.		
			for (int i = 0; i < A.size(); i++) {
				if("c".equals(A.get(i))){	//表示如果"c"和A集合中获取的循环元素值有相同的就继续
					A.remove(i--);	/*表示i的元素值先删除,i索引再自减.因为ArrayList是由数组实现的,增加和删除都回整体向前或者
向后移动,如果有重复的元素移动到i索引上去了,i到循环里++,就会漏删.所有要i--返回去把刚刚删除的索引值再循环比较一次.	*/			
				}
			}
				System.out.println(A);//[a, b, d]
//2:用迭代器Iterator删除.					
				Iterator<String> I2 = A.iterator();
					while(I2.hasNext()){
						if("b".equals(I2.next())){
							//A.remove(I2.next());此行会出现并发修改异常,不能在迭代中用集合调用增加和删除的方法
							I2.remove();/*remove()是迭代器Iterator中的方法,是和hasNext(),next(),remove()一起
配合使用,remover()是删除迭代中的最后一个,也就是当前迭代的对象,满足条件进来的对象.	*/					
						}
					}
					System.out.println(A);//[a, d]
//3:增强for循环不能删除						
		for (String string : A) {
			if("a".equals(string)){
			//	A.remove(string); 会出现并发修改异常.因为它没有迭代器.调用不了迭代器的remove()方法
			}
		}			
/*#16.16_集合框架(静态导入的概述和使用)(掌握)
* A:静态导入概述:是jdk1.5新特性中唯一的一个败笔.不实用.
* B:格式：
	* import static 包名….类名.方法名;
	* 可以直接导入到方法的级别
* C:注意事项
	* 方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。*/
/*静态导入格式演示:
 * 没加静态:import java.util.ArrayList;
 * 加了静态:import static java.util.Arrays.sort;	//表示导入静态Arrays包中的sort排序的方法.如果sort的位置是 * 代表所有方法
 * 导入了静态后,方法中可以省略类名Arrays
 * */

					
				
/*#16.17_集合框架(可变参数的概述和使用)(掌握)
* A:可变参数概述
	* 定义方法的时候不知道该定义多少个参数
* B:格式
	* 修饰符 返回值类型 方法名(数据类型…  变量名){}
* C:注意事项：
	* 这里的变量其实是一个数组
	* 如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个*/
	int[] c = {56,66,77,88,99};
		print(c);
		print1(1,2,3,4,5,6,7,8,9);
	}
	public static void print(int[] c){	//这是不可变的数组参数.
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	public static void print1(int ... c){	/*这是可变的数组参数.也是相当于一个数组参数用 ...三个点代替了[],三给点代表
											可以传长度可变的参数,在调用的时候传递.														*/
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
//今天学了jdk1.5的三个特性,1一个增强for循环,2一个静态导入.3可变参数------以前还有一个自动装箱.
}





