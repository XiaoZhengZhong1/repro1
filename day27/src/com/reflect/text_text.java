package com.reflect;
import java.io.BufferedReader;
import java.io.FileReader;


public class text_text {//������Ϊ�˲���text��
//FileReader������ȡ�ַ��ļ��ı���ࡣ
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("peizhi2"));//�����ַ�������,���������ļ�.
Class<?> class6 = Class.forName(br.readLine());//�÷�����µ�Class���ȡ�ֽ��뷽��,��ȡ���ж�ȡ���ַ����ֽ��뷵���ֽ������
text t = (text) class6.newInstance();//ͨ���ֽ������.���û�ȡ���ֽ������ʵ�����󷽷�(��Ϊ�����ļ��������ֽ����text��һ����)
	t.run();//���ϰ��text���е�Ҫ��,�÷���ķ�ʽ����run������
	br.close();
	}

}
