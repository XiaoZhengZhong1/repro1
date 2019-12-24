package com.regex;

public class demo144_regex {

	public static void main(String[] args) {
	/*	###14.04_常见对象(数量词)
	        				 * A:Greedy 数量词 
String regex = "[x]?";		1* X? X，表示x出现一次或一次也没有    也就是说"[x]?"和"[""]?"输出结果都是true
String regex = "[x]*";	    2* X* X，零次或多次 ,注意之前一直都是单个字符,这里可以出现多个字符了如"[xxxxxx]"结果也是true
String regex = "[x]+";		3 * X+ X，一次或多次
String regex = "[xxx]{3}";	4* X{n} X，恰好 n 次 结果才是true
String regex = "[xxx]{3,}";	  5* X{n,} X，至少 n 次 加了,号表示只是n次到无穷大,结果才是true
String regex = "[xxx{3,10}]";	6 * X{n,m} X，至少 n 次，但是不超过 m 次 ,包含n和m,结果才是true
String regex = "(.)\\1+";	//表示单个重复多次的组1     $1是本我,就是重复的对象本身.用来做替换用						
	*/
		//2
		String regex2 = "[x]*";	
		System.out.println("xxxxxxx".matches(regex2));//ture
		String regex22 = "[xyz]*";	
		System.out.println("xxxzzzzxxyyyxx".matches(regex22));//ture
	}

}
