package com.demo.string;

public class demo5_string {
//��ȡ�ַ�������,��ʽ:������.length  ����ֵ��int����
	public static void main(String[] args) {
		/*int[] a = {11,22,33,44,55,66,77,88}; 
			System.out.println(a.length);//��ȡ�ַ�������*/
//��ȡָ������λ�õ��ַ�:
//ע��������һ������ָ����.
String b = "helloword,oknea";
//System.out.println(b.charAt(7));//��ȡָ������λ�õ��ַ�.��ʽ: ������.charAt(����);
//System.out.println(b.indexOf('o'));	//��ȡָ���ַ�,�ڴ��ַ����е�����.��ʽ: ������.indexOf(�ַ�);
//System.out.println(b.indexOf("ow"));	//��ȡָ���ַ� ��,�ڴ��ַ����е�����.��ʽ: ������.indexOf(�ַ���);
//System.out.println(b.indexOf('o',5));	//��ȡָ���ַ�,�ڴ��ַ�����ָ��������λ�ÿ�ʼ.�����һ���ڴ��ַ����г��ֵ�λ��
										//��ʽ: ������.indexOf(�ַ�,����);
//System.out.println(b.indexOf("ord",5));	//��ȡָ���ַ���,�ڴ��ַ�����ָ��������λ�ÿ�ʼ.�����һ���ڴ��ַ����г��ֵ�λ��
											//��ʽ: ������.indexOf(�ַ���,����);
	
//System.out.println(b.substring(5));//��ָ������λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ���β.��ʽ: ������.substring(����);
System.out.println(b.substring(5,8));//��ָ������λ�ÿ�ʼ��ȡ�ַ���,��ָ����������.��ʽ: ������.substring(��ʼ����,��������);
	
//2:Stringȥ���ո񷽷�,c.trim(); String���滻����,c.replace(�ɵ�, �µ�)
	String c = "  helloword    ";
	System.out.println(c.trim());//��ȥ��ǰ��Ŀո�,����������ȥ����������֮���,���׷��ֵĿո�.c.trim()
	System.out.println(c.replace("he", "nu"));//String���滻����,c.replace(�ɵ�, �µ�)
	}	
			
	
}	
	
	
	
	
	
	


