package com.reflect;
import java.io.BufferedReader;
import java.io.FileReader;


public class text_text {//此类是为了测试text类
//FileReader用来读取字符文件的便捷类。
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("peizhi2"));//创建字符输入流,关联配置文件.
Class<?> class6 = Class.forName(br.readLine());//用反射包下的Class类获取字节码方法,获取整行读取的字符的字节码返回字节码对象
text t = (text) class6.newInstance();//通过字节码对象.调用获取该字节码类的实例对象方法(因为配置文件的内容字节码和text是一样的)
	t.run();//完成习题text类中的要求,用反射的方式运行run方法。
	br.close();
	}

}
