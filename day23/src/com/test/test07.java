package com.test;

public class test07 {
	/*###23.07_递归练习(1000的阶乘尾部零的个数)
	* 需求:求出1000的阶乘尾部零的个数,用递归做*/
	public static void main(String[] args) {
	System.out.println(fun(1000));
	}

	public static int fun(int num) {
		if(num > 0 && num < 5){
			return 0;
		}else{
			return (num / 5) + fun(num / 5);
		}
	
	
	}

}
