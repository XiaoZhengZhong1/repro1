package com.regex;

public class demo142_regex {

	public static void main(String[] args) {
/*##14.02_��������(�ַ�����ʾ)
* A:�ַ���
	1* [abc] a��b �� c�����ࣩ //��ʾ������ʽregex���������ֵ"a" "b" "c",��matchesƥ��Ļ�,��������һ���������ture
	2* [^abc] �κ��ַ������� a��b �� c���񶨣� //����^�ͺ������෴,ֻҪ��"a" "b" "c"�������false,�����ľ���true
	3* [a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ�� 
	4* [0-9] 0��9���ַ�������*/
//	[a-d(f-j)]	a��d, ����f��j.����Сд��()�ֿ�,˵��d��f��ȥ����.d��f֮���������ཻ�ط�,�ཻ�ı�ȥ���Ľв���
//	[a-z&&(ghy)a��z,����ֻȡ"g""h"	"y".����λ���ཻ�����,�ཻ�ı������н���.
//	[a-z[^bc]]	a��z,��ȥb��c
//	[a-z[^m-p]	a��z,��ȥm��p֮�����m��p.
		//1
		String regex1 = "[abc]";
		System.out.println("a".matches(regex1));//true
		//2
		String regex2 = "[^abc]";
		System.out.println("a".matches(regex2));//false
		//3
		String regex3 = "[a-zA-z]";
		System.out.println("a".matches(regex3));//true

	}

}
