package com.regex;

public class demo146_replace {

	public static void main(String[] args) {
/*###14.07_常见对象(正则表达式的替换功能)
* A:正则表达式的替换功能
	* String类的功能：public String replaceAll(String regex,String replacement)
* B:案例演示
	* 正则表达式的替换功能*/
	String a = "wo 1 ai 2 lei 3 ge";
	String regex = "\\d";	//代表任意数字.
	String a1 = a.replaceAll(regex, "_");/*all是全部的意思,replaceAll就是替换全部的意思.
											a.replaceAll(regex, "")意思是替换a中的全部regex数字,用""空窜替换 */
	System.out.println(a1);
	}

}
