package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class next5 {
/*###22.14_IO��(Properties�ĸ�������ΪMap���ϵ�ʹ��)(�˽�)
* A:Properties�ĸ���----��Hashtable������.
	* Properties ���ʾ��һ���־õ����Լ���
	* Properties �ɱ��������л�����м��ء�
	* �����б���ÿ���������Ӧֵ����һ���ַ����� 
* B:������ʾ
	* Properties��ΪMap���ϵ�ʹ��
	
###22.15_IO��(Properties�����⹦��ʹ��)(�˽�)
* A:Properties�����⹦��*/
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Properties��ΪMap���ϵ�ʹ��
	Properties p = new Properties();
		p.put("aaa", 123);
	System.out.println(p);
	
/*###22.16_IO��(Properties��load()��store()����)(�˽�)
* A:Properties��load(InputStream inStream)����, ���������ж�ȡ�����б�����Ԫ�ضԣ��� 
��store(OutputStream out, String comments)���ʺ�ʹ�� load(InputStream) �������ص� Properties ���еĸ�ʽ��
���� Properties ���е������б�����Ԫ�ضԣ�д����� ��.
* B:������ʾ
	* Properties��load()��store()����	*/
	Properties p2 = new Properties();
		p2.load(new FileInputStream("a5.txt"));	//��ʾ���ļ��е����ݶ���p2������.
		System.out.println(p2);		  //�������
		p2.setProperty("xiaolei", "3");//��ʾ�޸��ļ��еļ���ֵ.ע�ⷽ����Ҫ�����ֵ�����ַ�������.;�����ڹ����������޸������ļ�
		System.out.println(p2);		   //��ʾ�������޸Ĺ�����,���������ļ�a5.txt������û���޸Ĺ���.
		p2.store(new FileOutputStream("a5.txt"),"xxx");		//��ʾ���޸ĺ�����д���ļ���."xxx"��һ����¼д��ʱ��ı���
		//����store������,�ļ�����Ҳ�޸Ĺ�����
	
	}

	
}
