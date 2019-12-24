package com.demo.string;

public class text2 {

	public static void main(String[] args) {
/*题目:遍历字符串
		charAt();//遍历索引的每个字符
		
*/
	String arr = "helloword";
	
	for(int i = 0;i < arr.length();i++){	//length();表示字符串长度
		char a = arr.charAt(i);				//因为单个字符是char类型的
			System.out.print(a + ",");
			
		}
	}

}
