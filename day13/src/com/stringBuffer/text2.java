package com.stringBuffer;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
/*##13.09_常见对象(字符串反转)
* A:案例演示
* 
		需求：把字符串反转
			举例：键盘录入"abc"		
输出结果："cba"
	
用StringBuffer的功能实现	
*/
//方法1 转换和反转
	Scanner sc = new Scanner(System.in);		//创建键盘录入对象.
		String a = sc.nextLine();				//键盘录入到string a 中.Line可以录入任意类型的数据.
	/*StringBuffer a1 = new StringBuffer(a);	//用构造方法将String转换成StringBuffer
		a1.reverse();							//StringBuffer 反转方法reverse()
	System.out.println(a1);
	sc.close();				*/					//结束键盘录入.

		
		
	
		
	System.out.println(reverseString(a));		//调用反转方法.
	sc.close();									//结束键盘录入.
	}
//方法2,用一个专门的方法,这样做的好处是可以提取方法到别的项目里也能用.	
	public static String reverseString(String a){	//反转方法
		StringBuffer a2 = new StringBuffer(a);		//构造方法转换
			a2.reverse();							//反转a2
				return a2.toString();				//返回转换成string,用toString转换.的a2
		
	}
	
	
	
	
	
}
