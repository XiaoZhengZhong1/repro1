/*
###04.01_Java语言基础(循环结构概述和for语句的格式及其使用)
* A:循环结构的分类
	* for,while,do...while 
* B:循环结构for语句的格式：
* 
		for(初始化表达式;条件表达式;循环后的操作表达式) {
			循环体;
		}
* C执行流程：
	* a:执行初始化语句
	* b:执行判断条件语句,看其返回值是true还是false
		* 如果是true，就继续执行
		* 如果是false，就结束循环
	* c:执行循环体语句;
	* d:执行循环后的操作表达式
	* e:回到B继续。
* D:案例演示
	* 在控制台输出5次"helloworld"
	*/
	//class  For {
	//public static void main(String[] args) {
		//for (int a = 1;a <= 5 ;a++ )//句体执行流程,先执行int类型的值a=1,在执行a是否小于等于5,(如果是就继续往下执行,如果不是,就结束 .将输出空白.)
		//{							//再执行循环语句体,再执行循环后操作,即控制语句a++,再执行关系表达式,......
	//	System.out.println("Hello World!");//输出了5次 Hello World									   //直到执行了5次后,a=6 6<=5结果是false结束
	//	}//代码for循环语句,并且赋值也可以重复,因为每个for语句结束后变量值会被释放掉,不影响下个for语句的赋值
	//}//判断语句无论简单还是复杂,最终的结果都的boolean型
//}//for循环语句大括号可以省略,但建议不要省略				//有左大括号就没有分号有分号就没有左大括号



/*class For {
	public static void main(String[] args) {
	for (int b = 1;b <= 10 ;b++){
	System.out.println("b=" + b);}
	}
}*/


//问;for循环和while循环的区别
//答:for循环的变量值循环结束后不能再使用.而while的变量值循环结束后还能使用;for循环可以提高内存使用效率
class For {
	public static void main(String[] args) {
	for (int b = 1;b <= 10 ;b++){
	System.out.println("b=" + b);}
	//System.out.println("b=" + b);//此行会报错,因为for循环语句执行完后,变量值b就被释放了,不能再使用,(如果要使用还得重新标识int b)
System.out.println("----------------------------");
	int b = 1;
	while (b <= 10)
	{
	System.out.println("b=" + b);
	b++;
	}
System.out.println("----------------------------");

	System.out.println("b=" + b);//此行输出结果是b=11.表示上行变量值b最终的结果11,下行可以继续使用
	}
}
