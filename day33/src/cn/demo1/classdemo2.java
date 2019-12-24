package cn.demo1;

import java.lang.reflect.Constructor;

public class classdemo2 {
/*通过反射class.forName()获取student类class对象,对象.getConstructor()获取构造方法.返回以构造类型constructor 对象;
 * 运行构造对象中方法newInstance()获取实例方法,返回一Object对象.
 * 用student强转Object对象.再用强转后对象调用student类中成员方法和变量.*/
	public static void main(String[] args) throws Exception {
	Class c	= Class.forName("cn.demo1.student");//通过反射class.forName()获取student类class对象
	Constructor ctr = c.getConstructor();	
	//没加s,是获取指定公共构造,API中显示方法参数是Object...obj是可变参数,可传可不传.不传,表示获取空参构造.
	System.out.println(ctr);		//运行结果 cn.demo1.student()
	Object obj = ctr.newInstance();//运行构造对象中方法newInstance()获取实例方法,返回一Object对象.
	System.out.println(obj);		//stuedent [name=null, age=0]
	student s = (student)obj;		//用student强转Object对象
	s.eat();						//再用强转后对象调用student类中成员方法和变量.
	
	
	//下面getConstructors();加了s是获取所有公共的构造.
//	Constructor[] con = c.getConstructors();//constructors末尾加了s,表示复数.就是多个.获取多个公共构造对象.
//	for (Constructor co : con) {
//		System.out.println(co);//运行结果,一个空参构造方法,一个有参构造方法.(只能获取public修饰的公共构造)
//	}
	
	}

}
