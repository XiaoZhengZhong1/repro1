package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo148_matcher_Pattern {

	public static void main(String[] args) {
/*###14.09_��������(Pattern��Matcher�ĸ���)
* A:Pattern��Matcher�ĸ���
* B:ģʽ��ƥ�����ĵ��͵���˳��
	* ͨ��JDK�ṩ��API���鿴Pattern���˵��

java.util.regex //��ʾPattern��������ʽ���µ���.
�� Pattern

* ���͵ĵ���˳���� 
1:Pattern���͵���˼��java.util.regex���µ�һ����.
2:compile�Ǳ������˼,��Pattern���еķ���. compile(String regex, int flags) ��������������ʽ���뵽���и�����־��ģʽ�С�
3:"a*b"������ʽ,��ʾa����0�λ��߶��,���и�b.
4:Matcherƥ����,Ҳ��java.util.regex ���µ�һ����,matcher(CharSequence input) ����ƥ������������ģʽ��ƥ������
Ҳ��Pattern���еķ���.
5:*matches�������˼.matcher(CharSequence input)�������������ʽ�����Խ�������������ƥ��,��Pattern���еķ���.����ֵ��Matcher 
* 
* 
* 
* Pattern p = Pattern.compile("a*b");
* Matcher m = p.matcher("aaaaab");
* boolean b = m.matches();*/
//���·���������Ҫ����.Shift+Ctil+o		
	/*	  Pattern p = Pattern.compile("a*b");//��ʾ�������ñ��뷽��,����������ʽ,��ֵ��p.
		  Matcher m = p.matcher("aaaaab");	//p���ô�������ƥ��������,ƥ���������ַ�������,��p�Ͳ�������mƥ������.
		  boolean b = m.matches();	//m����ƥ�䷽��,ƥ��m�е�p���ַ���,����һ��boolea�͵Ľ����ֵ��b
		  System.out.println(b);
	//������ô�Ѿ���������һ�д������˼���ַ���ƥ������
		  System.out.println("aaaaab".matches("a*b"));
	*/
/*  B:������ʾ
	* ���󣺰�һ���ַ����е��ֻ������ȡ����	
*/
	String a = "�ҵ��ֻ�������13488888888,�ڸ���ֻ�����15899999999,naoofjii18566666666";
	String regex = "1[3587]\\d{9}";				//��˼�������ֵ������1��ͷ�ڶ�λ��3587�е�һ��,���������������������9��,
	 Pattern a1 = Pattern.compile(regex);		//��ȡ����
	 Matcher a2 = a1.matcher(a);				//��ȡ������.
	/* 		a2.find();					ƥ��a�ַ���������regex,find�ҵ�����˼,��matcher���е�һ������,
									�����������ַ��������Լ�����,������ʽregex��һ���ֻ���,����������϶�Ҳ��һ���ֻ���.
	String a3 =	a2.group();				//��ʾ����ƥ����,group()�ǻ�ƥ����,Ҳ��mather���һ������.
	System.out.println(a3);	*/			//������:13488888888,ֻ�ҵ���һ������,��Ϊ����ֻ��ȡ��һ������ͱ�����.

//������һ��ֻ�ܻ�ȡһ������,ÿ���ҵķ�����һ��.���Ǿ���ѭ����,
	while(a2.find())	/*��ʾ���ƥ���ҵ�����������,�ͼ���ִ��.��a1��a���Ѿ���a2ƥ��������,find������a2�����������
															ע����ѭ�����û�д�����,��ô�ж�������㽫ִ������Ĵ���.*/
		System.out.print(a2.group()+",");//�����ҵ������a2,������.group()���ؽ������˼
	//13488888888,15899999999,18566666666,
	
	
	}

}
