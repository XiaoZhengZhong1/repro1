package cn.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
	//private 私有.本类用
	//默认的  : 本包用	
	//protected 受保护的.本类子类专用.	
	//public 外包可用.
public class classdemo3 {
//通过反射获取有参构造.并运行.
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.demo1.student");
		Constructor con = c.getConstructor(String.class,int.class);//参数要求传递参数类型的class.因为反射操作class
		Object obj = con.newInstance("肖磊",2);
		System.out.println(obj);
	
	//33-09:反射获取构造方法并运行的快捷方式:直接Class类中的newInstance()方法.获取被反射对象的实例.
	//前提是:被反射类中必须有public修饰的空参构造.
		Object obj2 = c.newInstance();
		System.out.println(obj2);

	
	//33-10:暴力反射.强制获取类中私有构造方法(因为破坏了程序,不建议使用)
	//Class类中有Constructor[] con2 = c.getDeclaredConstructors();强制获取所有构造方法.包括私有.
	//Class类中有Constructor con3 = c.getDeclaredConstructor(Class<?>... parameterTypes); 强制获取单个私有方法.	
	//Constructor类中有setAccessible(true);除去私有权限方法.
	Constructor[] con2 = c.getDeclaredConstructors();//强制获取所有构造方法.包括私有.
	Constructor con3 = c.getDeclaredConstructor(String.class);//强制获取单个私有方法.
	con3.setAccessible(true);//除去私有权限方法.
	Object obj3 = con3.newInstance("xiaolei");
	System.out.println(obj3);
	
	
	
	//33-11:反射获取成员变量,并修改变量名.
	//Class类中有  Field[]  getFields();获取所有成员变量方法.返回reflect反射包中的Field类数组
	//Class类中有 Field  getField(String name);获取指定变量方法.(指被反射类中的变量)
	//Filed类中有set(Object obj,Object value);修改值方法.Object obj 指的是必须有对象支持(指newInstance).value修改后的值
	Field[] field = c.getFields();
	for (Field field2 : field) {
		System.out.println(field2);
	}
	Object obj4 = c.newInstance();
	Field f = c.getField("name");//注意只能获取public修饰的变量名
	f.set(obj4, "xiaohai");
	System.out.println(obj4);
	
	
	//33-12:反射获取成员方法.并运行.
	//Class类中有getMethod(String name, Class<?>... parameterTypes) 指定方法参数中传方法名,和方法参数.没有参数可不传
	//和getMethods();获取所有公共方法.包括继承的.返回Method[]  
	//Method方法类中,有invoke(Object obj, Object... args)执行获取引用的方法,两个参数是,方法对象(指newInstance),一
	//个是方法的参数.没有参数可不填.
	Method[] m = c.getMethods();//获取所有公共方法.包括继承的.返回Method[]
	for (Method method : m) {
		//System.out.println(method);
	}
	
	Method m2 = c.getMethod("eat");//指定方法参数中传方法名,和方法参数.没有参数可不传
	Object obj5 = c.newInstance();//obj5是下面方法参数中需要的对象参数.
	m2.invoke(obj5);//表示用Method类的执行引用的方法.执行class对象obj5中的获取的m2方法.
	
	Method m3 = c.getMethod("eat",String.class,int.class);//指定方法参数中传方法名,和方法参数
	Object obj6 = c.newInstance();
	m3.invoke(obj6,"磊哥",20);//执行方法必须有对象支持(指newInstance),执行有参数的方法,传递参数
	
	//33-15:泛型擦除
	//题目要求创建ArrayList<String>
	//往集合中添加Integer类型值
	ArrayList<String> array = new ArrayList<>();
	array.add("肖磊");
	Class cla = array.getClass();//对象获取class对象
	Method m4 = cla.getMethod("add",Object.class);//查看API可看到add方法的参数是<E e>表示然后元素.也就Object
	m4.invoke(array, 100);//执行方法,添加参数值
	//因为无法遍历,所以没有实用价值.(因为有两个类型,增强for循环和迭代都无法遍历)
	//只是考验对反射的理解.
	
	}

}
/*getConstructor(Class<?>... parameterTypes) 参数中表示是class类型的可变参数.因为反射操作是只是class所有类型也要
 * String.class int.class
 * 
*/
