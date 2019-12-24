package com.test;

public class test05 {
	/*###23.05_递归练习(斐波那契数列)
	* 不死神兔
	* 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
	* 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
	* 1 1 2 3 5 8 13
	* 第一个月一对小兔子					1
	* 第二个月一对大兔子					1
	* 第三个月一对大兔子生了一对小兔子		2
	* 第四个月一对大兔子生了一对小兔子
	* 		 一对小兔子长成大兔子			3
	* 第五个月两对大兔子生两对小兔子	
	* 		 一对小兔子长成大兔子			5*/
	public static void main(String[] args) {
		

	System.out.println(getNum(12));
	}
  //用递归的方法演示,求一年繁殖兔子的数量.
	public static int getNum(int num) {
    	if(num == 1 || num == 2){
    		return 1;
    	}else{
    		return getNum(num - 2) + getNum(num - 1);/*调Debug证明,赋值12后到递归这里,还是会减到num=1和 num=2的
    		位置开始计算出num=3.4.5.6....的值,最后再算num=12的值,*/
    	}
    
    
    }
//demo();定义遍历数组的方法,求一年繁殖兔子的数量.
	public static void demo() {
		int[] in = new int[12];
		in[0] = 1;
		in[1] = 1;
		for (int i = 2; i < in.length; i++) {
			in[i] = in[i-2] + in[i-1];
			}
		System.out.println(in[in.length - 1]);	//打印数组中最后一个的
	}

}
