package com.demo.string;

public class demo1_string {
/*string�౻final����,���ܱ��̳�.
	a:�ַ�������ֵ"abc",���Կ���һ���ַ�������.
	b:�ַ����ǳ���,һ����ֵ,�Ͳ��ܱ��ı�.

*/
	public static void main(String[] args) {
		String a = "abc";	//"abc",�������ַ�������.����new,�ַ����������ֱ����""��ʾ,
			a = "def";		//def��ֵ��a,ԭ���Ķ���abc�ͱ��������,def�ı����ֵ,��ֵַû��.
	System.out.println(a);
	System.out.println(a.toString());	//��Ϊ���к��������н��һ��,��������string��д��tostring����,���ص��Ǹö�����
	//����ַ��������S@5876֮����ָ.˵��û����дtostring����.����ַ����������ö�����.˵����д��tostring����
	}

}
