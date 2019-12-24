package com.Thread2;

public class D01_Z_eHan {
	/*###25.01_多线程(单例设计模式)(掌握)
	* 单例设计模式：保证类在内存中只有一个对象。

	* 如何保证类在内存中只有一个对象呢？
		* (1)控制类的创建，不让其他类来创建本类的对象。private私有构造方法.
		* (2)在本类中定义一个本类的对象。Singleton s;
		* (3)提供公共的访问方式。  public static Singleton getInstance(){return s}
	* 单例写法两种：
		* (1)饿汉式 开发用这种方式。
		* (2)懒汉式 面试写这种方式。多线程的问题？懒汉式,单例的延迟加载模式* 
		* 锇汉式和懒汉式的区别?
		* 1:饿汉式是以空间换时间.(先在方法中创建对象,浪费了空间.但是调用时可以直接调用,节省了时间.)时间比空间宝贵.
		* 懒汉式以时间换空间.(在方法中做判断,需要时再创建对象.节省了空间.有的时候就每次调用都要创建对象.浪费了时间.)亏了.
		*2:多线程访问时,饿汉式不会创建多个对象,但懒汉式会.(当懒汉式判断后创建对象前,遇到休眠.多线程会一起等待.休眠过后一起创建对象.)
		* */
	
	public static void main(String[] args) {
			//1:饿汉式:	
				eHan ah	= eHan.getE();	//表示类名点调用获取方法,获取eHan类中公共静态最终对象.e,把对象地址值赋值给ah
				System.out.println(ah);	//打印这个地址值.
	
			//2:懒汉式:
				lanHan	lh2 = lanHan.getLh();
				System.out.println(lh2);
	
			//3:也是属于单列设计模式的(了解内容)
			danlie d2 = danlie.d;
			System.out.println(d2);
	}

}
//多线程(单例设计模式)(掌握)单例设计模式：保证类在内存中只有一个对象。
//1:饿汉式 开发用这种方式。.先在类中创建公共静态唯一对象(浪费内存).对外提供get获取方法(对外节省了时间)
class eHan{ //设计模式要求,类在内存在只有一个对象.(就是不能在其它类创建对象,可以私有构造方法.(所有在其它类创建对象,都是通过构造方法))
	private eHan (){}   //私有构造方法,不让其它类创建本类对象.
		public static eHan getE() {		//因为外面无法创建本类对象(因为私有了构造方法),所有方法也只能类名点调用.也必须是静态的
		return e;
	}
		public static final eHan e = new eHan();	/*在本类中创建一个对象,用final修饰表示是最终对象.不能被修改.
		被static修饰的表示是静态共享的.可以类名点调用.被public修饰表示是公开的,可以不同类,不同包下使用.(使用方式是对外提供一个
		公共的方法访问方式Alt+Shift+s+r生成get方法)*/
		

}

//2:懒汉式 面试写这种方式。多线程的问题？懒汉式,单例的延迟加载模式*
//在方法中做判断,需要时再创建对象.节省了空间.用时候就每次调用都要先比较再 看结果是否,创建对象.浪费了时间.
class lanHan{
	private lanHan(){}
	public static  lanHan lh;	//先声明一个变量.
	public static lanHan getLh() {	//对外提供一个get获取方法.
		if(lh == null){				//做判断.如果lh没有地址值说明没有创建对象,
			lh = new lanHan();		//那就创建一个对象.
		}
		return lh;					//把地址值返回.
	}
}

//3:另外的单例设计模式(了解)
class danlie{
	private danlie(){}	//私有构造方法.
	public static final danlie d = new danlie(); //表示公共静态最终对象.


}


