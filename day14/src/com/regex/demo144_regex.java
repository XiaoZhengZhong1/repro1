package com.regex;

public class demo144_regex {

	public static void main(String[] args) {
	/*	###14.04_��������(������)
	        				 * A:Greedy ������ 
String regex = "[x]?";		1* X? X����ʾx����һ�λ�һ��Ҳû��    Ҳ����˵"[x]?"��"[""]?"����������true
String regex = "[x]*";	    2* X* X����λ��� ,ע��֮ǰһֱ���ǵ����ַ�,������Գ��ֶ���ַ�����"[xxxxxx]"���Ҳ��true
String regex = "[x]+";		3 * X+ X��һ�λ���
String regex = "[xxx]{3}";	4* X{n} X��ǡ�� n �� �������true
String regex = "[xxx]{3,}";	  5* X{n,} X������ n �� ����,�ű�ʾֻ��n�ε������,�������true
String regex = "[xxx{3,10}]";	6 * X{n,m} X������ n �Σ����ǲ����� m �� ,����n��m,�������true
String regex = "(.)\\1+";	//��ʾ�����ظ���ε���1     $1�Ǳ���,�����ظ��Ķ�����.�������滻��						
	*/
		//2
		String regex2 = "[x]*";	
		System.out.println("xxxxxxx".matches(regex2));//ture
		String regex22 = "[xyz]*";	
		System.out.println("xxxzzzzxxyyyxx".matches(regex22));//ture
	}

}
