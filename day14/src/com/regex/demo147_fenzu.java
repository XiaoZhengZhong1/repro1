package com.regex;

public class demo147_fenzu {

	public static void main(String[] args) {
/*###14.08_��������(������ʽ�ķ��鹦��)
* A:������ʽ�ķ��鹦��
	* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		����ʼ�մ����������ʽ��
B:������ʾ
	a:�и�
		�����밴�յ����и "sdqqfgkkkhjppppkl";
b:�滻
	��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
	���ַ�����ԭ��:����Ҫѧ��̡���*/
//��С����,�м���С����,���м�������.��һ�߾�����.	
//���������ظ�һ��.	
	String regex = "(.)\\1";	//.�����κ��ַ�,\\1��ʾǰ����ַ��ֳ���һ��.
	System.out.println("aa".matches(regex));//��ʾ��Stringƥ�䷽��,"aa"ƥ���������������ʽ        ������:true
//��������ֱ��ظ�һ��.	
	String regex1 = "(.)\\1(.)\\2";	//��ʾ��1���ظ�1��,��2���ظ�1��
	System.out.println("aabb".matches(regex1));// ������:true
//��������ֱ��ظ����.	
	String regex2 = "(.)\\1+(.)\\2+";	//+�ű�ʾ���.��1���ظ����,��2���ظ����
	System.out.println("aaaaaaaabbbbbbbbbb".matches(regex2));// ������:true
//�����������������ַ��ظ�һ��.	
	String regex3 = "(..)\\1";	//��ʾ���������ַ�,�ظ�һ��.
	System.out.println("abab".matches(regex3));	// ������:true
//�����������������ַ��ظ����.		
	String regex4 = "(..)\\1+";	//��ʾ���������ַ�,�ظ�һ��.
	System.out.println("ababababababab".matches(regex4));	// ������:true
/*
B:������ʾ
	a:�и�
		�����밴�յ����и "sdqqfgkkkhjppppkl";
*/
	String a = "sdqqfgkkkhjppppkl";
	String regex5 = "(.)\\1+";
	String[] a1 = a.split( regex5);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
/*
 * b:�滻
	��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
 * */	
//String regex7 = "(.)\\1+"	//��ʾ�����ظ���ε���1     $1�Ǳ���,�����ظ��Ķ�����.�������滻��
	String a2 = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
	String regex6 = "\\.+";	//��ʾ�����ظ�һ�λ��߶�εĵ����ַ�
	String a3 = a2.replaceAll(regex6, "");//��ʾ�滻ȫ���ظ�һ�λ��߶�εĵ����ַ�,�ÿմ�""�滻
	System.out.println(a3);//��������ҪҪҪҪѧѧѧѧ�����̳̳̳�
	String regex7 = "(.)\\1+"; //��ʾ�����ظ���εĵ����ַ�.
	String a4 = a3.replaceAll(regex7, "$1");//��ʾ�滻ȫ�������ظ���ε��ַ�,��$1(����),����1���鱾��,�����ظ�������.
	System.out.println(a4);	//��Ҫѧ���
	
	
	}

}
