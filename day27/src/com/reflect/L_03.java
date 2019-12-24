package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


import java.lang.reflect.Method;
import java.util.ArrayList;

import com.person.person2;

public class L_03 {
	/*##27.05_反射(通过反射获取带参构造方法并使用)
	* Constructor
		* Class类的newInstance()方法是使用该类无参的构造函数创建对象, 如果一个类没有无参的构造函数, 就不能这样创建了,可以调用
		* Class类的getConstructor(String.class,int.class)方法获取一个指定的构造函数然后再调用Constructor类的
		* newInstance("张三",20)方法创建对象
*/
	public static void main(String[] args) throws  Exception {
		Class<?> class3 = Class.forName("com.person.person2");	//获取字符串的类字节码class对象.返回一个class类对象
		Constructor<?>	 c = class3.getConstructor(String.class,int.class);	//获取有参构造.
		person2 p = (person2) c.newInstance("xzz",31);						//通过有参构造创建实例对象.
		System.out.println(p);

	/*	###27.06_反射(通过反射获取成员变量并使用)
		* Field
			* Class.getField(String)方法可以获取类中的指定字段(可见的), 如果是私有的可以用getDeclaedField("name")方法获取,通过set(obj, "李四")方法可以设置指定对象上该字段的值, 如果是私有的需要先调用setAccessible(true)设置访问权限,用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值	
	*/
	
			Field f = class3.getDeclaredField("name");//暴力反射获取字段(因为字段已经被private私有了,)
					f.setAccessible(true);				//除去私有权限.
					f.set(p, "xiaohai");				//修改姓名
	
/*
 * ###27.07_反射(通过反射获取方法并使用)
* Method也是一个类.是反射包下的.Method 提供关于类或接口上单独某个方法（以及如何访问该方法）的信息。所反映的方法可能是类方法或实例方法（包括抽象方法）。 
* * Class.getMethod(String, Class...) 和 Class.getDeclaredMethod(String, Class...)方法可以获取类中的指定方法,调用invoke(Object, Object...)可以调用该方法,Class.getMethod("eat") invoke(obj) Class.getMethod("eat",int.class) invoke(obj,10)
*  */
		Method m = class3.getMethod("eat");	//表示获取class3类中的无参方法,用字节码类中的方法,class3代表字节码对象
				m.invoke(p);	//表示用Method类型的m,调用方法类中的方法invike().运行获取的方法.p代表person类的实例对象.
	
		Method m2 = class3.getMethod("eat",int.class);	/*表示获取有参方法.因为是反射包下的所有参数还是字节码类型(注意
		所有的代码都是有字节码的)*/
				m2.invoke(p, 10);	//表示运行获取的方法.并给参数赋值.
	
	
/*###27.08_反射(通过反射越过泛型检查)
* A:案例演示
	* ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
说明:泛型只在编译期有效,在运行的时候会自动擦除掉.*/
	ArrayList<Integer> list = new ArrayList<>();
			list.add(11);
			list.add(22);
	Class<?> class4 = Class.forName("java.util.ArrayList");//获取数组集合的字节码对象.
	Method m3 = class4.getMethod("add",Object.class);//获取有参方法.方法名是add 参数是任意对象,因为是反射所有是字节码对象
		m3.invoke(list, "abc");//表示调用数组类型中的方法,添加一个字符串.
	System.out.println(list);	
	}
	


}




