package com.regex;

public class demo145_split {

	public static void main(String[] args) {
/*###14.05_��������(������ʽ�ķָ��)
* A:������ʽ�ķָ��
	* String��Ĺ��ܣ�public String[] split(String regex)
* B:������ʾ
	* ������ʽ�ķָ��

*/
//split:�Ƿֿ�,�п�����˼.��String���е��и�������ʽ�ķ���.String.split(regex)	
//Ҫ�п�һ���ַ���,Ҫ���������.�ַ����п������ַ���.���ص�Ҳ���ַ�������.	
	String a = "aaa bbb ccc ddd";		//�������.����,�����о�Ҫ��\\.�˱�ʾת��regex���.
	String[] b = a.split(" ");	//��ʾ�ӿո�ʼ�п�,��Ϊ�������ÿո����.
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]);
	}
	
	}

}
