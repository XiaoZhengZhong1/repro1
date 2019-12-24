package com.regex;

public class demo142_regex {

	public static void main(String[] args) {
/*##14.02_常见对象(字符类演示)
* A:字符类
	1* [abc] a、b 或 c（简单类） //表示正则表达式regex里面的三给值"a" "b" "c",用matches匹配的话,符合其中一个结果就是ture
	2* [^abc] 任何字符，除了 a、b 或 c（否定） //加了^就和上面相反,只要是"a" "b" "c"结果就是false,其它的就是true
	3* [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
	4* [0-9] 0到9的字符都包括*/
//	[a-d(f-j)]	a到d, 或者f到j.都是小写用()分开,说明d到f被去掉了.d和f之间是两组相交地方,相交的被去掉的叫并集
//	[a-z&&(ghy)a到z,并且只取"g""h"	"y".这三位是相交里面的,相交的被保留叫交集.
//	[a-z[^bc]]	a到z,除去b和c
//	[a-z[^m-p]	a到z,除去m到p之间包括m和p.
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
