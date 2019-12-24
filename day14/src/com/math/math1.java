package com.math;

public class math1 {

	public static void main(String[] args) {

/*###14.11_常见对象(Math类概述和方法使用)
* A:Math类概述
	* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
* B:成员方法
	* public static int abs(int a)------取绝对值如a=-10 输出结果就是10.
	* public static double ceil(double a)-----ceil是天花板意思,向上取整值的意思如a=10.1向上取整值输出结果是11.0
	* public static double floor(double a)-----floor是地板的意思.向下取整值的意思a=10.1向下取整值输出结果是10.0
	* public static int max(int a,int b)------- min自学
	* public static double pow(double a,double b)
	* public static double random()
	* public static int round(float a) 参数为double的自学.
	* public static double sqrt(double a)
	*/
		Math.abs(-10);//------取绝对值如a=-10 输出结果就是10.
		Math.ceil(10.1);//-----ceil是天花板意思,向上取整值的意思如a=10.1向上取整值输出结果是11.0
		Math.floor(10.1);//-----floor是地板的意思.向下取整值的意思a=10.1向下取整值输出结果是10.0
		Math.max(10,20);//------- max是最大的意思.取最大值.min就是取最小值.
		Math.pow(2,3);//-----------2*2*2.2的3次方的意思.输出结果是8
System.out.println(Math.random());//------表示随机生成0.0到0.1之间的所有小数,包头不包尾.0.45038833405627177

		Math.round(10.3);//------四舍五入的意思 
		Math.sqrt(2);//----------根号开平方的意思,
	
	
	
	
	}

}
