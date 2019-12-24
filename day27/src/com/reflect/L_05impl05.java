package com.reflect;
/*###27.11_反射(动态代理的概述和实现)
* A:动态代理概述
	* 代理：本来应该自己做的事情，请了别人来做，被请的人就是代理对象。
	* 举例：春节回家买票让人代买
	* 动态代理：在程序运行过程中产生的这个对象,而程序运行过程中产生对象其实就是我们刚才反射讲解的内容，所以，动态代理其实就是通过反射来生成一个代理
		
	* 在Java中java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口，通过使用这个类和接口就可以生成动态代理对象。JDK提供的代理只能针对接口做代理。我们有更强大的代理cglib，Proxy类中的方法创建动态代理类对象
	* public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
	* 最终会调用InvocationHandler的方法
	* InvocationHandler Object invoke(Object proxy,Method method,Object[] args)*/
public class L_05impl05 implements L_05 {//实现接口.注意L_05接口写完一定要保存.不然这里实现会报错.

	@Override
	public void add() {
/*因为添加和删除功能是实现L_05接口重写的方法.在使用添加和删除前后,可能都要进行权限校验和日志记录.所以每个实现该接口的类都要修改原代码
	增加功能太麻烦,所以就有了动态代理,把固定的权限校验和日志记录,让动态代理在调用实现类的方法,前后进行执行*/	
		//System.out.println("权限校验");
		System.out.println("添加功能");
	//	System.out.println("日志记录");
	
	}

	@Override
	public void delete() {
		//System.out.println("权限校验");
		System.out.println("删除功能");
		//System.out.println("日志记录");
	}

}
