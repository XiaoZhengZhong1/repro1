package com.reflect;

import java.lang.reflect.Proxy;

/*###27.11_反射(动态代理的概述和实现)
* A:动态代理概述
	* 代理：本来应该自己做的事情，请了别人来做，被请的人就是代理对象。
	* 举例：春节回家买票让人代买
	* 动态代理：在程序运行过程中产生的这个对象,而程序运行过程中产生对象其实就是我们刚才反射讲解的内容，所以，动态代理其实就是通过反射来生成一个代理
		
	* 在Java中java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口，通过使用这个类和接口就可以生成动态代理对象。JDK提供的代理只能针对接口做代理。我们有更强大的代理cglib，Proxy类中的方法创建动态代理类对象
	* public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
	* 最终会调用InvocationHandler的方法
	* InvocationHandler Object invoke(Object proxy,Method method,Object[] args)*/
public class L_05CS {//测试类

	public static void main(String[] args) {
		L_05impl05 L = new L_05impl05();
				L.add();
				L.delete();
	System.out.println("--------------------");
	L_05JK jk = new L_05JK(L);//创建代理类对象,代理L.
	//JDK提供的代理只能针对接口做代理,所以返回的是一个接口,就是代理对象的根接口.
	L_05 D = (L_05) Proxy.newProxyInstance(L.getClass().getClassLoader(),L.getClass().getInterfaces(), jk);
		D.add();
	System.out.println();
		D.delete();
	}

}
