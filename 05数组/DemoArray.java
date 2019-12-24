/*
###05.01_Java语言基础(数组概述和定义格式说明)(了解)
* A:为什么要有数组(容器)
	* 为了存储同种数据类型的多个值
* B:数组概念
	* 数组是存储同一种数据类型多个元素的集合。也可以看成是一个容器。
	* 数组既可以存储基本数据类型，也可以存储引用数据类型。

* C:数组定义格式
	数据类型[] 数组名 = new 数据类型[数组的长度];
###05.02_Java语言基础(数组的初始化动态初始化)(掌握)
* A:什么是数组的初始化
	* 就是为数组开辟连续的内存空间，并为每个数组元素赋予值 
* B:如何对数组进行初始化
	* a:动态初始化 只指定长度，由系统给出初始化值
		* int[] arr = new int[5]; 	
	* b:静态初始化 给出初始化值，由系统决定长度	
* C:动态初始化的格式：
	* 数据类型[] 数组名 = new 数据类型[数组长度];
* D:案例演示
	* 输出数组名称和数组元素
*/

//整数类型如;byte,short,int,long,数组里系统默认初始值0
//浮点小数型如;floa.double.数组里系统默认值是0.0
//布尔型boolean.数组里默认值是false
//字符型.char数组里默认值是"\u0000",代表转义成Unicode编码,四个0也是转义成两个字节,因为shar占两个自己字节,一个字节8个进制,计算16个进制,四个0表示16个进制

//这叫初始化,没有赋值,叫动态初始化
class DemoArray{ // arry数组的意思,// int[] arr = new int[5]; 这叫初始化,没有赋值,叫动态初始化,在内存中连续开辟5块空间.
//数据类型[] 数组名 = new 数据类型[数组的长度];
	  //int[] arr    = new    int       [5]
	  //int-数据类型  //new-创建新的实体或对象
      //[]-代表数组   //int-数据类型
	  //arr-合法标识符//5-代表数据长度,表示里面有5个数据
	public static void main(String[] args){
		 int[] arr = new int[5]; //左边表示,标识int类型的[](数组)arr.  右边意思是,创建一个int类型的5个空间的[](数组).把访问地址返回给左边的arr
			System.out.println(arr[0]);//意思是输出arr数组里的5个空间元素里的第一个0元素值,因为没有赋值,所以里面属于0,这个0 1 2 3 4.空间元素顺序也叫搜引
		//输出结果是 0 ,因为没有赋值,系统默认的整数类型的初始值都是0.如;byte,short,int,long,整数型
		//arr[0] = 10;	
	//System.out.println(arr[0]);//输出结果是10.因为上面已经赋值了
	//System.out.println(arr);	//输出结果 [I@15db9742 表示数组访问地址.因为上面已经创建了5个数组空间,赋值给arr了,
	 // [I@15db9742 I-就是int类型的缩写, [-是一维数组[]的意思,如果是[[就是二维数组,@是系统固定的,15db9742-是十六进制的访问地址,也就是数组的访问地址; 
/*	
##05.03_Java语言基础(Java中的内存分配以及栈和堆的区别)
* A:栈(掌握)
	* 存储局部变量 
* B:堆(掌握)
	* 存储new出来的数组或对象 
* C:方法区
	* 面向对象部分讲解 
* D:本地方法区
	* 和系统相关 
* E:寄存器
	* 给CPU使用
###05.04_Java语言基础(数组的内存图解1一个数组)(掌握)
* A:画图演示
	* 一个数组	*/									//计算机运行讲解
/*	public static void main(String[] args){			//1:main主方法进到 栈底 
		int[] aa = new int[3];						//2:方法里面的新键数组new int[3]和new int[4]到 堆 里新创建两个不同地址的存储空间,
	    int[] bb = new int[4];//该行和上行代码也叫两个引用两个数组
	System.out.println(aa);							//3:上面存储空间创建完成后会生成一个访问地址,返回给aa 可以打印输出
	System.out.println(bb);							//  上面存储空间创建完成后会生成一个访问地址,返回给bb 可以打印输出
		aa[0] = 10;					//4 :aa上面已经新创建了3个数组存储空间,也叫三个元素.新建数组元素默认排序是:0 1 2 3 4 ......因为创建了3个,计算0 1 2 
		aa[1] = 20;					//给aa数组中的1元素赋值.
		aa[2] = 30;					//给aa数组中的2元素赋值.
		bb[0] = 11;					//给b数组中的0元素赋值.
		bb[1] = 12;					//给bb数组中的1元素赋值.
		bb[2] = 13;					//给bb数组中的2元素赋值.
		bb[3] = 14;					//给bb数组中的4元素赋值.						
	
	System.out.println(aa[0]);		//5:输出数组中0元素的值.
	System.out.println(aa[1]);		//输出数组中1元素的值.
	System.out.println(aa[2]);		//输出数组中2元素的值.
	System.out.println(bb[0]);		//输出数组中0元素的值.
	System.out.println(bb[1]);		//输出数组中1元素的值.
	System.out.println(bb[2]);		//输出数组中2元素的值.
	System.out.println(bb[3]);	*/	//输出数组中3元素的值.如果输出[]里的存储空间元素值写错了就会报错;如下:
/*																			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
																			 //  at DemoArray.main(DemoArray.java:38)																								
	[I@15db9742																						
[I@6d06d69c																							
10																										
20
30
11
12
13
14
*/

//案例演示.两个引用,一个数组.
/*	int[] z = new int[2]; 
	int[] y = z; 
	z[0] = 10;
	z[1] = 20;
	y[0] = 30;
	y[1] = 40;
	System.out.println(z[0]);
	System.out.println(z[1]);
	System.out.println(y[0]);
	System.out.println(y[1]);
	*/
/*输出结果.因为int[] y = z;所以y和z共用一个存储空间.z先赋值,y后赋值.y的值把z的值覆盖了,所以输出的z和y的值都是y赋值的值
30
40
30
40	
*/	
	
/*
* a:ArrayIndexOutOfBoundsException:数组索引越界异常
		* 原因：你访问了不存在的索引。
	* b:NullPointerException:空指针异常
		* 原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		* int[] arr = {1,2,3};
		* arr = null;
		* System.out.println(arr[0]);*/	
	}
}
