package cn.demo2_reflect_config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class CeShi {
/*要求:在本测试类,不定时的运行其它3个类中的一个方法.要求通过读取配置文件,储存到集合,再通过反射执行要运行的方法.
 * 1:创建3个类.人类,吃饭方法.  学生类.学习方法.   上班族,上班方法.
 * 2:在项目里面新键一file,用来写配置文件.
 * 3:创建IO流读取配置文件
 * 4:创建properties集合
 * 5:把文件输入流加载到集合,关流.
 * 6:用集合中的获取所有方法获取流中类和方法
 * 7:获取class对象(集合中的类名的class对象).newInstance
 * 8:获取方法名(传入集合中获取的方法名)
 * 9:中获取引用方法invoke()
 * */
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("config.properties");
		Properties pro = new Properties();
		pro.load(fr);
	    fr.close();
		String CN = pro.getProperty("className");
	    String MD = pro.getProperty("methodName");
	    Class c = Class.forName(CN);
	   Object obj = c.newInstance();
	    Method md = c.getMethod(MD);
	    md.invoke(obj);
	
	}

}
