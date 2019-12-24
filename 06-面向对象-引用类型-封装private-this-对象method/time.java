/*
##06.02_面向对象(类与对象概述)(掌握)
* A:我们学习编程是为了什么
	* 为了把我们日常生活中实物用学习语言描述出来
*E:类和对象的概念
	* a:类：是一组相关的属性和行为的集合
	* b:对象：是该类事物的具体体现


B:我们如何描述现实世界事物
	* 属性	就是该事物的描述信息(事物身上的名词)
	* 行为	就是该事物能够做什么(事物身上的动词)
* C:Java中最基本的单位是类,Java中用class描述事物也是如此
	* 成员变量	就是事物的属性
	* 成员方法	就是事物的行为
* D:定义类其实就是定义类的成员(成员变量和成员方法)
	* a:成员变量	和以前定义变量是一样的，只不过位置发生了改变。在类中，方法外。
	* b:成员方法	和以前定义方法是一样的，只不过把static去掉，后面在详细讲解static的作用。
*/
//面向对象,代码执行和编写格式:
//1:测试类.就是第一给class主方法类,测试所有其它的,面向对象的类,是否能顺利运行通过,
//2:基本类,另一个单独的class.在测试类class的大括号之外.基本类就是面向对象的,比喻人类.动物类.比喻: class people(人) 类名只要是合法标识符就行   
//3:基本类class下面编写.成员变量(属性),比喻针对人类中的一个人,国际,姓名,性别,身高,等等都是属性比喻:String name;(姓名),人的姓名也是属性,成员变量,姓名是中文需要是string  
//4:基本类class下面编写,成员方法(行为),比喻一个人,跑步,吃饭,工作,等等都是行为	比喻:public void run(){}		
//5:在测试类主方法里面:创建对象并使用,格式：类名 对象名 = new 类名()  比喻:people xzz = new people();
//6:在测试类主方法里面:调用基本类class下面写的成员变量(属性)格式:对象名.变量名 xzz.name = "肖振中";成员变量调用赋值完成后可在下面依次进行输出,
//7:在测试类主方法里面:调用基本类class下面写的成员方法,(方法不调用不执行,只有调用了才会执行输出):格式:对象名.方法名(...)比喻:xzz.run();
class  time{
	public static void main(String[] args) {
//如何使用对象,创建对象并使用,格式：类名 对象名 = new 类名();  
		time1 miao = new time1();														
//* D:如何使用成员变量呢? 对象名.变量名
		miao.name = "计时器";
	    miao.shuzi = 60;
	System.out.println(miao.name + "......" + miao.shuzi);
// E:如何使用成员方法呢?对象名.方法名(...)
		miao.zhuanDong();
		miao.penPao();
		people xzz = new people();
		xzz.name = "肖振中";
		xzz.gender = "男";
		xzz.age = 31;
		xzz.height = 173;
	System.out.println("姓名:" + xzz.name + " " + "性别:" + xzz.gender + " " + "年龄:" + xzz.age + " " + "身高" + xzz.height );
		xzz.run();
		xzz.study();
		xzz.eat();
		xzz.sleep();
}
}
class time1{											//类名.时间类
     String name;									//成员变量(就是属性)名称,计时器
		int shuzi;										//表现形式(也是属性),数字
	public void zhuanDong(){							//成员方法(就是事物行为),转动
		System.out.println("时间在不停转动");
	}
	public void penPao(){								//成员方法(也是事物行为),奔跑(如,一秒60微秒)
		System.out.println("时间在奔跑");
	}
}
class people{
	String name;
	String gender;
	int age ; 
	int height;
public void run(){
	System.out.println("经常跑步");
	}
public void study(){
	System.out.println("天天学习");
	}
public void eat(){
	System.out.println("吃饭");
	}
public void sleep(){
	System.out.println("睡觉");
	}
}

/*
基本数据类型变量包括哪些:byte,short,int,long,float,double,boolean,char,引用数据类型变量包括哪些:数组,类,接口,枚举,
//注意,运行生成的class文件是基本类,java文件是测试类	
*/
