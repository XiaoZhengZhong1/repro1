package com.test;

public class test07 {
	/*###23.07_�ݹ���ϰ(1000�Ľ׳�β����ĸ���)
	* ����:���1000�Ľ׳�β����ĸ���,�õݹ���*/
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
