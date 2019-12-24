/*
###04.11_Java语言基础(循环结构循环嵌套输出4行5列的星星)
* A:案例演示
	* 需求：请输出一个4行5列的星星(*)图案。
	* 
			如图：
				*****
				*****
				*****
				*****
				
			注意：
				System.out.println("*");和System.out.print("*");的区别
* B:结论：
	* 外循环控制行数，内循环控制列数

###04.12_Java语言基础(循环结构循环嵌套输出正三角形)
* A:案例演示
* 
		需求：请输出下列的形状
		*
		**
		***
		****
		*****


*/

/*class ForFor 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <=3 ;a++ )
			{System.out.println("0");
			for (int b = 1;b <= 5;b++ ){		/*此行就是嵌套进去的.在for的大括号里面再加for,叫外循环控制内循环.就是嵌套进去的整个for语句都是一个循环体,
				System.out.println("1");		就是外行for循环一次,内循环for就会执行完整个循环过程,再又回到外循环for外循环执行第二次外循环.内循环再次执行完
		}										整个循环过程.又回到外循环......直到外循环结束每次都会执行完整个内循环,
		}										输出结果是:011111011111011111011111
		
	}*/		
//}
class ForFor 
{
	public static void main(String[] args) 
	{
		for (int a = 1;a <=3 ;a++ )
			{System.out.print("0");
			for (int b = 1;b <= 5;b++ ){
				System.out.println("1");
		}
		}
		
	}
}
