package cn.demo2_reflect_config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class CeShi {
/*Ҫ��:�ڱ�������,����ʱ����������3�����е�һ������.Ҫ��ͨ����ȡ�����ļ�,���浽����,��ͨ������ִ��Ҫ���еķ���.
 * 1:����3����.����,�Է�����.  ѧ����.ѧϰ����.   �ϰ���,�ϰ෽��.
 * 2:����Ŀ�����¼�һfile,����д�����ļ�.
 * 3:����IO����ȡ�����ļ�
 * 4:����properties����
 * 5:���ļ����������ص�����,����.
 * 6:�ü����еĻ�ȡ���з�����ȡ������ͷ���
 * 7:��ȡclass����(�����е�������class����).newInstance
 * 8:��ȡ������(���뼯���л�ȡ�ķ�����)
 * 9:�л�ȡ���÷���invoke()
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
