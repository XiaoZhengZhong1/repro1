/*
#05.07_Java语言基础(数组的初始化静态初始化及内存图)(掌握)
* A:静态初始化的格式：
	* 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
	* 简化格式：
		* 数据类型[] 数组名 = {元素1,元素2,…};
* B:案例演示
	* 对数组的解释
	* 输出数组名称和数组元素
* C:画图演示
	* 一个数组
*/
class DemoArray1 {
	public static void main(String[] args) {
 //A:静态初始化的格式：
		int[] arr = new int[]{11,22,33,44,}; //注意如果在new int[4]的括号里加上数字4,就成了动态输入了,整行代码就成动静结合了,就会报错,
 // 简化格式：	
/*		int[] arr2 ={55,66,77,88,};			//简化格式是常用的类型.
											//静态初始化和简化的区别,  静态初始化可以先声明再赋值.而简化,声明和赋值必须在同一行,
		System.out.println(arr[0]);			//	int[] arr;						//先声明.再赋值
		System.out.println(arr[1]);			//	 arr = new int[]{11,22,33,44,}; //再赋值
		System.out.println(arr[2]);			//
		System.out.println(arr[3]);			//	int[] arr2 ={55,66,77,88,};		//声明和赋值必须在同一行,
	    System.out.println(arr2[0]);		//	
		System.out.println(arr2[1]);		//
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
*/	
/*	输出结果
11
22
33
44
55
66
77
88
请按任意键继续. . .
*/
	
	
	
	
	
	
	
	
	}
}
